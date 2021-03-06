/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.mongodb.repository.query;

import java.io.Serializable;

import org.springframework.data.repository.core.EntityInformation;

/**
 * Mongo specific {@link EntityInformation}.
 * 
 * @author Oliver Gierke
 */
public interface MongoEntityInformation<T, ID extends Serializable> extends EntityInformation<T, ID> {

	/**
	 * Returns the name of the collection the entity shall be persisted to.
	 * 
	 * @return
	 */
	String getCollectionName();

	/**
	 * Returns the attribute that the id will be persisted to.
	 * 
	 * @return
	 */
	String getIdAttribute();
	
	
	/**
	 * Returns the attribute that the version will be persisted to.
	 * 
	 * @return
	 */
	String getVersionAttribute();
	
	
	/**
	 * Returns the entity version.
	 * 
	 * @return
	 */
	Object getVersion(T entity);
	
	
	
	/**
	 * Returns whether entity has version. 
	 * 
	 * @param entity
	 * @return
	 */
	boolean hasVersion(T entity);
}