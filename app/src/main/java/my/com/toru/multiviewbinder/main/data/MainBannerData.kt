package my.com.toru.multiviewbinder.main.data

import my.com.toru.multiviewbinder.uicomponent.ListItemType

class MainBannerData(var name: String?, var url: String?) : ListItemType {

    override fun getListItemType(): Int {
        return ListItemType.TYPE_BANNER
    }

    companion object {
        val ITEM = 0
    }
}