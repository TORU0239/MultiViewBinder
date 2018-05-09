package my.com.toru.multiviewbinder.main.data

import java.util.ArrayList

import my.com.toru.multiviewbinder.uicomponent.ListItemType

class MainHorizontalData(var horizontalDetailDataList: ArrayList<MainHorizontalDataDetail>?) : ListItemType {

    override fun getListItemType(): Int {
        return ListItemType.TYPE_HORIZONTAL
    }

    companion object {
        val TYPE = ListItemType.TYPE_HORIZONTAL
    }
}
