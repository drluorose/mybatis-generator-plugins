/*
 * Copyright (c) 2014.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.code.mybatis.generator.plugins.gen;

public class Blog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_BLOG.ID
     *
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_BLOG.NAME
     *
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_BLOG.URL
     *
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_BLOG.DESCRIPTION
     *
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_BLOG.OWNER_ID
     *
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    private Long ownerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_BLOG.ID
     *
     * @return the value of T_BLOG.ID
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_BLOG.ID
     *
     * @param id
     *         the value for T_BLOG.ID
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_BLOG.NAME
     *
     * @return the value of T_BLOG.NAME
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_BLOG.NAME
     *
     * @param name
     *         the value for T_BLOG.NAME
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_BLOG.URL
     *
     * @return the value of T_BLOG.URL
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_BLOG.URL
     *
     * @param url
     *         the value for T_BLOG.URL
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_BLOG.DESCRIPTION
     *
     * @return the value of T_BLOG.DESCRIPTION
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_BLOG.DESCRIPTION
     *
     * @param description
     *         the value for T_BLOG.DESCRIPTION
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_BLOG.OWNER_ID
     *
     * @return the value of T_BLOG.OWNER_ID
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_BLOG.OWNER_ID
     *
     * @param ownerId
     *         the value for T_BLOG.OWNER_ID
     * @mbggenerated Sat Feb 15 18:24:35 CET 2014
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}