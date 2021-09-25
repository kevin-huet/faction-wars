package io.github.kevinhuet.factionwars.config;

import io.github.kevinhuet.factionwars.App;

import java.io.File;

public class MessageConfig extends Config {

    private static MessageConfig instance;

    /**
     * Instantiates a new Message config.
     */
    public MessageConfig() {
        super(new File(App.getPlugin().getDataFolder().getAbsolutePath()+"/messages.json"));
    }

    /**
     * Gets open great vault message.
     *
     * @return the open great vault message
     */
    public String getOpenGreatVaultMessage() {
        return "";
    }

    /**
     * Gets create faction message.
     *
     * @return the create faction message
     */
    public String getCreateFactionMessage() {
        return "";
    }

    /**
     * Gets disband faction message.
     *
     * @return the disband faction message
     */
    public String getDisbandFactionMessage() {
        return "";
    }

    /**
     * Gets invite player message.
     *
     * @return the invite player message
     */
    public String getInvitePlayerMessage() {
        return "";
    }

    /**
     * Gets receive invitation message.
     *
     * @return the receive invitation message
     */
    public String getReceiveInvitationMessage() {
        return "";
    }

    /**
     * Gets kick player message.
     *
     * @return the kick player message
     */
    public String getKickPlayerMessage() {
        return "";
    }

    /**
     * Gets promote player message.
     *
     * @return the promote player message
     */
    public String getPromotePlayerMessage() {
        return "";
    }

    /**
     * Gets demote player message.
     *
     * @return the demote player message
     */
    public String getDemotePlayerMessage() {
        return "";
    }

    /**
     * Gets change relation message.
     *
     * @return the change relation message
     */
    public String getChangeRelationMessage() {
        return "";
    }

    /**
     * Gets change other relation message.
     *
     * @return the change other relation message
     */
    public String getChangeOtherRelationMessage() {
        return "";
    }

    /**
     * Gets add owner message.
     *
     * @return the add owner message
     */
    public String getAddOwnerMessage() {
        return "";
    }

    /**
     * Gets remove owner message.
     *
     * @return the remove owner message
     */
    public String getRemoveOwnerMessage() {
        return "";
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static MessageConfig getInstance() {
        if (instance == null)
            instance = new MessageConfig();
        return instance;
    }
}
