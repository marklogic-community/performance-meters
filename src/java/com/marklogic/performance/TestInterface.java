/*
 * Copyright (c)2005-2010 Mark Logic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The use of the Apache License does not indicate that this project is
 * affiliated with the Apache Software Foundation.
 */
package com.marklogic.performance;

import com.marklogic.xcc.types.XdmVariable;

/**
 * @author Michael Blakeley, michael.blakeley@marklogic.com
 *
 */
public interface TestInterface {

    public abstract String getQuery() throws Exception;

    public abstract String getName();

    public abstract String getCommentExpectedResult();

    /**
     * @return
     */
    public abstract boolean hasVariables();

    /**
     * @return
     */
    public abstract XdmVariable[] getVariables();

    /**
     * @return
     */
    public abstract String getUser();

    /**
     * @return
     */
    public abstract String getPassword();

}