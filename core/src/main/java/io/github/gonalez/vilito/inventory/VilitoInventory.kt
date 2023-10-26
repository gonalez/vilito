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
 * Represents an inventory that is renderable within a given context.
 *
 * @param <T> the type of result produced when rendering the inventory.
 */
interface VilitoInventory<T> : VilitoInventoryContext.Renderable<T> {

  /**
   * Renders the inventory within the provided context.
   *
   * @param ctx the context in which the inventory should be rendered.
   * @return the result of rendering the inventory.
   */
  override fun render(ctx: VilitoInventoryContext): T
}