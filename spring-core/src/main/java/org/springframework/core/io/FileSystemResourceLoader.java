/*
 * Copyright 2002-2017 the original author or authors.
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

/**
 * 其实 DefaultResourceLoader 对#getResourceByPath(String) 方法处理其实不是很恰当，
 * 这个时候我们可以使用 org.springframework.core.io.FileSystemResourceLoader 。
 *
 * 它继承 DefaultResourceLoader ，且覆写了 #getResourceByPath(String) 方法，
 * 使之从文件系统加载资源并以 FileSystemResource 类型返回，这样我们就可以得到想要的资源类型。
 */
public class FileSystemResourceLoader extends DefaultResourceLoader {

	/**
	 * 截取首 /
	 * 创建 FileSystemContextResource 类型的资源
	 */
	@Override
	protected Resource getResourceByPath(String path) {
		if (path.startsWith("/")) {
			path = path.substring(1);
		}
		return new FileSystemContextResource(path);
	}


	/**
	 * 为 FileSystemResourceLoader 的内部类
	 * 它继承 FileSystemResource 类，实现 ContextResource 接口。
	 *
	 * 为什么要搞一个内部类呢？
	 */
	private static class FileSystemContextResource extends FileSystemResource implements ContextResource {

		public FileSystemContextResource(String path) {
			super(path);
		}

		@Override
		public String getPathWithinContext() {
			return getPath();
		}
	}

}
