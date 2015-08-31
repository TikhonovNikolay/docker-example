/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.tikhonovnikolay;

import org.apache.ignite.cache.query.annotations.*;

import java.io.*;
import java.util.*;

/**
 * Person.
 */
public class Person implements Serializable {
    /** Person ID (indexed). */
    @QuerySqlField(index = true)
    private UUID id;

    /** Organization ID (indexed). */
    @QuerySqlField(index = true)
    private UUID orgId;

    /** First name (not-indexed). */
    @QuerySqlField
    private String firstName;

    /** Last name. */
    private String lastName;

    /** Salary (indexed). */
    @QuerySqlField(index = true)
    private double salary;

    /**
     * Constructs person record.
     *
     * @param org Organization.
     * @param firstName First name.
     * @param salary Salary.
     */
    public Person(UUID id, Organization org, String firstName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.salary = salary;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "Person [firstName=" + firstName +
            ", id=" + id +
            ", orgId=" + orgId +
            ", salary=" + salary + ']';
    }
}
