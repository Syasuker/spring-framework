/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.core.io;

import org.springframework.lang.Nullable;
import org.springframework.util.ResourceUtils;

/**
 * Spring 将资源的定义和资源的加载区分开了
 * Resource 定义了统一的资源
 * 那资源的加载则由 ResourceLoader 来统一定义
 * ResourceLoader，定义资源加载器，主要应用于根据给定的资源文件地址，返回对应的 Resource
 */
public interface ResourceLoader {

	/** CLASSPATH URL 前缀。默认为："classpath:" */
	String CLASSPATH_URL_PREFIX = ResourceUtils.CLASSPATH_URL_PREFIX;


	/**
	 * 根据所提供资源的路径 location 返回 Resource 实例
	 * 但是它不确保该 Resource 一定存在，需要调用 Resource#exist() 方法来判断
	 *
	 * 该方法支持以下模式的资源加载：
	 *   URL位置资源，如 "file:C:/test.dat" 。
	 *   ClassPath位置资源，如 "classpath:test.dat 。
	 *   相对路径资源，如 "WEB-INF/test.dat" ，此时返回的Resource 实例，根据实现不同而不同
	 */
	Resource getResource(String location);

	/**
	 * Expose the ClassLoader used by this ResourceLoader.
	 * <p>Clients which need to access the ClassLoader directly can do so
	 * in a uniform manner with the ResourceLoader, rather than relying
	 * on the thread context ClassLoader.
	 * @return the ClassLoader
	 * (only {@code null} if even the system ClassLoader isn't accessible)
	 * @see org.springframework.util.ClassUtils#getDefaultClassLoader()
	 * @see org.springframework.util.ClassUtils#forName(String, ClassLoader)
	 */
	@Nullable
	ClassLoader getClassLoader();

}
