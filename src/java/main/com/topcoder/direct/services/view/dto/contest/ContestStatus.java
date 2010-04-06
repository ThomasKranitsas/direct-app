/*
 * Copyright (C) 2010 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.direct.services.view.dto.contest;

/**
 * <p>An enumeration over the possible types of statuses of the contests.</p>
 *
 * @author isv
 * @version 1.0
 */
public enum ContestStatus {

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Draft</code> contest status.</p>
     */
    DRAFT("Draft", "draft", "Edit"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Running</code> contest status.</p>
     */
    RUNNING("Running", "running", "View"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Submission</code> contest status.</p>
     */
    SUBMISSION("Submission", "running", "View"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Registration</code> contest status.</p>
     */
    REGISTRATION("Registration", "running", "View"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Active</code> contest status.</p>
     */
    INACTIVE("Inactive", "running", "View"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Deleted</code> contest status.</p>
     */
    DELETED("Deleted", "running", "View"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Milestone</code> contest status.</p>
     */
    MILESTONE("Milestone", "milestone", "Milestone"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Awarding</code> contest status.</p>
     */
    AWARDING("Awarding", "awarding", "Awarding"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Review</code> contest status.</p>
     */
    REVIEW("Review", "review", "Review"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Active</code> contest status.</p>
     */
    ACTIVE("Active", "Active", "Active"),

     /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Action Required</code> contest status.</p>
     */
    ACTION_REQUIRED("Action Required", "Action Required", "Action Required"),
    
     /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Completed</code> contest status.</p>
     */
    COMPLETED("Completed", "Completed", "Completed"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Scheduled</code> contest status.</p>
     */
    SCHEDULED("Scheduled", "Scheduled", "Scheduled"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Scheduled</code> contest status.</p>
     */
    IN_DANGER("In Danger", "In Danger", "In Danger"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>No Submissions - Repost</code> contest status.</p>
     */
    NO_SUBMISSIONS_REPOST("No Submissions - Repost", "No Submissions - Repost", "No Submissions - Repost"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Unactive - Not Yet Published</code> contest status.</p>
     */
    UNACTIVE("Unactive - Not Yet Published", "Unactive - Not Yet Published", "Unactive - Not Yet Published"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Active - Public</code> contest status.</p>
     */
    ACTIVE_PUBLIC("Active - Public", "Active - Public", "Active - Public"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>No Winner Chosen</code> contest status.</p>
     */
    NO_WINNER_CHOSEN("No Winner Chosen", "No Winner Chosen", "No Winner Chosen"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Insufficient Submissions - ReRun Possible</code> contest status.</p>
     */
    INSUFFICIENT_SUBMISSIONS("Insufficient Submissions - ReRun Possible", "Insufficient Submissions - ReRun Possible", "Insufficient Submissions - ReRun Possible"),

     /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Extended</code> contest status.</p>
     */
    EXTENDED("Extended", "Extended", "Extended"),

    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Abandoned</code> contest status.</p>
     */
    ABANDONED("Abandoned", "Abandoned", "Abandoned"),
   
    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Cancelled</code> contest status.</p>
     */
    CANCELLED("Cancelled", "Cancelled", "Cancelled"),

     /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Terminated</code> contest status.</p>
     */
    TERMINATED("Terminated", "Terminated", "Terminated"),



    /**
     * <p>A <code>ContestStatus</code> corresponding to <code>Failed Review</code> contest status.</p>
     */
    FAILED_REVIEW("Failed Review", "failedReview", "Failed Review");

    /**
     * <p>A <code>String</code> providing the state name. Such a name serves as a textual presentation of the status.
     * </p>
     */
    private String name;

    /**
     * <p>A <code>String</code> providing the status short name. Such a short name serves as an ID of the status.</p>
     */
    private String shortName;

    /**
     * <p>A <code>String</code> providing the textual description of the action to be performed by user in context of
     * this contest status.</p>
     */
    private String actionText;

    /**
     * <p>Constructs new <code>ContestStatus</code> instance with specified parameters.</p>
     *
     * @param name a <code>String</code> providing the status name. Such a name serves as a textual presentation of
     *        the status.
     * @param shortName a <code>String</code> providing the status short name. Such a short name serves as an ID of the
     *        status.
     * @param actionText a <code>String</code> providing the textual description of the action performed by user in
     *        context of this activity.
     */
    private ContestStatus(String name, String shortName, String actionText) {
        this.name = name;
        this.shortName = shortName;
        this.actionText = actionText;
    }

    /**
     * <p>Gets the name of this status.</p>
     *
     * @return a <code>String</code> providing the status name. Such a name serves as a textual presentation of the
     *         status.
     */
    public String getName() {
        return name;
    }

    /**
     * <p>Gets the short name of this status.</p>
     *
     * @return a <code>String</code> providing the status short name. Such a short name serves as an ID of the status.
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * <p>Gets the action text of this activity.</p>
     *
     * @return a <code>String</code> providing the textual description of the action performed by user in context of
     *         this activity.
     */
    public String getActionText() {
        return actionText;
    }

    /**
     * <p>Gets the <code>ContestStatus</code> instance matching the specified name.</p>
     *
     * @param name a <code>String</code> providing the name for requested contest status.
     * @return an <code>ContestStatus</code> matching the specified name or <code>null</code> if there is none.
     */
    public static ContestStatus forName(String name) {
        ContestStatus[] statuses = ContestStatus.values();
        for (int i = 0; i < statuses.length; i++) {
            ContestStatus status = statuses[i];
            if (status.getName().equalsIgnoreCase(name)) {
                return status;
            }
        }
        return DRAFT;
    }
}
