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
package io.github.gonalez.vilito.inventory.bukkit

import io.github.gonalez.vilito.inventory.VilitoInventoryElement
import org.bukkit.inventory.ItemStack

/**
 * Inventory element designed to be compatible with a [BukkitVilitoInventory]. It utilizes ItemStack
 * as its content type, which aligns with Bukkit inventories that primarily handle item stacks.
 *
 * @param <T> the type of content contained within this element.
 */
interface BukkitVilitoInventoryElement<T : ItemStack> : VilitoInventoryElement<T>