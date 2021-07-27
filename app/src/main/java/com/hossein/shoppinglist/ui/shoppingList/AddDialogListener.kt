package com.hossein.shoppinglist.ui.shoppingList

import com.hossein.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}