package Projects.MyProject.Model;

public class Incident {
    private String serviceAffected;
    private String affectedCells;
    private String startEnd;
    private String selectedChannel;

    public String getAffectedCells3G() {
        return affectedCells3G;
    }

    public void setAffectedCells3G(String affectedCells3G) {
        this.affectedCells3G = affectedCells3G;
    }

    public String getAffectedCells4G() {
        return affectedCells4G;
    }

    public void setAffectedCells4G(String affectedCells4G) {
        this.affectedCells4G = affectedCells4G;
    }

    public String getSelectedChannel() {
        return selectedChannel;
    }

    public void setSelectedChannel(String selectedChannel) {
        this.selectedChannel = selectedChannel;
    }

    private String affectedCells3G;
    private String affectedCells4G;
    private String areaAffected;
    private String severityLevel;
    private String startDate;
    private String startTime;
    private String endDate;
    private String endTime;
    private String reasonOfProblem;
    private String incidentOwner;
    private String incidentResolutionManager;
    private String numberOfComplaints;
    private String priority; // New field
    private String networkType; // New field

    // Getters and Setters
    // ... (existing getters and setters)

    public String getServiceAffected() {
        return serviceAffected;
    }

    public void setServiceAffected(String serviceAffected) {
        this.serviceAffected = serviceAffected;
    }

    public String getAffectedCells() {
        return affectedCells;
    }

    public void setAffectedCells(String affectedCells) {
        this.affectedCells = affectedCells;
    }

    public String getAreaAffected() {
        return areaAffected;
    }

    public void setAreaAffected(String areaAffected) {
        this.areaAffected = areaAffected;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getReasonOfProblem() {
        return reasonOfProblem;
    }

    public void setReasonOfProblem(String reasonOfProblem) {
        this.reasonOfProblem = reasonOfProblem;
    }

    public String getIncidentOwner() {
        return incidentOwner;
    }

    public void setIncidentOwner(String incidentOwner) {
        this.incidentOwner = incidentOwner;
    }

    public String getIncidentResolutionManager() {
        return incidentResolutionManager;
    }

    public void setIncidentResolutionManager(String incidentResolutionManager) {
        this.incidentResolutionManager = incidentResolutionManager;
    }

    public String getNumberOfComplaints() {
        return numberOfComplaints;
    }

    public void setNumberOfComplaints(String numberOfComplaints) {
        this.numberOfComplaints = numberOfComplaints;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }
    public String getStartEnd() {
        return startEnd;
    }

    public void setStartEnd(String startEnd) {
        this.startEnd = startEnd;
    }

}
