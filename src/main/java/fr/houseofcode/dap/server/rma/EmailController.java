package fr.houseofcode.dap.server.rma;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.houseofcode.dap.server.rma.google.GmailService;

/**
 * @author rma.
 * 5 august. 2019
 */
@RestController
public class EmailController {

    /**
     * object GmailService.
     */
    @Autowired
    private GmailService gmailService;

    /**
     * number of unread email on mailbox.
     * @return number of unread email
     * @param userKey accept name of person who use the application
     * @throws IOException exception
     * @throws GeneralSecurityException exception
     */
    @RequestMapping("/email/nbUnread")
    public Integer displayNbUnreadEmail(@RequestParam final String userKey)
            throws IOException, GeneralSecurityException {

        return gmailService.getNbUnreadEmail(userKey);

    }

    /**
     * @return label from mailbox.
     * @param userKey accept name of person who use the application
     * @throws IOException exception
     * @throws GeneralSecurityException exception
     */
    @RequestMapping("/label/print")
    public String displayLabel(@RequestParam final String userKey)
            throws IOException, GeneralSecurityException {
        return gmailService.getLabels(userKey);

    }

}
