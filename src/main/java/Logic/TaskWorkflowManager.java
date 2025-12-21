package Logic;

import java.util.*;

// TaskWorkflowManager
// -------------------
// Manages workflow templates for different task types.
// Implements Singleton and Prototype patterns.

public class TaskWorkflowManager {
    private static TaskWorkflowManager instance;

    private Map<String, Map<String, Boolean>> workflowTemplates;

    private TaskWorkflowManager() {
        workflowTemplates = new HashMap<>();

        initializeTemplates();
    }

    public static TaskWorkflowManager getInstance() {
        if (instance == null)
            instance = new TaskWorkflowManager();
        return instance;
    }

    private void initializeTemplates() {
        // Bug Workflow
        Map<String, Boolean> bugFlow = new LinkedHashMap<>();
        bugFlow.put("New", false);
        bugFlow.put("In Progress", false);
        bugFlow.put("Code Review", false);
        bugFlow.put("Testing", false);
        bugFlow.put("Done", false);
        workflowTemplates.put("bug", bugFlow);

        // Feature Workflow
        Map<String, Boolean> featureFlow = new LinkedHashMap<>();
        featureFlow.put("Search", false);
        featureFlow.put("Optimize", false);
        featureFlow.put("In Development", false);
        featureFlow.put("Code Review", false);
        featureFlow.put("UAT", false);
        featureFlow.put("Done", false);
        workflowTemplates.put("feature", featureFlow);

        // Improvement Workflow
        Map<String, Boolean> impFlow = new LinkedHashMap<>();
        impFlow.put("Proposed", false);
        impFlow.put("Approved", false);
        impFlow.put("In Progress", false);
        impFlow.put("Done", false);
        workflowTemplates.put("improvement", impFlow);
    }

    public Map<String, Boolean> getWorkflowForType(String type) {
        Map<String, Boolean> template = workflowTemplates.get(type.toLowerCase());
        return template != null ? new LinkedHashMap<>(template) : new LinkedHashMap<>();
    }
}