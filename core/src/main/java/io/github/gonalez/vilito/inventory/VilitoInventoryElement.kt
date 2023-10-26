package io.github.gonalez.vilito.inventory

/**
 * VilitoInventoryElement interface represents an individual element within the inventory api. These elements
 * These elements are the units of content that can be placed, stored, in a inventory.
 *
 * @param <T> the type of content that this element contains.
 */
interface VilitoInventoryElement<T> : VilitoInventoryContext.Renderable<VilitoInventoryElement.RenderedContent<T>> {

  /**
   * Renders the element in a RenderedContent within the given context.
   *
   * @param ctx the context in which the element should be rendered.
   * @return A RenderedContent encapsulating the rendered content.
   */
  override fun render(ctx: VilitoInventoryContext): RenderedContent<T>

  /**
   * Abstract class representing the rendered content of a inventory element.
   *
   * @param <T>the type of content.
   */
  abstract class RenderedContent<T> {

    /** Retrieves the rendered content of the element. */
    abstract fun getContent(): T
  }
}