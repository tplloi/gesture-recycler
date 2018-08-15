package com.thesurix.gesturerecycler.transactions

/**
 * @author thesurix
 */
interface Transactional<T> {
    val data: MutableList<T>
    fun notifyInserted(position: Int)
    fun notifyRemoved(position: Int)
    fun notifyMoved(fromPosition: Int, toPosition: Int)
}