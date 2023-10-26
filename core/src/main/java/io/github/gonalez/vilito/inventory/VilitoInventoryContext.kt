/*
 * Copyright 2023 - Gaston Gonzalez (Gonalez)
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
package io.github.gonalez.vilito.inventory

/**
 * VilitoInventoryContext serves as the context that is provided to many parts of the library offering
 * essential functionality and information for rendering and managing common components and elements.
 */
interface VilitoInventoryContext {

  /**
   * Interface used to render objects within a inventory context.
   *
   * @param <T> The type of object that will be rendered within the inventory.
   */
  interface Renderable<T>  {

    /** Renders the object within the provided context. */
    fun render(ctx: VilitoInventoryContext): T
  }

  /** Returns the unique identifier for this context. */
  fun getUuid(): String
}