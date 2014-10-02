/*
 * Copyright (c) 2011-2014 Pivotal Software, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package reactor.function;

/**
 * Implementations of this class supply the caller with an object. The provided object can be created each call to
 * {@code get()} or can be created in some other way.
 *
 * @param <T> the type of the supplied object
 *
 * @author Jon Brisbin
 */
public interface Supplier<T> {

	/**
	 * Get an object.
	 *
	 * @return An object.
	 */
	T get();

}
