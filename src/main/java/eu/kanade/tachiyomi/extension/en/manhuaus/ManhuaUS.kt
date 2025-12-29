package eu.kanade.tachiyomi.extension.en.manhuaus

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ManhuaUS : Madara("ManhuaUS", "https://manhuaus.com", "en", SimpleDateFormat("MMM d, yyyy", Locale.US)) {

    override val useNewChapterEndpoint = true
}
