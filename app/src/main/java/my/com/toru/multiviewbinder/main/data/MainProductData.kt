package my.com.toru.multiviewbinder.main.data

import my.com.toru.multiviewbinder.uicomponent.ListItemType

class MainProductData(var name: String?, var count: Int) : ListItemType {

    override fun getListItemType(): Int {
        return ListItemType.TYPE_PRODUCT
    }

    companion object {
        val TYPE = 1
    }
}