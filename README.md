This library exposes an Spring Cloud OpenFeign implementation for Flowable Rest APIs.
You can add it to your dependencies and use it in a Spring Boot application for instance.
Spring Boot autoconfiguration is used and therefore no manual configuration is required.

You can use the library as some kind of aggregator or proxy to your Flowable instance. An HTTP proxy like
Apache/NGINX or a Tuckey web filter could be used to proxy the requests.

Maven (on Maven Central)
--
```
  <dependency>
    <groupId>com.pleosoft</groupId>
    <artifactId>flowable-feign-client</artifactId>
    <version>1.0.0-RELEASE</version>
  </dependency>
```

in application.properties
--
defaults are:
```
  flowable.feign.defaultAuthorization=
  flowable.feign.authorizationHeaderName=Authorization
  flowable.feign.url=
```

defaultAuthorization will only be used if authorizationHeaderName is missing a header value
however, both cannot be empty.

If you want to specify a default Authorization like admin:admin,
than you can use flowable.feign.defaultAuthorization and set to Basic Authorization like this
- flowable.feign.defaultAuthorization = Basic YWRtaW46YWRtaW4=
(YWRtaW46dGVzdA== is a base64 representation of admin:test)

Keycloack use a JWT and send it through the
Aturhotization header name, if for some reason you want to customize the header name use
- flowable.feign.authorizationHeaderName=MY_HEADER

Finally, specify yourFlowable host:
- flowable.feign.url=http://localhost:8080/flowable-task

in your java classes
--
```
	@Autowired
	private TasksApiClient tasks;

	...
	ResponseEntity<DataResponseTaskResponse> listTasks = tasks.listTasks(null, null, null, null, null, null,
				"admin", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null);
		DataResponseTaskResponse body = listTasks.getBody();
	...
```

API beans you can use
--
```
ProcessInstancesApiClient
ProcessInstanceIdentityLinksApiClient
ProcessEngineApiClient
ProcessDeploymentApiClient
ProcessDefinitionsApiClient
ModelsApiClient
JobsApiClient
HistoryTaskApiClient
HistoryProcessApiClient
HistoryApiClient
GroupsApiClient
FormsApiClient
ExecutionsApiClient
EventSubscriptionsApiClient
DatabaseTablesApiClient
ProcessInstanceVariablesApiClient
QueryApiClient
RuntimeApiClient
TaskAttachmentsApiClient
TaskCommentsApiClient
TaskIdentityLinksApiClient
TasksApiClient
TaskVariablesApiClient
UsersApiClient

ContentEngineApiClient
ContentItemApiClient

DecisionDeploymentApiClient
DecisionEngineApiClient
DecisionTablesApiClient
DmnRuleServiceApiClient
HistoricDecisionExecutionsApiClient

FormDefinitionsApiClient
FormDeploymentsApiClient
FormEngineApiClient
FormInstanceModelsApiClient
FormInstancesApiClient
FormModelsApiClient
```


