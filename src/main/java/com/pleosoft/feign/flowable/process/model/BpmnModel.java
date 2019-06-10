/**
 * Copyright 2019 Pleo Soft d.o.o. (pleosoft.com)

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pleosoft.feign.flowable.process.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class BpmnModel {
	@JsonProperty("definitionsAttributes")
	@Valid
	private Map<String, List<ExtensionAttribute>> definitionsAttributes = null;

	@JsonProperty("processes")
	@Valid
	private List<Process> processes = null;

	@JsonProperty("locationMap")
	@Valid
	private Map<String, GraphicInfo> locationMap = null;

	@JsonProperty("labelLocationMap")
	@Valid
	private Map<String, GraphicInfo> labelLocationMap = null;

	@JsonProperty("flowLocationMap")
	@Valid
	private Map<String, List<GraphicInfo>> flowLocationMap = null;

	@JsonProperty("signals")
	@Valid
	private List<Signal> signals = null;

	@JsonProperty("pools")
	@Valid
	private List<Pool> pools = null;

	@JsonProperty("imports")
	@Valid
	private List<ModelImport> imports = null;

	@JsonProperty("interfaces")
	@Valid
	private List<ModelInterface> interfaces = null;

	@JsonProperty("globalArtifacts")
	@Valid
	private List<Artifact> globalArtifacts = null;

	@JsonProperty("resources")
	@Valid
	private List<org.springframework.core.io.Resource> resources = null;

	@JsonProperty("targetNamespace")
	private String targetNamespace = null;

	@JsonProperty("sourceSystemId")
	private String sourceSystemId = null;

	@JsonProperty("userTaskFormTypes")
	@Valid
	private List<String> userTaskFormTypes = null;

	@JsonProperty("startEventFormTypes")
	@Valid
	private List<String> startEventFormTypes = null;

	@JsonProperty("errors")
	@Valid
	private Map<String, String> errors = null;

	@JsonProperty("messages")
	@Valid
	private List<Message> messages = null;

	@JsonProperty("mainProcess")
	private Process mainProcess = null;

	@JsonProperty("messageFlows")
	@Valid
	private Map<String, MessageFlow> messageFlows = null;

	@JsonProperty("itemDefinitions")
	@Valid
	private Map<String, ItemDefinition> itemDefinitions = null;

	@JsonProperty("dataStores")
	@Valid
	private Map<String, DataStore> dataStores = null;

	@JsonProperty("namespaces")
	@Valid
	private Map<String, String> namespaces = null;

	public BpmnModel definitionsAttributes(Map<String, List<ExtensionAttribute>> definitionsAttributes) {
		this.definitionsAttributes = definitionsAttributes;
		return this;
	}

	public BpmnModel putDefinitionsAttributesItem(String key, List<ExtensionAttribute> definitionsAttributesItem) {
		if (this.definitionsAttributes == null) {
			this.definitionsAttributes = new HashMap<String, List<ExtensionAttribute>>();
		}
		this.definitionsAttributes.put(key, definitionsAttributesItem);
		return this;
	}

	/**
	 * Get definitionsAttributes
	 * 
	 * @return definitionsAttributes
	 **/

	@Valid

	public Map<String, List<ExtensionAttribute>> getDefinitionsAttributes() {
		return definitionsAttributes;
	}

	public void setDefinitionsAttributes(Map<String, List<ExtensionAttribute>> definitionsAttributes) {
		this.definitionsAttributes = definitionsAttributes;
	}

	public BpmnModel processes(List<Process> processes) {
		this.processes = processes;
		return this;
	}

	public BpmnModel addProcessesItem(Process processesItem) {
		if (this.processes == null) {
			this.processes = new ArrayList<Process>();
		}
		this.processes.add(processesItem);
		return this;
	}

	/**
	 * Get processes
	 * 
	 * @return processes
	 **/

	@Valid

	public List<Process> getProcesses() {
		return processes;
	}

	public void setProcesses(List<Process> processes) {
		this.processes = processes;
	}

	public BpmnModel locationMap(Map<String, GraphicInfo> locationMap) {
		this.locationMap = locationMap;
		return this;
	}

	public BpmnModel putLocationMapItem(String key, GraphicInfo locationMapItem) {
		if (this.locationMap == null) {
			this.locationMap = new HashMap<String, GraphicInfo>();
		}
		this.locationMap.put(key, locationMapItem);
		return this;
	}

	/**
	 * Get locationMap
	 * 
	 * @return locationMap
	 **/

	@Valid

	public Map<String, GraphicInfo> getLocationMap() {
		return locationMap;
	}

	public void setLocationMap(Map<String, GraphicInfo> locationMap) {
		this.locationMap = locationMap;
	}

	public BpmnModel labelLocationMap(Map<String, GraphicInfo> labelLocationMap) {
		this.labelLocationMap = labelLocationMap;
		return this;
	}

	public BpmnModel putLabelLocationMapItem(String key, GraphicInfo labelLocationMapItem) {
		if (this.labelLocationMap == null) {
			this.labelLocationMap = new HashMap<String, GraphicInfo>();
		}
		this.labelLocationMap.put(key, labelLocationMapItem);
		return this;
	}

	/**
	 * Get labelLocationMap
	 * 
	 * @return labelLocationMap
	 **/

	@Valid

	public Map<String, GraphicInfo> getLabelLocationMap() {
		return labelLocationMap;
	}

	public void setLabelLocationMap(Map<String, GraphicInfo> labelLocationMap) {
		this.labelLocationMap = labelLocationMap;
	}

	public BpmnModel flowLocationMap(Map<String, List<GraphicInfo>> flowLocationMap) {
		this.flowLocationMap = flowLocationMap;
		return this;
	}

	public BpmnModel putFlowLocationMapItem(String key, List<GraphicInfo> flowLocationMapItem) {
		if (this.flowLocationMap == null) {
			this.flowLocationMap = new HashMap<String, List<GraphicInfo>>();
		}
		this.flowLocationMap.put(key, flowLocationMapItem);
		return this;
	}

	/**
	 * Get flowLocationMap
	 * 
	 * @return flowLocationMap
	 **/

	@Valid

	public Map<String, List<GraphicInfo>> getFlowLocationMap() {
		return flowLocationMap;
	}

	public void setFlowLocationMap(Map<String, List<GraphicInfo>> flowLocationMap) {
		this.flowLocationMap = flowLocationMap;
	}

	public BpmnModel signals(List<Signal> signals) {
		this.signals = signals;
		return this;
	}

	public BpmnModel addSignalsItem(Signal signalsItem) {
		if (this.signals == null) {
			this.signals = new ArrayList<Signal>();
		}
		this.signals.add(signalsItem);
		return this;
	}

	/**
	 * Get signals
	 * 
	 * @return signals
	 **/

	@Valid

	public List<Signal> getSignals() {
		return signals;
	}

	public void setSignals(List<Signal> signals) {
		this.signals = signals;
	}

	public BpmnModel pools(List<Pool> pools) {
		this.pools = pools;
		return this;
	}

	public BpmnModel addPoolsItem(Pool poolsItem) {
		if (this.pools == null) {
			this.pools = new ArrayList<Pool>();
		}
		this.pools.add(poolsItem);
		return this;
	}

	/**
	 * Get pools
	 * 
	 * @return pools
	 **/

	@Valid

	public List<Pool> getPools() {
		return pools;
	}

	public void setPools(List<Pool> pools) {
		this.pools = pools;
	}

	public BpmnModel imports(List<ModelImport> imports) {
		this.imports = imports;
		return this;
	}

	public BpmnModel addImportsItem(ModelImport importsItem) {
		if (this.imports == null) {
			this.imports = new ArrayList<ModelImport>();
		}
		this.imports.add(importsItem);
		return this;
	}

	/**
	 * Get imports
	 * 
	 * @return imports
	 **/

	@Valid

	public List<ModelImport> getImports() {
		return imports;
	}

	public void setImports(List<ModelImport> imports) {
		this.imports = imports;
	}

	public BpmnModel interfaces(List<ModelInterface> interfaces) {
		this.interfaces = interfaces;
		return this;
	}

	public BpmnModel addInterfacesItem(ModelInterface interfacesItem) {
		if (this.interfaces == null) {
			this.interfaces = new ArrayList<ModelInterface>();
		}
		this.interfaces.add(interfacesItem);
		return this;
	}

	/**
	 * Get interfaces
	 * 
	 * @return interfaces
	 **/

	@Valid

	public List<ModelInterface> getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(List<ModelInterface> interfaces) {
		this.interfaces = interfaces;
	}

	public BpmnModel globalArtifacts(List<Artifact> globalArtifacts) {
		this.globalArtifacts = globalArtifacts;
		return this;
	}

	public BpmnModel addGlobalArtifactsItem(Artifact globalArtifactsItem) {
		if (this.globalArtifacts == null) {
			this.globalArtifacts = new ArrayList<Artifact>();
		}
		this.globalArtifacts.add(globalArtifactsItem);
		return this;
	}

	/**
	 * Get globalArtifacts
	 * 
	 * @return globalArtifacts
	 **/

	@Valid

	public List<Artifact> getGlobalArtifacts() {
		return globalArtifacts;
	}

	public void setGlobalArtifacts(List<Artifact> globalArtifacts) {
		this.globalArtifacts = globalArtifacts;
	}

	public BpmnModel resources(List<org.springframework.core.io.Resource> resources) {
		this.resources = resources;
		return this;
	}

	public BpmnModel addResourcesItem(org.springframework.core.io.Resource resourcesItem) {
		if (this.resources == null) {
			this.resources = new ArrayList<org.springframework.core.io.Resource>();
		}
		this.resources.add(resourcesItem);
		return this;
	}

	/**
	 * Get resources
	 * 
	 * @return resources
	 **/

	@Valid

	public List<org.springframework.core.io.Resource> getResources() {
		return resources;
	}

	public void setResources(List<org.springframework.core.io.Resource> resources) {
		this.resources = resources;
	}

	public BpmnModel targetNamespace(String targetNamespace) {
		this.targetNamespace = targetNamespace;
		return this;
	}

	/**
	 * Get targetNamespace
	 * 
	 * @return targetNamespace
	 **/

	public String getTargetNamespace() {
		return targetNamespace;
	}

	public void setTargetNamespace(String targetNamespace) {
		this.targetNamespace = targetNamespace;
	}

	public BpmnModel sourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
		return this;
	}

	/**
	 * Get sourceSystemId
	 * 
	 * @return sourceSystemId
	 **/

	public String getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public BpmnModel userTaskFormTypes(List<String> userTaskFormTypes) {
		this.userTaskFormTypes = userTaskFormTypes;
		return this;
	}

	public BpmnModel addUserTaskFormTypesItem(String userTaskFormTypesItem) {
		if (this.userTaskFormTypes == null) {
			this.userTaskFormTypes = new ArrayList<String>();
		}
		this.userTaskFormTypes.add(userTaskFormTypesItem);
		return this;
	}

	/**
	 * Get userTaskFormTypes
	 * 
	 * @return userTaskFormTypes
	 **/

	public List<String> getUserTaskFormTypes() {
		return userTaskFormTypes;
	}

	public void setUserTaskFormTypes(List<String> userTaskFormTypes) {
		this.userTaskFormTypes = userTaskFormTypes;
	}

	public BpmnModel startEventFormTypes(List<String> startEventFormTypes) {
		this.startEventFormTypes = startEventFormTypes;
		return this;
	}

	public BpmnModel addStartEventFormTypesItem(String startEventFormTypesItem) {
		if (this.startEventFormTypes == null) {
			this.startEventFormTypes = new ArrayList<String>();
		}
		this.startEventFormTypes.add(startEventFormTypesItem);
		return this;
	}

	/**
	 * Get startEventFormTypes
	 * 
	 * @return startEventFormTypes
	 **/

	public List<String> getStartEventFormTypes() {
		return startEventFormTypes;
	}

	public void setStartEventFormTypes(List<String> startEventFormTypes) {
		this.startEventFormTypes = startEventFormTypes;
	}

	public BpmnModel errors(Map<String, String> errors) {
		this.errors = errors;
		return this;
	}

	public BpmnModel putErrorsItem(String key, String errorsItem) {
		if (this.errors == null) {
			this.errors = new HashMap<String, String>();
		}
		this.errors.put(key, errorsItem);
		return this;
	}

	/**
	 * Get errors
	 * 
	 * @return errors
	 **/

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	public BpmnModel messages(List<Message> messages) {
		this.messages = messages;
		return this;
	}

	public BpmnModel addMessagesItem(Message messagesItem) {
		if (this.messages == null) {
			this.messages = new ArrayList<Message>();
		}
		this.messages.add(messagesItem);
		return this;
	}

	/**
	 * Get messages
	 * 
	 * @return messages
	 **/

	@Valid

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public BpmnModel mainProcess(Process mainProcess) {
		this.mainProcess = mainProcess;
		return this;
	}

	/**
	 * Get mainProcess
	 * 
	 * @return mainProcess
	 **/

	@Valid

	public Process getMainProcess() {
		return mainProcess;
	}

	public void setMainProcess(Process mainProcess) {
		this.mainProcess = mainProcess;
	}

	public BpmnModel messageFlows(Map<String, MessageFlow> messageFlows) {
		this.messageFlows = messageFlows;
		return this;
	}

	public BpmnModel putMessageFlowsItem(String key, MessageFlow messageFlowsItem) {
		if (this.messageFlows == null) {
			this.messageFlows = new HashMap<String, MessageFlow>();
		}
		this.messageFlows.put(key, messageFlowsItem);
		return this;
	}

	/**
	 * Get messageFlows
	 * 
	 * @return messageFlows
	 **/

	@Valid

	public Map<String, MessageFlow> getMessageFlows() {
		return messageFlows;
	}

	public void setMessageFlows(Map<String, MessageFlow> messageFlows) {
		this.messageFlows = messageFlows;
	}

	public BpmnModel itemDefinitions(Map<String, ItemDefinition> itemDefinitions) {
		this.itemDefinitions = itemDefinitions;
		return this;
	}

	public BpmnModel putItemDefinitionsItem(String key, ItemDefinition itemDefinitionsItem) {
		if (this.itemDefinitions == null) {
			this.itemDefinitions = new HashMap<String, ItemDefinition>();
		}
		this.itemDefinitions.put(key, itemDefinitionsItem);
		return this;
	}

	/**
	 * Get itemDefinitions
	 * 
	 * @return itemDefinitions
	 **/

	@Valid

	public Map<String, ItemDefinition> getItemDefinitions() {
		return itemDefinitions;
	}

	public void setItemDefinitions(Map<String, ItemDefinition> itemDefinitions) {
		this.itemDefinitions = itemDefinitions;
	}

	public BpmnModel dataStores(Map<String, DataStore> dataStores) {
		this.dataStores = dataStores;
		return this;
	}

	public BpmnModel putDataStoresItem(String key, DataStore dataStoresItem) {
		if (this.dataStores == null) {
			this.dataStores = new HashMap<String, DataStore>();
		}
		this.dataStores.put(key, dataStoresItem);
		return this;
	}

	/**
	 * Get dataStores
	 * 
	 * @return dataStores
	 **/

	@Valid

	public Map<String, DataStore> getDataStores() {
		return dataStores;
	}

	public void setDataStores(Map<String, DataStore> dataStores) {
		this.dataStores = dataStores;
	}

	public BpmnModel namespaces(Map<String, String> namespaces) {
		this.namespaces = namespaces;
		return this;
	}

	public BpmnModel putNamespacesItem(String key, String namespacesItem) {
		if (this.namespaces == null) {
			this.namespaces = new HashMap<String, String>();
		}
		this.namespaces.put(key, namespacesItem);
		return this;
	}

	/**
	 * Get namespaces
	 * 
	 * @return namespaces
	 **/

	public Map<String, String> getNamespaces() {
		return namespaces;
	}

	public void setNamespaces(Map<String, String> namespaces) {
		this.namespaces = namespaces;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BpmnModel bpmnModel = (BpmnModel) o;
		return Objects.equals(this.definitionsAttributes, bpmnModel.definitionsAttributes)
				&& Objects.equals(this.processes, bpmnModel.processes)
				&& Objects.equals(this.locationMap, bpmnModel.locationMap)
				&& Objects.equals(this.labelLocationMap, bpmnModel.labelLocationMap)
				&& Objects.equals(this.flowLocationMap, bpmnModel.flowLocationMap)
				&& Objects.equals(this.signals, bpmnModel.signals) && Objects.equals(this.pools, bpmnModel.pools)
				&& Objects.equals(this.imports, bpmnModel.imports)
				&& Objects.equals(this.interfaces, bpmnModel.interfaces)
				&& Objects.equals(this.globalArtifacts, bpmnModel.globalArtifacts)
				&& Objects.equals(this.resources, bpmnModel.resources)
				&& Objects.equals(this.targetNamespace, bpmnModel.targetNamespace)
				&& Objects.equals(this.sourceSystemId, bpmnModel.sourceSystemId)
				&& Objects.equals(this.userTaskFormTypes, bpmnModel.userTaskFormTypes)
				&& Objects.equals(this.startEventFormTypes, bpmnModel.startEventFormTypes)
				&& Objects.equals(this.errors, bpmnModel.errors) && Objects.equals(this.messages, bpmnModel.messages)
				&& Objects.equals(this.mainProcess, bpmnModel.mainProcess)
				&& Objects.equals(this.messageFlows, bpmnModel.messageFlows)
				&& Objects.equals(this.itemDefinitions, bpmnModel.itemDefinitions)
				&& Objects.equals(this.dataStores, bpmnModel.dataStores)
				&& Objects.equals(this.namespaces, bpmnModel.namespaces);
	}

	@Override
	public int hashCode() {
		return Objects.hash(definitionsAttributes, processes, locationMap, labelLocationMap, flowLocationMap, signals,
				pools, imports, interfaces, globalArtifacts, resources, targetNamespace, sourceSystemId,
				userTaskFormTypes, startEventFormTypes, errors, messages, mainProcess, messageFlows, itemDefinitions,
				dataStores, namespaces);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BpmnModel {\n");

		sb.append("    definitionsAttributes: ").append(toIndentedString(definitionsAttributes)).append("\n");
		sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
		sb.append("    locationMap: ").append(toIndentedString(locationMap)).append("\n");
		sb.append("    labelLocationMap: ").append(toIndentedString(labelLocationMap)).append("\n");
		sb.append("    flowLocationMap: ").append(toIndentedString(flowLocationMap)).append("\n");
		sb.append("    signals: ").append(toIndentedString(signals)).append("\n");
		sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
		sb.append("    imports: ").append(toIndentedString(imports)).append("\n");
		sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
		sb.append("    globalArtifacts: ").append(toIndentedString(globalArtifacts)).append("\n");
		sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
		sb.append("    targetNamespace: ").append(toIndentedString(targetNamespace)).append("\n");
		sb.append("    sourceSystemId: ").append(toIndentedString(sourceSystemId)).append("\n");
		sb.append("    userTaskFormTypes: ").append(toIndentedString(userTaskFormTypes)).append("\n");
		sb.append("    startEventFormTypes: ").append(toIndentedString(startEventFormTypes)).append("\n");
		sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
		sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
		sb.append("    mainProcess: ").append(toIndentedString(mainProcess)).append("\n");
		sb.append("    messageFlows: ").append(toIndentedString(messageFlows)).append("\n");
		sb.append("    itemDefinitions: ").append(toIndentedString(itemDefinitions)).append("\n");
		sb.append("    dataStores: ").append(toIndentedString(dataStores)).append("\n");
		sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
