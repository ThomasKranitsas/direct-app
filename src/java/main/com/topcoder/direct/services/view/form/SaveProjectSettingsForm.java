/*
 * Copyright (C) 2011 - 2012 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.direct.services.view.form;

import com.topcoder.direct.services.project.metadata.entities.dao.DirectProjectMetadataKey;
import com.topcoder.direct.services.view.dto.project.edit.ProjectMetadataOperation;

import java.util.List;

/**
 * <p>
 *     The form data for the save operation and all the ajax operations in Edit Project Settings page.
 * </p>
 *
 * <p>
 *     Version 1.1 (Release Assembly - TC Cockpit Edit Project and Project General Info Update) change notes:
 *     - Add new form property projectRatings for saving project ratings in Edit Project Page.
 * </p>
 *
 * @author GreatKevin
 * @version 1.1
 */
public class SaveProjectSettingsForm extends ProjectIdForm {

    /**
     * The name of the project.
     */
    private String projectName;

    /**
     * The description of the project.
     */
    private String projectDescription;

    /**
     * The status id of the project.
     */
    private long projectStatusId;

    /**
     * The client managers of the project.
     */
    private List<ProjectMetadataOperation> clientManagers;

    /**
     * The topcoder managers of the project.
     */
    private List<ProjectMetadataOperation> projectManagers;

    /**
     * The budget of the project.
     */
    private ProjectMetadataOperation budget;

    /**
     * The planned duration of the project.
     */
    private ProjectMetadataOperation duration;

    /**
     * The svn address of the project.
     */
    private ProjectMetadataOperation svn;

    /**
     * The jira address of the project.
     */
    private ProjectMetadataOperation jira;

    /**
     * All the custom project metadata values.
     */
    private List<ProjectMetadataOperation> customMetadataValues;

    /**
     * The newly created custom metadata key.
     */
    private DirectProjectMetadataKey newCustomKey;
    
    /**
     * The privacy setting of the project.
     */
    private ProjectMetadataOperation privacy;


    /**
     * The project ratings of the project.
     * @since 1.1
     */
    private List<ProjectMetadataOperation> projectRatings;

    /**
     * Gets the name of the project.
     *
     * @return the name of the project.
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the name of the project.
     *
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * Gets the project description.
     *
     * @return the description of the project.
     */
    public String getProjectDescription() {
        return projectDescription;
    }

    /**
     * Sets the description of the project.
     *
     * @param projectDescription the description of the project.
     */
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    /**
     * Gets the status id of the project.
     *
     * @return the status id of the project.
     */
    public long getProjectStatusId() {
        return projectStatusId;
    }

    /**
     * Sets the status id of the project.
     *
     * @param projectStatusId the status id of the project.
     */
    public void setProjectStatusId(long projectStatusId) {
        this.projectStatusId = projectStatusId;
    }

    /**
     * Gets the client managers of the project.
     *
     * @return the client managers of the project.
     */
    public List<ProjectMetadataOperation> getClientManagers() {
        return clientManagers;
    }

    /**
     * Sets the client managers of the project.
     *
     * @param clientManagers the client managers of the project.
     */
    public void setClientManagers(List<ProjectMetadataOperation> clientManagers) {
        this.clientManagers = clientManagers;
    }

    /**
     * Gets the TopCoder project managers of the project.
     *
     * @return the TopCoder project managers of the project.
     */
    public List<ProjectMetadataOperation> getProjectManagers() {
        return projectManagers;
    }

    /**
     * Sets the TopCoder project managers of the project.
     *
     * @param projectManagers the TopCoder project managers of the project.
     */
    public void setProjectManagers(List<ProjectMetadataOperation> projectManagers) {
        this.projectManagers = projectManagers;
    }

    /**
     * Gets the budget.
     *
     * @return the budget of the project.
     */
    public ProjectMetadataOperation getBudget() {
        return budget;
    }

    /**
     * Sets the budget.
     *
     * @param budget the budget of the project.
     */
    public void setBudget(ProjectMetadataOperation budget) {
        this.budget = budget;
    }

    /**
     * Gets the planned duration of the project.
     *
     * @return the planned duration of the project.
     */
    public ProjectMetadataOperation getDuration() {
        return duration;
    }

    /**
     * Sets the planned duration of the project.
     *
     * @param duration the planned duration of the project.
     */
    public void setDuration(ProjectMetadataOperation duration) {
        this.duration = duration;
    }

    /**
     * Gets the svn address of the project.
     *
     * @return the svn address of the project.
     */
    public ProjectMetadataOperation getSvn() {
        return svn;
    }

    /**
     * Sets the svn address of the project.
     *
     * @param svn the svn address of the project.
     */
    public void setSvn(ProjectMetadataOperation svn) {
        this.svn = svn;
    }

    /**
     * Gets the JIRA address of the project.
     *
     * @return the jira address of the project.
     */
    public ProjectMetadataOperation getJira() {
        return jira;
    }

    /**
     * Sets the JIRA address of the project.
     *
     * @param jira the jira address of the project.
     */
    public void setJira(ProjectMetadataOperation jira) {
        this.jira = jira;
    }

    /**
     * Gets the privacy setting of the project.
     *
     * @return the privacy setting of the project.
     */
    public ProjectMetadataOperation getPrivacy() {
        return privacy;
    }

    /**
     * Sets the privacy setting of the project.
     *
     * @param privacy the privacy setting of the project.
     */
    public void setPrivacy(ProjectMetadataOperation privacy) {
        this.privacy = privacy;
    }

    /**
     * Gets the new created custom metadata key.
     *
     * @return the new created custom metadata key.
     */
    public DirectProjectMetadataKey getNewCustomKey() {
        return newCustomKey;
    }

    /**
     * Sets the new created custom metadata key.
     *
     * @param newCustomKey the new created custom metadata key.
     */
    public void setNewCustomKey(DirectProjectMetadataKey newCustomKey) {
        this.newCustomKey = newCustomKey;
    }

    /**
     * Gets the custom metadata values.
     *
     * @return the custom metadata values.
     */
    public List<ProjectMetadataOperation> getCustomMetadataValues() {
        return customMetadataValues;
    }

    /**
     * Sets the custom metadata values.
     *
     * @param customMetadataValues the custom metadata values.
     */
    public void setCustomMetadataValues(List<ProjectMetadataOperation> customMetadataValues) {
        this.customMetadataValues = customMetadataValues;
    }

    /**
     * Gets the project ratings of the project.
     *
     * @return the project ratings of the project.
     * @since 1.1
     */
    public List<ProjectMetadataOperation> getProjectRatings() {
        return projectRatings;
    }

    /**
     * Sets the project ratings of the project.
     *
     * @param projectRatings the project ratings of the project.
     * @since 1.1
     */
    public void setProjectRatings(List<ProjectMetadataOperation> projectRatings) {
        this.projectRatings = projectRatings;
    }
}