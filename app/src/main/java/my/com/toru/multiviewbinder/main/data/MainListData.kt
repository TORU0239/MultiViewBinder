package my.com.toru.multiviewbinder.main.data

import my.com.toru.multiviewbinder.uicomponent.ListItemType

class MainListData(var name: String?, var gender: String?, var address: String?) : ListItemType {

    override fun getListItemType(): Int {
        return ListItemType.TYPE_LIST
    }

    companion object {
        val TYPE = 2
    }
}