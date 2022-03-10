package com.nghiemtuananh.baitapappdoctruyent3h

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: TopicAdapter
    var listTopic: MutableList<ItemTopic> = mutableListOf()
    var listStoryCTVN: MutableList<ItemStory> = mutableListOf()
    var listStoryCTTG: MutableList<ItemStory> = mutableListOf()
    var listStoryTDG: MutableList<ItemStory> = mutableListOf()
    var listStoryTNN: MutableList<ItemStory> = mutableListOf()
    var listStoryTC: MutableList<ItemStory> = mutableListOf()
    var listStoryQTCS: MutableList<ItemStory> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addListStoryCTVN()
        addListStoryCTTG()
        addListStoryTDG()
        addListStoryTNN()
        addListStoryTC()
        addListStoryQTCS()
        addListTopic()
        setUpRecyclerview()
    }

    private fun addListStoryQTCS() {
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2016/11/tang-nhan.jpg", "Chuyện phật gia: Mượn tiền?", "Thực tế trong cuộc sống, thí chủ ai cũng đều sẽ ít nhất bị hỏi vay tiền một vài lần. Nhưng đa số đều không thể chối từ vì nhiều lý do khác nhau.\n" +
                "\n" +
                "Điều khó làm nhất là gì? Là vay mượn!\n" +
                "\n" +
                "Thí chủ tất nhiên sẽ luôn coi người cho mình vay tiền lúc khó khăn là quý nhân. Không chỉ là tiền, mà một chút giúp đỡ thôi cũng là điều vô cùng đáng quý.\n" +
                "Thời nay người như vậy rất hiếm gặp, nếu như gặp được thì thí chủ nên trân quý cả 1 đời!\n" +
                "Người cho thí chủ mượn tiền lúc thí chủ đang khốn khó, không phải bởi người ta nhiều tiền quá không biết tiêu vào đâu, mà bởi vì họ muốn giúp đỡ thí chủ một chút vào lúc khó khăn ấy.\n" +
                "Thứ cho thí chủ mượn không phải là tiền, mà là một tấm lòng, là sự tin tưởng, là sự động viên, là niềm tin vào khả năng và là sự đầu tư vào tương lai của bạn…\n" +
                "Hy vọng bạn bè có thể mãi đặt niềm tin nơi mình mà không đắn đo gì là điều khó mà làm được! Làm mất lòng tin nơi người khác chính là sự mất mát rất lớn trong đời người! Xin hãy đặt chữ tín ở vị trí thích đáng!\n" +
                "Sự chân thành của bạn bè là tài sản của cả một đời người! Đồng thời, thí chủ hãy nhớ rằng:\n" +
                "– Người chủ động trả tiền trước trong các buổi hẹn, không phải bởi họ dư dả tiền bạc, mà bởi họ coi tấm chân tình với thí chủ còn hơn cả tiền bạc.\n" +
                "– Lúc hợp tác có thể nhường thí chủ phần lợi hơn, không phải bởi họ ngốc, mà bởi họ là người biết sẻ chia.\n" +
                "– Khi công tác nếu luôn chủ động nhận lấy phần việc khó, không phải bởi họ muốn thể hiện bản thân, ấy bởi đó là người có trách nhiệm với tập thể.\n" +
                "– Khi gặp mâu thuẫn liền nói lời xin lỗi, không phải do họ sai, mà bởi họ biết điều gì mới đáng để giữ gìn hơn là cái tôi vị kỷ của bản thân.\n" +
                "– Người nguyện ý giúp đỡ thí chủ không phải họ nợ thí chủ điều gì, mà bởi họ coi thí chủ là người đáng trân trọng.\n" +
                "– Người ta giúp thí chủ vì mối lương duyên quý báu, không phải vì đó là bổn phận, bạn đừng coi đó là lẽ đương nhiên mà coi nhẹ."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2016/11/safe_image-5-675x353-660x353.jpg", "Tại sao chúng ta nên tha thứ cho người khác?", "Tha thứ là gì? Tha thứ là một lời nói hay là sự buông bỏ thù hận từ trong tâm? Hãy đọc câu chuyện dưới đây và cùng suy ngẫm.\n" +
                "\n" +
                "Khi còn là những đứa trẻ, chúng ta thường bị ép buộc phải tha thứ cho lỗi lầm của người khác. Nếu một đứa bé cướp đồ chơi của bạn mình, cha mẹ sẽ bắt chúng phải xin lỗi và tha thứ cho nhau. Lời xin lỗi đó được coi là tuyên ngôn của sự tha thứ. Tuy nhiên, sự hằn học và mâu thuẫn thì vẫn có thể còn đang chất chứa trong lòng.\n" +
                "\n" +
                "Khi trưởng thành, chẳng còn ai nhắc nhở bạn phải làm điều này điều khác. Việc nghe được lời xin lỗi từ ai đó lại càng trở nên hiếm hoi. Cuộc sống dần thiếu đi sự chân thành và vị tha, lòng người càng khép lại, sự oán trách cũng nhiều lên.\n" +
                "\n" +
                "Câu chuyện sau đây sẽ giúp ta hiểu rằng, thù hận là liều thuốc độc và tha thứ chính là phương thuốc nhiệm màu nhất để hạnh phúc.\n" +
                "\n" +
                "Câu chuyện về củ khoai tây\n" +
                "“Một ngày nọ, thầy giáo yêu cầu mỗi chúng tôi mang một túi nilông sạch và một bao tải khoai tây đến lớp. Sau đó, thầy bảo mỗi lần chúng tôi không tha thứ lỗi lầm cho người nào đó thì hãy chọn ra một củ khoai tây, viết tên người ấy và ngày tháng lên đó, rồi bỏ nó vào túi nilông. Sau vài ngày, túi của nhiều người trong lớp đã bắt đầu nặng dần.\n" +
                "\n" +
                "Sau đó, thầy lại yêu cầu chúng tôi phải luôn đeo cái túi đấy bên mình dù đi bất cứ đâu, ngủ hay làm việc. Sự phiền phức khi phải mang vác một cái túi chứa hàng chục củ khoai tây khiến chúng tôi càng cảm nhận rõ ràng gánh nặng tinh thần mà mình đang chịu đựng. Không những thế, chúng tôi còn phải luôn để tâm đến nó, nhớ đến nó và nhiều khi đặt nó ở những chỗ chẳng tế nhị chút nào.\n" +
                "\n" +
                "Qua thời gian, khoai tây bắt đầu phân huỷ thành một thứ chất lỏng nhầy nhụa và chúng tôi không muốn mang nó bên mình nữa…”\n" +
                "\n" +
                "Tha thứ không đồng nghĩa với việc giữ những khúc mắc, đau khổ, và sự không hài lòng ở trong tâm. Làm như vậy, bạn chỉ đang kìm nén những nỗi đau lại. Bạn sẽ cứ nghĩ mãi về những chuyện không vui, những vết thương lòng mà không để ý tới viễn cảnh lạc quan hơn. Vì vậy, tha thứ trước tiên chính là buông bỏ những tiêu cực của bản thân mình. Bạn phải bao dung với con người mình thì mới biết cách bao dung với người khác.\n" +
                "\n" +
                "Chúng ta thường cho rằng tha thứ là làm việc tốt với người được tha thứ, giống như ‘cho phép’ họ giũ bỏ những gánh nặng tinh thần. Thực chất, tha thứ là món quà cho chính bản thân bạn. Tha thứ là để quá khứ ở lại và nhìn vào hiện tại và tương lai. Sự giận dữ và oán hận chỉ làm chúng ta càng khổ tâm hơn, mất thời gian suy nghĩ và kìm hãm sự thăng hoa trong tư tưởng.\n" +
                "\n" +
                "Người mạnh mẽ là người biết cách tha thứ. Bao dung với người khác đồng nghĩa với việc biết chấp nhận những thiếu xót của bản thân và vị tha với lỗi lầm của đối phương. Thay vì mãi oán trách số phận và than thở về cuộc đời hay người khác, hãy dành thời gian để làm những việc mà bạn yêu thích, ở bên những người mà bạn yêu quý và đi khám phá những vùng đất mới. Như vậy chẳng phải sẽ khiến cuộc sống nhẹ nhàng và tươi đẹp hơn sao? Cuộc sống rất ngắn, hãy học cách tha thứ cho người khác, đó cũng chính là sự ‘tha thứ’ cho chính mình."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2019/04/IMG_0273-1000x667.jpg", "Bố thật là hay khóc", "Bố và con trai, hai người đàn ông thật khó để thể hiện cảm xúc, tình yêu dành cho nhau.\n" +
                "\n" +
                "Lúc nào cũng vậy, yêu lắm, thương lắm nhưng cứ tỏ ra lạnh tanh rồi giấu kín tình cảm của mình.\n" +
                "Hầu hết cặp bố và con trai, nhà nào cũng vậy.\n" +
                "\n" +
                "Khi thơ bé, con trai ngây thơ chập chững bố dắt tay bước những bước đi đầu tiên.\n" +
                "\n" +
                "Rồi con trai ngày một lớn, bố làm trâu ngựa, bố cõng con trên vai để con được bay, được cao nhất thế gian. \n" +
                "Khi đêm về, bố nằm bên con, cả mẹ nữa, rồi bố với con giã gạo xì xụp, bố còn đọc cả truyện cổ tích, truyện cười con nghe.\n" +
                "\n" +
                "Khi con trai ở tuổi dậy thì, con bắt đầu biết thích, con ẩm ương thật khó chiều, khó bảo.\n" +
                "Lúc này, bố vẫn có thể dùng quyền lực của người làm cha để ép con vào khuôn khổ, có khi là bằng cả những trận đòn roi.\n" +
                "\n" +
                "Con lớn thêm nữa, bố và con trai không còn gần nhau, cũng chẳng như những người bạn.\n" +
                "Thật khó diễn tả tình cảm của bố và con trai lúc này.\n" +
                "\n" +
                "Con trai càng lớn càng thích chứng minh rằng mình đã trưởng thành, đã đủ lông đủ cánh. Chả vậy, ngồi nói chuyện cùng bố lâu lâu là y rằng tranh luận, bố hoặc con lại đứng lên, hậm hực chả muốn nói thêm gì…\n" +
                "\n" +
                "Rồi tới khi con trai ngoài 30, thật sự trưởng thành, bố lúc này cũng 60 và già đi mỗi ngày. Con trai thương bố, lại ước sao thời gian quay trở lại để bố trẻ hơn, trẻ mãi. Để bố được bên gia đình, bên chúng con thật dài lâu…\n" +
                "\n" +
                "Lạ thật đấy, bố và con trai tình cảm nhiều lắm mà cứ như vậy đấy.\n" +
                "Giống như hai hòn nam châm y chang nhau, cùng cực nên cứ đẩy nhau ra.\n" +
                "\n" +
                "Viết đến đây, ký ức tuổi thơ của mình tràn về nhiều vô kể.\n" +
                "Mình nhớ hồi nhỏ, có lần vô tình hai anh em chơi với nhau, mình đẩy nhẹ cái thế nào thằng em mình lăn quay xuống con dốc đê, gẫy tay.\n" +
                "Bố biết tin chạy lên, cứ vậy khóc tu tu rồi đá nhẹ vào đít mình mà nói: “Tại mày mà em nó đau như vậy đấy”.\n" +
                "\n" +
                "Rồi khi em mình lớn, nó lên đường nhập ngũ.\n" +
                "Bữa ấy, sau khi nó vào quân đội khoảng 1 tuần, mình gọi điện nói chuyện với bố.\n" +
                "Chuông reo, mãi mới thấy bố nghe máy.\n" +
                "Bố lại khóc tu tu.\n" +
                "Mình hỏi sao bố khóc, bố rằng: “Bố đang phơi quần áo mới giặt, có quần áo của thằng Xuân. Huhu huhu, quần áo nó đây mà nó xa bố mẹ 1 tuần nay rồi”, bố nghẹn lời vì nhớ nó.\n" +
                "\n" +
                "Vậy đấy, lúc nào cũng thương, cũng yêu và quan tâm tới nó từng chút.\n" +
                "Chẳng thế mà bây giờ nó gần 30 rồi, bố vẫn cứ quan tâm, chăm sóc và dặn dò như đứa trẻ còn chưa lớn vậy.\n" +
                "\n" +
                "Bố mẹ mà, lúc nào cũng thế. \n" +
                "Lúc nào cũng coi con mình như đứa trẻ lên ba thôi.\n" +
                "Đôi khi cứ vậy, con trai chẳng hiểu lại cáu gắt, lại cảm thấy phiền hà.\n" +
                "Nhưng là do bố thương, bố yêu và lúc nào bố cũng thật là hay khóc vì thương, vì yêu con.\n" +
                "\n" +
                "Mình cũng vậy, cũng có lần thằng Quýt ngã lộn cổ từ trên giường tầng xuống đất, mặt sưng vêu.\n" +
                "Đêm ấy nằm cạnh nó, ôm nó mà mình sợ. Sợ nó bị chấn thương sọ não thì không biết mình sẽ sống sao.\n" +
                "Cứ vậy mình khóc, khóc tu tu như một đứa trẻ.\n" +
                "Khóc tới mức vợ mình còn phải mắng: “Anh là đàn ông phải mạnh mẽ, sao anh phải khóc”.\n" +
                "Mình rằng: “Anh thương nó quá”.\n" +
                "Đó là lần đầu tiên sau cả chục năm bên nhau, cô ấy thấy mình khóc.\n" +
                "\n" +
                "Chuyện tình yêu của bố và con trai thật rất chi là kỳ quặc.\n" +
                "Bố thì lúc nào cũng vậy, luôn tỏ ra lạnh lùng.\n" +
                "Ấy thế nhưng thương lắm, yêu vô bờ bến và sẵn sàng khóc tu tu vì bé con trai.\n" +
                "Phạm Ngọc Linh\n" +
                "Ô, mình cũng là bố 3 thằng con trai."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2021/04/hat-giong-tam-hon-dung-co-thay-doi-the-gioi-ma-hay-thay-doi-chinh-minh.jpg", "Đừng thay đổi thế giới", "Ngày xưa, có một vị vua cai trị cả một vương quốc rộng lớn. Một ngày nọ, ông quyết định vi hành đến những vùng đất xa xôi nhất của đất nước. Khi trở về cung điện, ông phàn nàn rằng chân ông rất đau. Điều này cũng hoàn toàn dễ hiểu, bởi đây là lần đầu tiên ông thực hiện một chuyến đi dài như vậy, trong khi đó, những con đường ông đi qua đều gập ghềnh, sỏi đá. Bực mình vì bị những cơn nhức mỏi hành hạ, ông ra lệnh cho tất cả các con đường trong vương quốc phải được bao phủ bằng da súc vật. Tất nhiên đây là một mệnh lệnh rất khó thực hiện và tốn kém cả về sức người, sức của nhưng vẫn không ai dám khuyên can nhà vua.\n" +
                "\n" +
                "Thế rồi cuối cùng, một người hầu khôn ngoan đã dũng cảm đứng ra ngăn cản nhà vua. Anh ta nói:\n" +
                "\n" +
                "– Tại sao quốc vương lại có thể tiêu tốn ngân khố một cách vô ích như vậy ạ? Tại sao Người không cắt những miếng da bò êm ái phủ quanh đôi chân trần của mình? Như vậy, không những chân Người sẽ không còn bị đau khi đi qua những con đường gập ghềnh sỏi đá nữa mà cả vương quốc cũng sẽ tiết kiệm được rất nhiều thời gian, công sức, của cải!\n" +
                "\n" +
                "Nhà vua rất ngạc nhiên trước lời đề nghị lạ lùng của người hầu, nhưng rồi sau đó ông cũng đã đồng ý. Vậy là đôi giày đầu tiên trong lịch sử đã ra đời.\n" +
                "\n" +
                "Đôi khi trong cuộc sống, chúng ta không cần bắt cả thế giới phải thay đổi theo mình, điều chúng ta cần, đơn giản chỉ là thay đổi tầm nhìn và cách suy nghĩ của bản thân mà thôi."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/08/dung-ngai-that-bai-640x440.jpg", "Đừng ngại thất bại khi đang còn trẻ", "Người 20 tuổi khác người 50 tuổi ở chỗ, họ còn nhiều thời gian để sửa chữa những sai lầm. Vì thế đừng ngại thất bại.\n" +
                "\n" +
                "1. Niềm tin vào bản thân\n" +
                "\n" +
                "Muốn tin tưởng người khác, trước hết bạn phải có niềm tin vào chính mình. Không ai thật sự hoàn hảo, vì thế, đừng “trầm trọng hoá” những điểm yếu của bản thân. Những khi muốn buông xuôi hoặc từ bỏ, hãy nghĩ về những điểm mạnh bạn đang có và không ngừng tin tưởng rằng, bạn sẽ làm được chỉ cần bạn muốn.\n" +
                "\n" +
                "2. Dám thất bại\n" +
                "\n" +
                "Người 20 tuổi khác người 50 ở chỗ, họ còn nhiều thời gian để sửa chữa những sai lầm. Vì thế đừng ngại thất bại, cho dù đó là điều không ai mong muốn. Có trải qua thất bại, bạn mới hưởng trọn cảm giác ngọt ngào của thành công. Không ai khuyến khích bạn gặp thất bại, nhưng hãy luôn giữ tư thế sẵn sàng chấp nhận “lùi một bước” trong mọi hoàn cảnh. Khi vượt qua được nó, bạn sẽ trưởng thành hơn.\n" +
                "\n" +
                "3. Lòng vị tha\n" +
                "\n" +
                "Ai cũng có thể mắc sai lầm, ngay cả bạn cũng vậy. Vì vậy, hãy tha thứ cho những lỗi lầm của người khác để chắc rằng, khi rơi vào hoàn cảnh tương tự, bạn cũng sẽ nhận được sự vị tha.\n" +
                "\n" +
                "4. Không đánh mất hy vọng\n" +
                "\n" +
                "Hãy nhớ rằng, còn trẻ nghĩa là bạn còn cơ hội để sửa sai, làm lại và tiếp tục cố gắng. Cho dù hiện tại bạn chưa thành công, nhưng bạn đừng để mất niềm tin vào ngày mai. Thành công vẫn đang đợi ở phía trước, chỉ cần bạn không đánh mất hy vọng.\n" +
                "\n" +
                "5. Tình yêu cuộc sống\n" +
                "\n" +
                "Tuổi trẻ là những năm tháng thanh xuân đẹp nhất trong cuộc đời, một khi đã qua thì không bao giờ trở lại. Hãy cảm nhận cuộc sống từ những điều bình dị nhất, hãy trân trọng cuộc sống với những gì đang có và không ngừng hướng đến tương lai. Đừng để những bộn bề, lo toan của cuộc sống khiến bạn quên mất rằng: “Cuộc sống thật tươi đẹp!”. Tình yêu cuộc sống là chất xúc tác giúp bạn luôn lạc quan, vui sống và dạt dào năng lượng để làm mọi việc.\n" +
                "\n" +
                "6. Tự đưa ra quyết định\n" +
                "\n" +
                "Nhiều người thường ao ước thời gian quay trở lại để được làm theo ý mình. Nhưng sự thật là thời gian chẳng bao giờ chờ đợi ai. Vì thế, ít nhất một lần trong đời, bạn hãy đưa ra quyết định của chính mình và chịu trách nhiệm với nó. Quyết định của bạn có thể đúng hoặc sai nhưng ít nhất, bạn sẽ không cảm thấy hối tiếc vì luôn phải sống cuộc đời của người khác.\n" +
                "\n" +
                "7. Có mục đích\n" +
                "\n" +
                "Tuổi trẻ là khoảng thời gian vô giá để khám phá bản thân, nhưng sẽ không ít lần bạn rơi vào tâm trạng hoang mang khi chưa tìm được mục đích sống. Để tránh rơi vào cảm xúc tiêu cực này, hãy vạch ra cho bản thân mục tiêu trong công việc, trong cuộc sống. Khi đạt được mục tiêu đó, lúc nhìn lại, bạn sẽ thấy mình đi được bao xa và tiến bộ nhường nào. Còn không, ít nhất, bạn cũng biết mình đang ở đâu và cần đi đến đâu."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/09/%C4%91%E1%BB%91i-di%E1%BB%87n-v%E1%BB%9Bi-th%E1%BB%8B-phi-640x440.jpg", "Những câu chuyện dạy bạn cách đối diện với thị phi", "1/ Quy luật của xe rác\n" +
                "\n" +
                "Một hôm tôi nhảy vào một chiếc taxi để ra phi trường. Đang chạy đúng làn bỗng từ bãi đậu xe phía trước một chiếc xe nhà màu đen phóng ra. Người lái taxi thắng kêu một tiếng két và tránh không va chạm xe kia trong đường tơ kẻ tóc!Người lái xe kia ngoái đầu mắng chúng tôi. Người lái taxi chỉ cười vẫy chào lại. Tôi thấy anh thật là tử tế.\n" +
                "\n" +
                "Thế nên tôi hỏi “Sao anh hiền vậy? Anh kia suýt tông hư xe anh và mình có lẽ đã phải nhập viện!”\n" +
                "\n" +
                "Bấy giờ anh lái taxi dạy tôi bài học này, tôi gọi nó là: “Quy luật của xe rác”Anh giải thích rằng nhiều người cứ như là xe rác vậy. Họ chạy vòng quanh mang theo đầy rác, đầy bực dọc, đầy nóng giận và chán chường. Vì rác của họ đầy ắp, họ cần nơi đổ rác và đôi khi họ trút lên bạn. Đừng mang nó vào mình. Chỉ cần mỉm cười, vẫy chào, chúc điều tốt lành rồi ta cứ đi tiếp. Đừng thèm lấy rác đó rồi mang rải cho người khác nơi làm việc, nơi dọc đường hay mang về nhà.\n" +
                "\n" +
                "Người thành đạt quyết không để cho mấy xe chở rác làm hỏng ngày của mình.\n" +
                "\n" +
                "Cuộc đời quá ngắn để mà cứ sống trong hối tiếc, vậy nên… hãy yêu thương người cư xử tốt với mình và cầu nguyện cho ai xử tệ.Cuộc sống này ta tạo nên nó chỉ mười phần trăm, còn chín mươi phần trăm là tùy thuộc cách ta tiếp nhận nó!\n" +
                "\n" +
                "2/ Ngược lại với yêu\n" +
                "\n" +
                "Một giáo sư đang giảng về “tiểu thuyết” ở một lớp học của các nhà văn trẻ, giáo sư bỗng dừng lại hỏi các học viên:\n" +
                "\n" +
                "– Ngược lại với yêu là gì?\n" +
                "\n" +
                "– Ghét ạ!\n" +
                "\n" +
                "Giáo sư đi đi, lại lại, trầm ngâm, ông bỏ giáo trình xuống bàn và nói:\n" +
                "\n" +
                "– Thế này nhé: Ví như anh đang yêu, sau đó chia tay! 50 năm sau anh 70 tuổi, tình cờ gặp lại người cũ trong một chiều đi dạo. Lúc đó bà nọ chằm chằm nhìn anh và nói: “Ông A ơi tôi ghét ông!”. Nếu tình tiết xảy ra đúng như vậy, anh phải mừng cho bản thân mình!\n" +
                "\n" +
                "– Vì sao?\n" +
                "\n" +
                "– Vì anh là người may mắn mới có người ghét anh hàng nửa thế kỷ.\n" +
                "\n" +
                "– May mắn quái gì, phi lý!\n" +
                "\n" +
                "– Bình tĩnh, bình tĩnh, anh nghĩ kỹ xem, ghét cũng cuốn hút tình cảm như yêu như thương, tức là tình cảm của ai đó vẫn nghĩ về anh. Có người ghét anh 50 năm, tức là vẫn nghĩ về anh 50 năm, thật là hiếm có đấy! Anh may mắn không nào? Điều đáng sợ là khi anh gặp lại người cũ, anh hỏi: “Bà B ơi có nhớ tôi không?”. Người nọ đứng đực ra nhìn anh và nói: “Thưa ông, tôi nom ông hơi quen quen, ông là ai?”.\n" +
                "\n" +
                "Cả lớp cười ồ lên, câu chuyện tưởng tượng này quả là thú vị pha thêm chút ngượng ngùng…\n" +
                "\n" +
                "Giáo sư khẳng định: “Ngược lại với yêu đâu phải là ghét!”.\n" +
                "\n" +
                "Cả lớp nhất trí với giáo sư: “Ngược lại với yêu là lãng quên!”.\n" +
                "\n" +
                "Cách “trả thù” tốt nhất là lãng quên và sống tiếp.\n" +
                "\n" +
                "3/ Thanh gươm của vua Dionysius\n" +
                "\n" +
                "Thuở xưa, Dionysius trị vì xứ Syracuse – một xứ sở giàu có nhất vương quốc Sicily. Dionysius sống trong một cung điện nguy nga tráng lệ với vô số đồ vật đắt giá và đông đảo tùy tùng.\n" +
                "\n" +
                "Quyền lực và sự giàu có của Dionysius đã khiến nhiều người ở xứ Syracuse ghen tị. Và Damocles – một cận thần thân tín của Dionysius – là một trong số đó. Hắn ta luôn ca thán với nhà vua rằng:\n" +
                "\n" +
                "– Ngài thật là may mắn! Ngài có tất cả mọi thứ mà người khác ao ước. Ngài chính là người hạnh phúc nhất thế gian. Dionysius chán ngấy khi suốt ngày phải nghe những lời đó của Damocles. Một hôm, nhà vua bảo với người cận thần của mình:\n" +
                "\n" +
                "– Sao lúc nào ngươi cũng nghĩ ta hạnh phúc hơn mọi người vậy?\n" +
                "\n" +
                "– Nhưng quả thật là vậy, thưa đức vua. – Damocles trả lời. – Hãy nhìn vào quyền lực và tài sản mà Người đang nắm giữ. Người chẳng bao giờ phải bận tâm hay lo nghĩ bất kỳ điều gì. Cuộc sống còn có thể tốt đẹp hơn thế sao?\n" +
                "\n" +
                "– Vậy thì ta cho phép ngươi được thay thế ta trong một ngày.\n" +
                "\n" +
                "– Ôi! Thần chưa khi nào dám mơ đến điều này. – Damocles sung sướng. – Chỉ cần được ở vào vị trí của ngài một ngày đã là niềm hạnh phúc nhất đối với thần rồi.\n" +
                "\n" +
                "– Được thôi! Vậy thì ngày mai ngươi hãy đến đây, rồi ngươi sẽ có được niềm hạnh phúc đó.\n" +
                "Thế là ngày hôm sau, Damocles được dẫn đến cung điện. Theo lệnh của Dionysius, những người hầu trong cung phục vụ Damocles tận tình như phục vụ chủ nhân của họ.\n" +
                "Họ khoác lên người Damocles áo choàng hoàng gia và đặt lên đầu gã chiếc vương miện của nhà vua. Damocles ngồi xuống chiếc bàn lớn trong sảnh ăn và lập tức các cao lương mỹ vị được dọn ra. Chẳng còn gì sung sướng hơn thế nữa đối với Damocles. Những loại rượu quý hiếm, hoa thơm quả ngọt, dầu thơm hảo hạng và nhạc múa rộn rã liên tiếp được dâng lên. Damocles ngồi thư giãn trên tấm nệm êm ái, tận hưởng niềm hạnh phúc vô bờ.\n" +
                "\n" +
                "– Ôi! Thế này mới là sống chứ. – Gã thở dài nói với Dionysius đang ngồi phía góc bàn đối diện. – Trước giờ thần chưa từng được tận hưởng cuộc sống tuyệt vời như thế này.\n" +
                "\n" +
                "Nói rói gã nâng cốc rượu lên miệng và ngửa mặt lên trần nhà. Nhưng cái gì đang đung đưa trên cao và mũi nhọn chĩa thẳng vào đầu gã thế kia?\n" +
                "\n" +
                "Damocles lặng người; nụ cười tắt ngấm trên môi. Khuôn mặt gã tái xanh còn đôi tay thì run lẩy bẩy. Bây giờ, gã chẳng còn thiết đến cao lương mỹ vị hay nhạc múa gì nữa. Điều duy nhất gã nghỉ đến là thoát ngay khỏi chỗ ngồi này, càng nhanh càng tốt.\n" +
                "\n" +
                "Ngay trên đầu của Damocles, một thanh gươm được treo vào một sợi dây mỏng mảnh. Lưỡi gươm sắc bén của nó nhắm thẳng vào chính giữa đỉnh đầu gã.\n" +
                "\n" +
                "Thoạt tiên, Damocles toan nhảy khỏi ghế và chạy trốn, nhưng gã lập tức từ bỏ ý định vì sợ rằng chỉ cần một chuyển động nhỏ cũng làm đứt sợi dây và khiến thanh gươm rơi thẳng xuống. Damocles ngồi im như tượng đá.\n" +
                "\n" +
                "– Có chuyện gì thế? – Dionysius hỏi. – Sao ta thấy ngươi có vẻ căng thẳng vậy?\n" +
                "\n" +
                "– Thanh gươm! Thanh gươm trên kia kìa! – Damocles thì thào. – Ngài có thấy nó không?\n" +
                "\n" +
                "– Dĩ nhiên là có chứ! – Dionysius đáp. – Ta thấy nó mỗi ngày. Lúc nào nó cũng lơ lừng trên đầu ta và có thể rơi xuống bất cứ khi nào. Nhưng đó chỉ là một phần nổi mà ta cố tình đặt ra để nhắc nhở mình về những tai họa tiềm ẩn khác, chẳng hạn như sự phản bội của các cận thần, sự quay lưng của dân chúng, sự xâm lược của kẻ thù hoặc những quyết định sai lầm của chính bản thân ta. Muốn có quyền lực, trước tiên ngươi phải học cách chấp nhận mọi hiểm nguy và rủi ro, ngươi hiểu không?\n" +
                "\n" +
                "– Vâng, thưa đức vua, thần đã thấm thía điều đó. – Damocles trả lời. – Thần không nghĩ ngài phải lo nghĩ nhiều điều như thế này. Hãy trở lại vị trí của ngài, còn thần, thần trở về nhà mình ngay.\n" +
                "\n" +
                "Từ đó về sau, Damocles không bao giờ muốn đánh đối vị trí của mình với nhà vua một tích tắc nào nữa.\n" +
                "\n" +
                "Bạn hãy thử đặt mình vào vị trí người khác, xem họ làm vậy có nguyên nhân gì sâu xa không, trước khi khó chịu vì họ nhé!\n" +
                "\n" +
                "4/ Bài học đáng giá\n" +
                "\n" +
                "Ngày xưa, có một họa sĩ kiệt suất tên là Ranga. Trong suốt quá trình hoạt động nghệ thuật của mình ông đã cho người đời chiêm ngưỡng nhiều kiệt tác đáng kinh ngạc khiến ai cũng phải trầm trồ khen ngợi.Theo thời gian, tuổi trẻ của Ranga cũng dần qua đi làm ông trăn trở. Sau đó ông quyết định mở một lớp học mỹ thuật để dạy nghề cho mọi người và cũng để tìm đệ tử nối nghiệp.\n" +
                "\n" +
                "Ông hay nói với các học viên rằng:\n" +
                "\n" +
                "“Các con chỉ có thể thành công khi làm cho ta hài lòng với kĩ năng và sự hiểu biết của các con.Chính vì thế không mấy khi thấy ông khen ngợi ai và cũng không đề cập đến thời gian kết thúc khóa học. Ông tận tụy truyền cho học trò những bài học về phương pháp đánh giá, ước định hết sức độc đáo. Ranga không bao giờ thổi phồng tầm quan trọng của những bức tranh hay sự nổi tiếng, mà ông luôn nhấn mạnh đến cách xử sự, thái độ với cuộc sống của học trò.Trong một số lượng lớn học trò, Rajeev là một người có tài nhất lại chăm chỉ, sáng tạo nên tiếp thu nhanh hơn nhiều so với các bạn đồng môn. Ranga rất hài lòng về cậu học trò này”\n" +
                "\n" +
                "Một ngày kia, ông gọi Rajeev đến và bảo:\n" +
                "\n" +
                "“Ta rất tự hào về những tiến bộ mà con đã đạt được, nhưng trước khi ta công nhận con thực sự là một họa sĩ tài năng ta muốn con vẽ một bức tranh mà ai cũng phải thấy đẹp, phải khen ngợi.Rajeev vâng lời, cậu chăm chỉ làm việc ngày đêm và đem đến trình thầy Ranga một bức tranh tuyệt diệu. Ranga xem qua rồi bảo:- Con hãy đem bức tranh này ra đặt ở quảng trường chính, để tất cả mọi người có thể chiêm ngưỡng. Hãy viết bên dưới bức tranh là tác giả sẽ rất biết ơn nếu bất kỳ ai có thể chỉ ra bất kỳ sơ suất nào trên bức tranh và đánh một dấu X vào chỗ lỗi đó.Rajeev làm theo lời thầy: đặt bức tranh ở quảng trường lớn với một thông điệp đề nghị mọi người chỉ ra những sơ suất.”\n" +
                "\n" +
                "Hai ngày sau, Ranga đề nghị Rajeev lấy bức tranh về. Rajeev rất thất vọng khi bức tranh của mình đầy dấu X. Thầy Ranga mỉm cười an ủi và khuyên Rajeev đừng thất vọng, cố gắng thêm lần nữa. Rajeev vẽ một kiệt tác khác mang đến cho thầy. Ranga nhìn ngắm nó và bảo:- Rajeev con hãy thay đổi thông điệp dưới bức tranh. Hãy để màu vẽ và bút ngay cạnh bức tranh ở quảng trường và đề nghị mọi người tìm những chỗ sai trong bức tranh và sửa chúng lại bằng những dụng cụ để vẽ ấy.Sau hai ngày, khi lấy tranh về, Rajeev rất vui mừng khi thấy bức tranh không bị sửa gì hết và tự tin đem đến chỗ thầy của mình.\n" +
                "\n" +
                "Ranga nói:\n" +
                "\n" +
                "“Con đã thành công vào ngày hôm nay. Bởi vì nếu chỉ thành thạo về mỹ thuật thôi thì chưa đủ, mà con còn phải biết rằng con người bao giờ cũng đánh giá bừa bãi ngay khi có cơ hội đầu tiên, cho dù họ chẳng biết gì về điều đó cả. Nếu con luôn để cả thế giới đánh giá mình, con sẽ luôn thất bại. Con người thích đánh giá người khác mà không nghĩ đến trách nhiệm hay nghiêm túc gì cả. Mọi người đánh những dấu X lên bức tranh đầu tiên của con vì họ không có trách nhiệm gì mà lại cho đó là việc không cần động não và họ thích thú. Nhưng khi con đề nghị họ sửa những sơ suất thì không ai làm nữa, vì họ sợ bộc lộ hiểu biết – những thứ mà họ có thể không có. Nên họ quyết định tránh đi là hơn. Cho nên, những thứ mà con đã phải vất vả để làm ra thì đừng dễ dàng bị ảnh hưởng bởi đánh giá của người khác. Hãy tự đánh giá mình. Và tất nhiên, cũng đừng bao giờ đánh giá người\n" +
                "khác quá dễ dàng “\n" +
                "\n" +
                "Hãy tập cho mình lối sống khác, hãy sống cho chính mình, và quan tâm những điều mà mình thực sự mong muốn trong cuộc đời, những ý kiến tốt thì tham khảo, còn những chuyện khác thì không nên quan tâm làm gì!"))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/12/dau-la-hanh-phuc-ban-dang-co-640x440.jpg", "Hạnh phúc ư? Đơn giản lắm…", "Tôi có một cô bạn, chờ phải được tuổi mới cưới. Chưa được tuổi, cô ấy dứt khoát chỉ dọn đồ về sống chung với người yêu thôi. Một thời gian sau, cô ấy sinh đứa con đầu lòng, thế mà vẫn chưa đến tuổi tốt để kết hôn! Cách đây mấy năm, khi cô ấy sắp 35 tuổi, cô ấy thông báo với ông chồng chưa cưới rằng, giờ đã đến ngày tháng tốt để kết hôn rồi đấy! Cô ấy vẫn chăm chỉ tập Yoga để giữ vòng eo lý tưởng cho chiếc váy cưới. Ông xã của cô ấy phì cười và nói, em thật là ấu trĩ. Đàn bà mà đã ba mươi trở ra rồi thì năm nào cũng là năm tốt để kết hôn, ngày nào cũng là ngày Hoàng đạo để lấy chồng! Với lại, đang yên đang lành sao giờ tự nhiên lại phải tốn thêm một món tiền để… làm đám cưới?\n" +
                "\n" +
                "Thì ra, lý do của hạnh phúc là nằm ở chỗ, bạn nghĩ gì, bạn sống ra sao, chứ không phải được quyết định bởi bạn sinh ra dưới chòm sao nào, bạn cưới chồng có vào ngày tốt, có lấy được người hợp tuổi? Nhiều khi, hạnh phúc còn không hề liên quan gì tới tình ái hay hôn nhân, hạnh phúc chỉ giản đơn là hài lòng với cuộc sống, biết đủ, không đòi hỏi, càng không ràng thêm những ràng buộc vô lý lên đời mình."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/12/vu-lan-71-660x440.jpg", "8 điều mẹ đã nói dối con", "Trái tim người mẹ muôn đời vẫn vĩ đại, đó là sự vĩ đại nhất trên thế gian mà không điều gì có thể so bì. Một lần lang thang trên những trang mạng nước ngoài, vô tình tôi đọc được bài viết nho nhỏ như lời tâm sự của đứa con ngả nón thành kính trước bóng cả. Những lời nói dối của mẹ sao mà chứa chan tình yêu thương và đức độ hy sinh cho những đứa con đến thế.\n" +
                " \n" +
                "Lúc nhỏ, gia đình rất nghèo, cơm không đủ ăn, bữa ăn mẹ thường san phần cơm từ bát của mình cho con, mà nói: “Con ăn đi giúp mẹ, mẹ không đói”.\n" +
                "Lúc con đang tuổi lớn, ngày nghỉ mẹ thường vất vả đi ra tận vùng sông nước nông thôn tìm mua cá tươi về cho con tẩm bổ. Cá rất ngon và tươi, lúc con ăn cá, mẹ chỉ chấm đũa khảy chút thịt bám vào xương đầu cá để ăn, con trai nhìn thấy thương mẹ, liền gắp cá từ bát mình vào bát mẹ, mời mẹ ăn. Mẹ không ăn, mẹ lại dùng đũa gắp cá trở lại bát con, mẹ nói: “Con à, con ăn đi, mẹ đâu thích ăn cá”.\n" +
                "Lên trung học cơ sở, để có đủ tiền cho các con đóng học phí mẹ phải nhận thêm công việc may vá để trang trải cuộc sống gia đình. Một ngày mùa đông, con trai giật mình lúc nửa đêm, thấy mẹ vẫn ngồi căng người nơi ngọn đèn dầu, con trai gọi: “Mẹ ơi ngủ đi, sớm mai mẹ còn phải đi làm mà”. Mẹ chỉ cười: “Con à, con ngủ đi, mẹ không buồn ngủ”.\n" +
                "Năm thi lên trung học phổ thông, mẹ xin nghỉ phép để đứng ở cổng trường cổ vũ khích lệ con. Lúc đó đang độ mùa hè, mặt trời chói chang soi lên đỉnh đầu nhưng mẹ vẫn đứng đấy trong suốt mấy tiếng đồng hồ. Khi tiếng chuông báo kết thúc giờ thi, mẹ nhanh chân đi mua một bịch trà mát lạnh mang đến cho con uống, trà đã đậm, tình cảm của mẹ càng sâu đậm hơn. Thoáng nhìn thấy môi mẹ khô, mồ hôi nhỏ giọt trên trán, con trai vội chuyển bình trà mời mẹ uống, mẹ cười dịu hiền: “Con uống đi, mẹ không khát”.\n" +
                "Sau khi cha ốm mất đi, mẹ đảm đương vai trò vừa làm cha vừa làm mẹ, chỉ dựa vào công việc may vá để duy trì nuôi những đứa con, cho chúng học hành, khổ cực nói không hết lời. Gần đó có chú Lý sửa đồng hồ, biết hoàn cảnh gia đình, việc lớn việc nhỏ đều tìm cách rẽ qua giúp đỡ, khi thì khiêng cái này khi thì xách cái kia, có lúc cho thêm ít tiền để mua lương thực cho mấy đứa nhỏ. Người đâu phải cây cỏ mà có thể vô tình, hàng xóm láng giềng biết chuyện khuyên mẹ hãy tái giá, hà tất phải ở khổ như vậy. Nhưng đã bao năm rồi mẹ vẫn thủ tiết thờ chồng nuôi con, kiên quyết không tái giá, người ta khuyên thì mẹ không nghe, mẹ nói: “Tôi không yêu”.\n" +
                "Sau khi những đứa con tốt nghiệp đại học bắt đầu đi làm, thì mẹ cũng đã già không còn làm việc được nữa liền chuyển đến một cái chợ nông sản, bày cái sạp nhỏ để kiếm sống. Những đứa con xa biết chuyện liền thường xuyên gửi tiền về cho mẹ, nhưng mẹ kiên quyết không nhận, lấy tiền gửi trả lại, mẹ nói “Mẹ có tiền rồi”.\n" +
                "Con trai được đi du học 2 năm, sau đó lại thi đạt tiến sĩ của một trường nổi tiếng nước Mỹ, sau khi tốt nghiệp lưu lại Mỹ làm việc, được đãi ngộ nồng hậu, mọi điều kiện rất tốt, con trai muốn đưa mẹ sang để chăm sóc cho mẹ hưởng thụ nhưng bị mẹ cự tuyệt, mẹ nói “Mẹ không quen”.\n" +
                "Cuối đời, mẹ mắc bệnh nặng, nằm viện rồi, từ phương trời tây con trai vội vàng đáp máy bay về thăm mẹ. Sau khi phẫu thuật thì mẹ yếu hẳn, chỉ thở thoi thóp. Mẹ già biết không qua khỏi nên cứ trông ngày thần chết đến lấy đi cuộc sống của mình, con trai thấy vậy vô cùng đau khổ, tuyệt vọng, nước mắt cứ chảy, mẹ liền dỗ “Con ơi, đừng khóc, mẹ thấy rất nhẹ nhàng”."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/12/nhung-con-duong-khong-lot-da-660x440.jpg", "Những con đường không lót đá", "Bố là một người đàn ông đồ sộ, cao một mét tám và nặng một trăm năm mươi ký. Giọng bố to, trầm và luôn luôn gây ấn tượng rằng tốt hơn là bạn đừng ngồi chung bàn ăn với bố.\n" +
                "\n" +
                "Khi bố đứng đó với đôi mắt nảy lửa rừng rực và phóng hỏa đốt bạn với tính khí nóng nảy của ông, thì bạn sẽ hiểu thế nào là sợ… ông Trời – một nỗi sợ tôi đã biết từ hồi còn rất bé.\n" +
                "\n" +
                "Bất cứ khi nào tôi làm gì sai, không có chuyện bàn về những gì tôi đã làm hay không có bất cứ lý lẽ nào được đưa ra để giúp tôi thay đổi hành vi của mình – chỉ là chiếc dây thắt lưng, một dây lưng bằng da cứng. Từ lần đầu tiên bố quất tôi, tôi hiểu rằng ông Trời luôn mang theo một dây thắt lưng trên người.\n" +
                "\n" +
                "Khi bố và bạn bè ông tụ họp ở nhà chúng tôi, họ bắt đầu náo loạn nhà cửa trong lúc bố hồi tưởng về những ngày khi ông là Chiếc Găng Vàng vô địch quyền Anh. Bất cứ khi nào bố vào trận với một gã nào, họ đều lùi bước. Họ biết họ không phải đối thủ của ông, bởi không ai thô bạo và dai sức hơn bố tôi.\n" +
                "\n" +
                "Tôi cảm thấy rất may khi bố vắng nhà hầu hết thời gian. Bố làm việc vận hành các thiết bị nặng nhọc cho đội xây dựng cầu đường, và công việc của bố khiến ông phải có mặt trên đường cả tuần lễ một lần. Nhưng cứ tối thứ Sáu đến, khi nhìn thấy xe của bố hiện ra trên lối vào nhà, là tôi chạy tìm chỗ trốn. Rồi mẹ sẽ cho ông một tràng báo cáo về việc suốt tuần qua tôi đã hư đốn thế nào. Chẳng bao lâu ông sẽ réo tên tôi và triệu tôi đến nhà bếp. Khi bố hét vào mặt tôi, mùi hôi của rượu và thuốc lá xộc vào mũi tôi vào tận cổ họng, khiến cho tôi muốn nôn ọe.\n" +
                "\n" +
                "“Tao không có tâm trạng cho việc này đâu!”, ông hét lên. “Tao làm việc cực khổ cả tuần trời, và bây giờ tao trở về nhà với chuyện như vầy đây hả!” Rồi thắt lưng được tháo ra.\n" +
                "\n" +
                "Điều bố không nhận ra là phương pháp trừng phạt này càng khuyến khích cho loại hành vi mà ông đang cố ngăn chặn. Và bất cứ lúc nào tôi nói với ông về việc đó, ông càng điên tiết hơn và hét lớn, “Đừng làm như tao làm. Làm như tao nói ấy!”\n" +
                "\n" +
                "Hình thức trừng phạt sai lầm này dẫn đến nhiều vấn đề hơn khi tôi lớn lên. Và điều khiến nó tồi tệ hơn là tôi không có một con đường để quay lại. Tôi khiếp sợ bố và không biết phải trông đợi những gì từ những cơn thịnh nộ của ông. Tôi nguyện rằng khi đủ lớn, tôi sẽ bỏ nhà ra đi và ở càng xa bố càng tốt.\n" +
                "\n" +
                "Sau cùng bố mẹ tôi ly hôn, và tôi đã không gặp bố những năm sau đó. Mẹ vẫn giữ liên lạc với tôi, và một ngày mẹ gọi cho tôi để báo rằng bố đã đi khám bác sĩ, ông rất yếu. Tôi tự hỏi mình nên làm gì bây giờ hay mình có nên làm bất cứ điều gì hay không. Chúng tôi không thân thiết nhau. Làm thế nào chúng tôi có thể gần gũi sau tất cả những việc bố đã nói và làm khi tôi còn nhỏ? Tôi thậm chí đã không thấy thích đàn ông nữa! Nhưng thật kỳ quặc, tôi cảm thấy trong tim mình luôn có một sự lôi kéo kỳ lạ, và tôi quyết định gọi cho bố.\n" +
                "\n" +
                "“Bố, con, Lindy đây.”\n" +
                "\n" +
                "“Lindy ư?”, ông nói, nghe như thể ông đang lướt qua trí nhớ của mình về tất cả những gì dính dáng đến cái tên Lindy mà ông từng biết.\n" +
                "\n" +
                "Một khoảng yên lặng. Tôi ngập ngừng, cố gắng cẩn thận chọn lọc từng từ. “Con nghe nói bố không được khỏe và quyết định gọi điện thăm bố.”\n" +
                "\n" +
                "“Bác sĩ nói bố không sống được bao lâu nữa.”\n" +
                "\n" +
                "“Bố bị gì ạ?”\n" +
                "\n" +
                "Ông bắt đầu khóc và lầm bầm một vài từ tôi không thể hiểu được, và rồi ông gác máy.\n" +
                "\n" +
                "Một vài tuần trôi qua, tôi suy nghĩ về tình trạng của bố và về việc tôi nên gánh lấy vai trò gì đây. Trong khi cứ loay hoay suy nghĩ, tôi nhận được cú điện thoại khác từ mẹ báo rằng bố đã được đưa vào nhà tế bần. Sự do dự chuyển thành nỗi tuyệt vọng. Tôi hiểu nhà tế bần nghĩa là gì. Tôi không muốn tin rằng bệnh của bố đã vào giai đoạn cuối. Bố còn bao nhiêu thời gian nữa? Tôi phải biết điều đó.\n" +
                "\n" +
                "Tôi nhảy vào xe và hối hả lái đến khu điều trị của nhà tế bần. Khi tôi đến nơi, hai y tá và một bác sỹ có mặt ở đó liền an ủi tôi. Sau khi xem hồ sơ của bố, tôi đã có mọi thông tin mình cần. Tất cả những năm tháng rượu chè be bét cuối cùng đã lãnh hậu quả của nó. Bố bị xơ gan mãn tính, điều đó dẫn đến căn bệnh ung thư đang lan ra toàn bộ cơ thể ông.\n" +
                "\n" +
                "Tôi khiếp sợ những gì sẽ đến. Tôi cảm thấy như mình không thuộc về nơi đó. Tôi sẽ nói gì với người đàn ông mà tôi không gặp bao nhiêu năm qua? Tôi cảm thấy như đây là cảnh tượng cuộc đời của người nào đó chứ không phải của tôi. Mơ hồ về việc mình đang làm, tôi bước về hướng phòng của bố, đẩy cửa bằng một sức mạnh mà tôi không hiểu ở đâu ra. Và mặc dù bước rất chậm, nhưng tôi lại đến phòng bố quá nhanh. Khi tôi nhìn quanh quất ở cửa ra vào, bố đã thấy tôi và bảo tôi vào trong.\n" +
                "\n" +
                "“Hãy nhìn bố đi, Lindy,” ông nói và khóc. Rồi ông giơ cánh tay lên và chỉ cho tôi xem làn da bủng beo của ông. “Bố đang kiệt dần, và bố không thể làm gì được.”\n" +
                "\n" +
                "“Con biết, bố à,” tôi nói, cố gắng không cảm nhận nỗi đau của ông.\n" +
                "\n" +
                "Rồi tôi lắng nghe ông nói. Ông nói về mẹ tôi và làm thế nào mà mọi việc đã không suôn sẻ. Ông bảo tôi là ông đã cố gắng làm điều tốt nhất mà ông có thể làm cho tôi, nhưng mọi thứ hoá ra lúc nào cũng sai cả.\n" +
                "\n" +
                "“Bố yêu con, Lindy,” ông nức nở. “Bố có lỗi với con, bố xin lỗi con.”\n" +
                "\n" +
                "Tôi ôm ông trong tay khi ông thú nhận những hối tiếc của mình. Và dù cho tôi không nói gì cả, nhưng cử chỉ an ủi của tôi cho thấy tôi đã tha thứ cho ông.\n" +
                "\n" +
                "Rời khỏi nhà tề bần, đầu tôi quay như chong chóng. Tất cả diễn ra chỉ trong một đêm. Chỉ trong một đêm mà tôi cảm thấy choáng váng, sợ hãi, tha thứ và đau khổ. Bố tôi là một người đàn ông suy kiệt, không phải là người đàn ông tôi biết khi tôi đang ở tuổi trưởng thành. Không gì chạm được vào ông khi đó. Ông là nhà vô địch Găng Tay Vàng.\n" +
                "\n" +
                "Chỗ yếu của tôi lỏng ra, và tôi bắt đầu khóc thét như một đứa trẻ. Tôi không chỉ khóc cho những gì bố và tôi đã không có được trong mối quan hệ cha con của mình, mà tôi khóc cho những gì chúng tôi có thể vẫn có được nếu bố không sắp chết. Giờ đây, bố dường như đã thay đổi và như một người cha tôi có thể cùng chung sống. Nhưng ông lại sắp ra đi, và cả ông lẫn tôi đều không thể làm bất cứ điều gì nữa.\n" +
                "\n" +
                "Nhưng thời gian thì vẫn còn.\n" +
                "\n" +
                "Trong vài tuần kế đó, tôi ghé thăm bố mỗi tối sau giờ làm việc. Chúng tôi ngồi trò chuyện. Thậm chí tôi còn chạy việc lặt vặt cho ông và mua cho ông một vài thứ ông cần. Tôi bắt đầu nhìn thấy những điều về bố mà tôi chưa từng biết trước đây. Tôi đã chỉ biết về những mặt xấu của bố, giờ thì tôi bắt đầu nhìn thấy các mặt tốt, và chúng tôi đang trở thành bạn của nhau. Nhưng ngay khi tình bạn của chúng tôi chớm nở, thì đến lượt ông rơi vào tình trạng tồi tệ nhất.\n" +
                "\n" +
                "Một tối, khi tôi đến thăm ông, y tá nói rằng họ không nghĩ ông có thể qua khỏi đêm nay. Bác sỹ đã tăng liều thuốc móc phin, nhưng nó vẫn chưa điều hòa, và bố đang rất đau. Người ta bảo với tôi là cứ mỗi mười lăm phút máy nhắn sẽ kêu lên, và tại thời điểm đó tôi có thể nhấn một nút để gửi liều móc phin không liên tục vào cơ thể bố. Tôi quyết định ở lại với ông suốt đêm. Bố nói chuyện rất nhỏ. Và mỗi lần máy nhắn kêu lên, tôi lại nhấn nút, nhận ra rằng mỗi lần tôi làm như thế, hai cha con lại khó có thể nói chuyện dài hơn.\n" +
                "\n" +
                "Bố cầm cự thêm được hai ngày, tôi đã ở bên bố khi ông qua đời. Tôi nắm tay ông, hôn lên trán ông và nói, “Không sao đâu bố. Bây giờ bố có thể đi rồi. Ông bà Nội đang chờ bố, và giờ thì bố có thể làm những con đường trên thiên đàng rồi.”\n" +
                "\n" +
                "Bố đã là một người làm đường rất giỏi. Bố đã lát con đường lấp đi hố ngăn cách giữa bố và tôi."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/06/chi%E1%BA%BFc-b%C3%A1t-v%E1%BB%A1-640x440.jpg", "Chiếc bát vỡ", "Ở thành phố kia có một bác thợ rèn, bác có một người con trai duy nhất. Bác rất quý anh vì từ bé tới lớn anh đều là một con người xuất chúng. Anh vừa đẹp trai vừa giỏi giang, làm bố rất tự hào.\n" +
                "Một ngày nọ, không may cậu bị tai nạn xe hơi, tuy giữ được tính mạng nhưng lại bị mất cả hai chân. Tuyệt vọng, hàng ngày anh ngồi ủ rũ trong phòng, im lặng nhìn ra cửa sổ.\n" +
                "Một lần, vì quá đau khổ, anh tìm cách tự tử bằng cách uống thuốc ngủ, nhưng may thay cha anh kịp thời phát hiện đưa anh tới bệnh viện, cứu anh qua cơn nguy kịch.\n" +
                "Một ngày sau người con trai tỉnh, bác thợ rèn mang đồ ăn tới cho con. Anh con trai tức giận hất đổ khay đồ ăn, rồi chỉ chiếc bát vỡ dưới nền, nói:\n" +
                "– Cha à, cha cứu con làm gì, cuộc đời con giờ như chiếc bát vỡ kia rồi, mãi mãi không lấy lại được nữa!\n" +
                "Người cha già tội nghiệp lặng lẽ xoa đầu người con trai, vỗ về rồi giúp anh nằm nghỉ. Xong ông dọn dẹp những thứ dưới đất, đôi mắt ông đỏ hoe.\n" +
                "Một tuần sau anh được đưa trở nhà. Anh thấy trên bàn mình có một chiếc bát sắt. Anh lấy làm lạ lẫm.\n" +
                "– Con có biết nguồn gốc chiếc bát sắt này không, con trai?\n" +
                "– Ưm…ý cha là? – Anh ấp úng nói.\n" +
                "– Chính là chiếc bát sành hôm trước đó con, cha cho nó vào lò nung, cho thêm sắt nữa, rồi đúc ,thế là nó trở thành chiếc bát sắt này đó con.\n" +
                "Ông tiếp:\n" +
                "– Con à, cuộc đời chúng ta có lúc sẽ như chiếc bát vỡ. Nhưng chỉ cần ta cho thêm khát vọng sống rồi nung trong ý chí, xong đúc trong tình yêu thì mọi chuyện sẽ lại ổn con à. Thì dù có đập, có ném thế nào ta cũng sẽ không bao giờ vỡ nữa đâu con.\n" +
                "– Vâng, thưa cha, con đã hiểu.\n" +
                "Nói rồi anh vươn người ôm lấy cha mình. Cả hai cha con cùng khóc vì xúc động."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/06/s%E1%BB%A9c-m%E1%BA%A1nh-c%E1%BB%A7a-n%C6%B0%E1%BB%9Bc.jpg", "Sức mạnh của nước", "Cậu bé là đứa trẻ thông minh, thẳng thắn, nhưng lại cứng nhắc và độc đoán. Mỗi khi cậu chơi cùng bạn bè, đều xảy ra những cuộc cãi vã. Lần đó, cậu đánh nhau với đám bạn vì không một ai đứng về phía cậu. Cậu buồn bực, bỏ về nhà.\n" +
                "\n" +
                "Chị gái cậu thấy vậy hỏi han:\n" +
                "\n" +
                "– Em sao thế\n" +
                "\n" +
                "– Chị đừng nói nữa, em đang tức\n" +
                "\n" +
                "– Em đánh nhau à?\n" +
                "\n" +
                "– Chúng nó đều quá đáng, nên e đã làm thế\n" +
                "\n" +
                "Người chị nghĩ một lát rồi nói:\n" +
                "\n" +
                "– Trong nhà ngột ngạt, chúng ta ra vườn rồi nói chuyện.\n" +
                "\n" +
                "Ra đến vườn, người chị châm lửa đốt đống lá khô. Khi ngọn lửa bốc cao, cô vào nhà lấy ra một viên đá trong tủ lạnh, vừa thả vào lửa vừa nói:\n" +
                "\n" +
                "– Chuyện kể rằng trước đây, nước và lửa là hai kẻ đối nghịch, nhưng nước thấy lửa hung dữ còn mình mềm yếu, nghĩ không thắng nổi lửa, nên hóa thành băng, muốn dùng sự cứng cỏi của băng để tiêu diệt lửa.\n" +
                "\n" +
                "Viên đá chạm lửa tan ra thành nước, rồi bốc hơi ngay, còn ngọn lửa vẫn rực cháy. Cô chị tiếp:\n" +
                "\n" +
                "– Nhưng băng vừa chạm vào đã bị lửa hun chảy, rồi bốc hơi.\n" +
                "\n" +
                "Cô lấy vòi nước tưới cây dập tắt đám lửa:\n" +
                "\n" +
                "– Cuối cùng, chính sự ôn nhu của nước, mới dập tắt được ngọn lửa.\n" +
                "\n" +
                "Cậu em im lặng trầm ngâm.\n" +
                "\n" +
                "– Em thấy đó, nếu như em cứ gồng mình cứng nhắc, độc đoán, thì cũng giống như băng, chỉ cứng cỏi bên ngoài, gặp lửa là tan chảy. Kẻ mạnh thực sự, là giống như nước, ôn hòa, bền bỉ mà có thể xói mòn cả đá cứng, dập được lửa. Nước không bao giờ ngưng chảy, nó rất linh hoạt, đường nào cũng có thể đi. Và khi nước giận dữ, thì không gì ngăn được.\n" +
                "\n" +
                "Em thấy đấy, có những thứ tưởng chừng mềm yếu, lại ẩn chứa sức mạnh vô song."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/cau-be-m%C3%B9-640x440.jpg", "Cậu bé mù", "Một đứa bé trai bị mù, ngồi bên lề đường, với một cái nón đặt gần chân nó. Nó dựng một tấm bảng có ghi như vầy: “Tôi bị mù, xin giúp tôi”. Trong cái nón của nó, lúc đó chỉ có thưa thớt một vài đồng bạc cắc.\n" +
                "\n" +
                "Một người đàn ông đi qua. Ông ta thò tay vào túi, lấy ra vài đồng bạc rồi thả vào cái nón. Sau đó, ông với tay lấy cái bảng, xoay mặt sau ra phía trước và ghi một vài chữ lên đó. Ông để tấm bảng lại chỗ cũ để những ai qua lại có thể đọc được hàng chữ mới ông vừa viết lên đó.\n" +
                "\n" +
                "Sau đó cái nón của đứa bé mù bắt đầu có nhiều tiền. Bây giờ, có nhiều người hơn hồi sáng cho tiền đứa bé mù này. Buổi chiều hôm ấy, người đàn ông đã đổi hàng chữ trên tấm bảng, quay trở lại tìm đứa bé để xem tình hình ra sao. Đứa bé mù nhận ra bước chân của người đàn ông này và hỏi: “Có phải chính ông đã đổi những hàng chữ trên tấm bảng này? Ông đã viết gì trên tấm bảng vậy?”\n" +
                "\n" +
                "Người đàn ông bèn đáp: “Chú chỉ ghi ra sự thật mà thôi. Những gì chú ghi ra trên tấm bảng cũng giống như câu cháu đã ghi, nhưng chỉ theo một cách thức khác thôi”\n" +
                "\n" +
                "Người đàn ông đã viết trên tấm bảng như sau: “Hôm nay là một ngày đẹp trời nhưng tôi không thấy được”.\n" +
                "\n" +
                "Quý vị và các bạn có nghĩ rằng hàng chữ của đứa bé và hàng chữ của người đàn ông có cùng nói lên một điều không?\n" +
                "\n" +
                "Dĩ nhiên, cả hai hàng chữ đều cho người ta biết cậu bé bị mù. Nhưng hàng chữ thứ nhất chỉ nói rằng đứa bé bị mù, vậy thôi. Nhưng hàng chữ thứ hai nói với mọi người rằng họ thật là may mắn bởi vì họ không bị mù. Bây giờ quý vị có còn ngạc nhiên vì sao hàng chữ thứ hai, do người đàn ông viết, gặt hái nhiều kết quả cho cậu bé mù hay không?"))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/trai-tim-660x440.jpg", "Hãy nghe lời thì thầm của trái tim", "Hầu hết mọi người là người khác. Những suy nghĩ của họ là ý kiến của người khác, cuộc sống của họ là sự bắt chước, cảm xúc của họ là một câu trích dẫn.\n" +
                "Oscar Wilde\n" +
                "\n" +
                "Khi đọc truyện Gasby vĩ đại của Scott Fitzgerald, tôi vô cùng thích thú với đoạn mở đầu: ” Hồi tôi còn nhỏ tuổi, nghĩa là hồi dễ bị nhiễm các thói hư tật xấu hơn bây giờ, cha tôi có khuyên tôi một điều mà tôi ngẫm mãi cho đến nay: Khi nào con định phê phán người khác thì phải nhớ rằng không phải ai cũng được hưởng những thuận lợi như con cả đâu. Ông không nói gì thêm, nhưng vì hai cha con chúng tôi xưa nay vẫn rất hiểu nhau, mà chẳng cần nhiều lời nên tôi biết câu nói của ông còn nhiều hàm ý khác. Vì vậy tôi không thích bình phẩm một ai hết. Lối sống ấy đã mở ra cho tôi thấy nhiều bản tính kỳ quặc, nhưng đồng thời khiến tôi trở thành nạn nhân của không ít kẻ chuyên quấy rầy người khác.”\n" +
                "\n" +
                "Tôi cũng rất thích một chi tiết trong truyện Doraemon, đó là mỗi khi Nobita và Doraemon lạc vào một thế giới khác, bất cứ thế giới nào, thì ở nơi đó cũng xuất hiện những nhân vật có nhân dáng tương tự Nobita, Xuka, Xeko, Chaien… nhưng tính cách lại có thể rất khác. Điều đó luôn khiến tôi mỉm cười.\n" +
                "\n" +
                "Cuộc sống này cũng vậy… Ở đâu đó ngoài kia là những người có thể giống ta. Ở đâu đó ngoài kia là những người có thể rất khác ta. Có người ưa tụ tập với bạn bè. Có người mải mê rong chơi. Có người chỉ thích nằm nhà để đọc sách. Có người say công nghệ cao. Có người mê đồ cổ. Có người phải đi thật xa đến tận cùng thế giới thì mới thỏa nguyện. Có người chỉ cần mỗi ngày bước vào khu vườn rậm rạp sau nhà, tìm thấy một vạt nấm mối mới mọc sau mưa hay một quả trứng gà tình cờ lạc trong vạt cỏ là đủ thỏa nguyện rồi. Tôi nhận ra rằng, hai sự phấn khích đó có thể rất giống nhau. Cũng giống như người ta có thể phản ứng rất khác nhau khi đứng trước thác Niagara hùng vĩ, người này nhảy cẩng lên và ghi nhớ cảnh tượng đó suốt đời, nhưng cũng có người nhìn nó và nói: “Thác lớn nhỉ?” rồi quên nó đi ngay sau khi trở về nhà mình. Sao ta phải lấy làm lạ về điều đó? Sao ta phải bực mình về điều đó? Sao ta lại muốn rằng tất cả mọi người đều phải nhảy lên khi nhìn thấy thác Niagara?\n" +
                "\n" +
                "Chúng ta vẫn thường nghe một người tằn tiện phán xét người khác là phung phí. Một người hào phóng đánh giá người kia là keo kiệt. Một người thích ở nhà chê bai kẻ khác bỏ bê gia đình. Và một người ưa bay nhảy chê cười người ở nhà không biết hưởng thụ cuộc sống… Chúng ta nghe những điều đó mỗi ngày, đến khi mệt mỏi, đến khi nhận ra rằng đôi khi phải phớt lờ tất cả những gì người khác nói, và rút ra một kinh nghiệm là đừng bao giờ phán xét người khác một cách dễ dàng.\n" +
                "\n" +
                "Cách đây nhiều năm, khi xe hơi ở Việt Nam vẫn còn là thứ vô cùng xa xỉ, người bạn của tôi sau một thời gian quyết tâm dành dụm và vay mượn đã mua được một chiếc. Chỉ là một chiếc xe cũ thôi. Nhưng vấn đề nằm ở chỗ anh chỉ là một nhà báo với thu nhập vừa phải và vẫn đang ở nhà thuê. Gia đình phản đối nói anh phung phí. Đồng nghiệp xì xầm rằng anh đua đòi. Bạn bè nghi ngại cho là anh học làm sang. Và anh tâm sự với tôi rằng: từ hồi còn nhỏ xíu, anh đã luôn mơ mình được ngồi sau vô lăng, được tự lái xe lên rừng xuống biển. Ước mơ đó theo anh mỗi ngày. Vì vậy anh đã gom góp suốt thời gian qua, cho đến khi có thể mua được một chiếc xe cho riêng mình. Chỉ thể thôi. Rồi anh nhìn tôi và hỏi: Tại sao tôi phải trì hoãn ước mơ chỉ vì sợ người khác đánh giá sai về mình? Sao tôi phải sống theo tiêu chuẩn của người khác?\n" +
                "\n" +
                "Tôi không thể tìm ra một câu trả lời đủ thuyết phục cho câu nói đó. Bởi thế, tôi luôn mang theo câu hỏi của anh bên mình. Nó nhắc tôi rằng, rất nhiều khi chúng ta vì quá lo lắng về những điều người khác đã nói, sẽ nói và có thể nói mà không dám sống với con người và ước mơ đích thực của mình.\n" +
                "\n" +
                "Một người bạn khác của tôi đeo đuổi việc làm từ thiện quyên góp, chia sẻ. Ban đầu vì lòng trắc ẩn. Rồi vì niềm vui cho chính bản thân. Rồi như một món nợ ân tình phải trả. Rồi như một cuộc đời phải sống. Chị như ngọn nến cháy hết mình cho người khác. Ấy vậy mà rất nhiều lần tôi thấy chị khóc vì những lời người khác nói về mình. Như vậy đó, kể cả khi ta hành động hoàn toàn vô vị lợi, cũng không có nghĩa là ta sẽ ngăn ngừa được định kiến và những lời gièm pha ác ý. Vậy sao ta không bình thản bước qua nó mà đi?\n" +
                "\n" +
                "Thỉnh thoảng chúng ta vẫn gặp những người tự cho mình quyền được phán xét người khác theo một định kiến có sẵn. Những người không bao giờ chịu chấp nhận sự khác biệt. Đó không phải là điều tồi tệ nhất. Điều tồi tệ nhất là chúng ta chấp nhận buông mình vào tấm lưới định kiến đó. Cuộc sống của ta nếu bị chi phối bởi định kiến của bản thân đã là điều rất tệ, vậy nếu bị điều khiển bởi định kiến của những người khác hẳn còn tệ hơn nhiều. Sao ta không thể thôi sợ hãi, và thử nghe theo chính mình?\n" +
                "\n" +
                "Thật ra, cuộc đời ai cũng có những lúc không biết nên làm thế nào mới phải. Khi ấy, ba tôi dạy rằng, ta chỉ cần nhớ nguyên tắc sống cơ bản cực kì ngắn gọn: Trước hết, hãy tôn trọng người khác. Rồi sau đó, nghe theo chính mình. Hãy tôn trọng. Bởi cuộc đời là muôn mặt, và mỗi người có một cách sống riêng biệt. Chẳng có cách sống nào là cơ sở để đánh giá cách sống kia. John Mason có viết một cuốn sách với tựa đề “Bạn sinh ra là một nguyên bản, đừng chết như một bản sao” Tôi không biết nó đã được dịch ra tiếng Việt chưa, nhưng đó là một cuốn sách rất thú vị. Nó khiến tôi nhận ra rằng mỗi con người đều là một nguyên bản, duy nhất, độc đáo và đáng tôn trọng.\n" +
                "\n" +
                "Tôi luôn xem nguyên tắc ấy như đôi giày mà tôi phải mang trước khi ra khỏi nhà. Xỏ chân vào đôi giày đó, và đi khắp thế gian, đến bất cứ nơi nào bạn muốn. Con người sinh ra và chết đi đều không theo ý mình. Chúng ta không được sinh ra với ngoại hình, tính cách, tài năng hay sự giàu có mà mình muốn chọn lựa. Nhưng chúng ta đều có một cơ hội duy nhất để được là chính mình. Chúng ta có một cơ hội duy nhất để sống như mình muốn, làm điều mình tin, sáng tạo điều mình mơ ước, theo đuổi điều mình khao khát, yêu thương người mình yêu. Bạn biết mà, cơ hội đó chính là cuộc đời này – một chớp mắt so với những vì sao. Bởi thế, đừng để mình cứ mãi xoay theo những tiếng ồn ào khác, hãy lắng nghe lời thì thầm của trái tim."))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/kh%C3%B4ng-nh%E1%BA%A5t-thi%E1%BA%BFt-l%C3%BAc-n%C3%A0o-b%E1%BA%A1n-c%C5%A9ng-ph%E1%BA%A3i-l%C3%A0-ng%C6%B0%E1%BB%9Di-chi%E1%BA%BFn-th%E1%BA%AFng-640x440.jpg", "Không nhất thiết lúc nào bạn cũng phải là người chiến thắng", "Những người luôn có khuynh hướng quá cạnh tranh với người khác hay những người lúc nào cũng muốn chiến thắng đều luôn cảm thấy bị thua thiệt và không bao giờ cảm thấy hạnh phúc trọn vẹn cho dù kết quả có thế nào đi nữa. Nếu thất bại, họ sẽ hết sức thất vọng, còn nếu chiến thắng thì đối với họ, đó chỉ là chuyện hiển nhiên và cũng chẳng có gì đáng để vui mừng cả.\n" +
                "\n" +
                "Có một điều mà những người như vậy không nhận ra là: niềm vui thực sự chỉ có được khi bản thân mỗi người vượt qua được chính mình của ngày hôm qua chứ không phải là vượt hơn người khác.\n" +
                "\n" +
                "Năm 1972, Richard Nixon đại diện cho đảng Cộng hòa tham gia cuộc chạy đua bầu cử nhằm tái đắc cử tổng thống Mỹ ở nhiệm kỳ tiếp theo. Nixon đã chỉ đạo ban thực hiện chiến dịch của mình dùng mọi biện pháp có thể để giành được càng nhiều phiếu càng tốt. Sự kiện được biết đến nhiều nhất là việc Nixon đã chỉ đạo những cuộc đột nhập bất hợp pháp mà họ sắp đặt tại tòa nhà Watergate, tổng hành dinh của đảng Dân chủ, nhằm cài đặt các thiết bị nghe lén.\n" +
                "\n" +
                "Thêm vào đó, các nhân viên của ủy ban vận động này còn dính líu vào hàng loạt các vụ việc mà ngay chính Nixon cũng phải thừa nhận là “những trò dơ bẩn”. Chẳng hạn, họ gọi điện đặt hàng trăm chiếc bánh pizza và nhờ mang đến văn phòng của một ứng viên đảng đối lập khác cũng đang tranh cử. Hoặc họ cho người phao tin rằng cuộc họp nào đó của một đối thủ đã bị hủy. Họ gọi đến các hội trường, nơi phe đối lập đã liên hệ để tổ chức những cuộc họp, hủy bỏ việc đặt chỗ của đối phương. Tại sao Nixon lại làm như vậy? Vì Nixon luôn sợ thất bại, ông bị ám ảnh bởi tham vọng rằng phải chiến thắng trong cuộc tranh cử bằng mọi giá và ông ta đã áp dụng những thủ đoạn được xem là hèn hạ nhất lúc bấy giờ.\n" +
                "\n" +
                "Điều trớ trêu nhất là Nixon vẫn có thể chiến thắng mà không cần phải bày ra bất cứ trò nào như vậy – dù cuộc tham chiến phi nghĩa ở Việt Nam của chính quyền Mỹ lúc đó bị dư luận phản đối. Và chính vì không dám đón nhận thất bại nên ông đã bị cuốn theo những biện pháp cực đoan đó, để rồi cuối cùng phải trả giá bằng chính chiến thắng mà ông đã cố công theo đuổi: ông đã được đề cập đến như một trong những chính trị gia với những bê bối tệ hại nhất trong lịch sử tranh cử của Mỹ. Vụ Watergate – sau này gắn liền với tên tuổi Richard Nixon – là sự sỉ nhục lớn nhất trong các đời tổng thống của Mỹ.\n" +
                "\n" +
                "Tính cạnh tranh và cái tôi quá cao luôn làm cho nhiều người không bao giờ cảm thấy hài lòng về cuộc sống của mình vì đối với họ, sẽ chẳng có thắng lợi nào là đủ và thất bại là một vực thẳm khủng khiếp. Những người quá ganh đua luôn đánh giá thành công của họ thấp hơn những người biết dũng cảm vượt qua thử thách cũng như chấp nhận sai lầm hay thất bại của mình.\n" +
                "\n"))
        listStoryQTCS.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/02/120304131020-216-817.jpg", "Nếu bố mẹ chia ly", "Con nghe mọi người bảo nếu ôm bức ảnh của người mình nhớ vào lòng rồi đi ngủ thì sẽ mơ thấy người đó, nhưng mà mẹ ơi, vì sao con tối nào cũng làm như thế mà trong giấc mơ của con vẫn không gặp được mẹ?\n" +
                "\n" +
                "“Vợ của anh vì một lý do ngoài ý muốn đã qua đời được 4 năm, anh vì không có cách nào có thể chăm sóc được bố mẹ nên cảm thấy chán nản và mệt mỏi.\n" +
                "Một buổi tối khi anh trở về nhà, vì quá mệt mỏi nên anh chỉ chào hỏi đứa con ngắn gọn và không muốn ăn cơm, cởi xong bộ comple liền lên giường nằm. Đúng lúc đó, ầm một tiếng, bát mì tôm làm bẩn hết chăn và ga trải giường, hóa ra trong chăn có một bát mì tôm. “Cái thằng ranh con này”, anh ta liền vớ một chiếc móc quần áo chạy ra ngoài đánh cho đứa con trai đang ngồi chơi một trận.\n" +
                "\n" +
                "Đứa con trai vừa khóc vừa nói:\n" +
                "\n" +
                "– Cơm sáng đã ăn hết rồi, đến tối con chưa thấy bố về thấy đói bụng nên đi tìm đồ ăn, con tìm thấy mì tôm trong tủ bếp, muốn nấu mì tôm ăn nhưng bố dặn không được tùy tiện dùng bếp gas nên con lấy nước nóng từ trong vòi tắm pha mì tôm, con pha một bát ăn, còn một bát để phần bố. Sợ mì tôm bị nguội nên con mang vào giường ủ trong chăn đợi bố về ăn cho nóng. Con mải chơi đồ chơi mới mượn được của bạn nên khi bố về đã quên không nói với bố.\n" +
                "\n" +
                "Anh không muốn đứa con thấy mình khóc nên vội vã vào nhà vệ sinh, mở vòi nước và khóc. Khi đã ổn định tinh thần, anh mở cửa phòng con trai và nhìn thấy đứa con trai trong bộ quần áo ngủ, nước mắt giàn giụa và tay đang cầm bức hình của mẹ nó.\n" +
                "\n" +
                "Từ đó trở đi, anh chăm sóc con trai tận tâm hơn, chu đáo hơn, khi con trai mới vào học cấp I, anh đánh con một trận nữa. Hôm đó, thầy giáo gọi điện về nhà báo con anh không đi học, anh lập tức xin nghỉ về nhà, chạy đi tìm con khắp nơi, sau vài tiếng đồng hồ đi tìm anh đến một cửa hàng bán văn phòng phẩm nhìn thấy đứa con đang đứng trước một đồ chơi điện tử, thế là anh tức giận đánh con, đứa con không một lời giải thích, chỉ nói “Con xin lỗi”.\n" +
                "Một năm sau, anh nhận được điện thoại từ bưu điện, nói con trai anh đã bỏ một loạt các bức thư không viết địa chỉ vào hòm thư, cuối năm là lúc bưu điện bận rộn nhất nên điều này gây ra rất nhiều khó khăn cho họ. Anh lập tức đến bưu điện, mang những bức thư đó về ném trước mặt con trai nói:\n" +
                "\n" +
                "– Sao mày lại làm những trò tai quái thế này hả?\n" +
                "\n" +
                "Thằng bé vừa khóc vừa trả lời:\n" +
                "\n" +
                "– Đây là những bức thư con gửi cho mẹ.\n" +
                "\n" +
                "Mắt người bố cay cay hỏi con:\n" +
                "\n" +
                "– Thế sao một lúc gửi nhiều thư như vậy?\n" +
                "\n" +
                "Đứa con nói:\n" +
                "\n" +
                "– Trước đây con còn thấp nên không bỏ thư vào hòm thư được, bây giờ con lớn có thể bỏ thư vào được rồi nên con mang gửi hết những bức thư con viết từ trước đến giờ.\n" +
                "\n" +
                "Ông bố nghe xong, tâm trạng rối bời không biết nói gì với con. Một lát sau ông bố nói:\n" +
                "\n" +
                "– Mẹ con giờ ở trên thiên đàng, sau này con viết thư xong, hãy đốt nó đi thì có thể gửi thư cho mẹ được đấy.\n" +
                "\n" +
                "Đợi đứa con ngủ, anh mở những bức thư đó xem đứa con muốn nói gì với mẹ, trong đó có một bức thư khiến anh vô cùng xúc động.\n" +
                "\n" +
                "“Mẹ thân yêu của con: Con nhớ mẹ lắm! Mẹ ơi, hôm nay ở trường con có một tiết mục mẹ cùng con biểu diễn, nhưng vì con không có mẹ nên con không tham gia, con cũng không nói cho bố biết vì sợ bố sẽ nhớ mẹ. Thế là bố đi khắp nơi tìm con, nhưng con muốn bố nhìn thấy con giống như đang đi chơi nên con đã cố ý đứng trước một đồ chơi điện tử. Tuy bố đã mắng con nhưng con đã kiên quyết không nói cho bố biết vì sao. Mẹ ơi, con ngày nào cũng thấy bố đứng trước ảnh mẹ ngắm rất lâu, con nghĩ bố cũng như con rất nhớ mẹ đấy!\n" +
                "\n" +
                "Mẹ ơi, con đã sắp quên giọng nói của mẹ rồi, con xin mẹ trong giấc mơ của con hãy để con được gặp mẹ một lần được không, để con nhìn thấy khuôn mặt của mẹ, nghe thấy giọng nói của mẹ, được không mẹ?\n" +
                "\n" +
                "Con nghe mọi người bảo nếu ôm bức ảnh của người mình nhớ vào lòng rồi đi ngủ thì sẽ mơ thấy người đó, nhưng mà mẹ ơi, vì sao con tối nào cũng làm như thế mà trong giấc mơ của con vẫn không gặp được mẹ?”\n" +
                "\n" +
                "Đọc xong bức thư, ông bố òa khóc. Anh không ngừng tự trách mình: “phải làm sao mới có thể lấp được khoảng trống mà người vợ để lại đây?”\n" +
                "\n" +
                "Chúng ta là những ông bố bà mẹ khi đã mang cuộc sống của đứa con đến với thế giới này có nghĩa là gánh trên vai trách nhiệm vô cùng to lớn. Khi đã là một người mẹ, không nên tăng ca quá nhiều, khi đã là một người bố, không nên uống quá nhiều rượu, đừng nên hút nhiều thuốc, phải chăm sóc tốt cho bản thân mới có thể yêu thương con hết lòng, tuyệt đối đừng nên vì muốn kiếm nhiều tiền mà hủy hoại sức khỏe của mình, không có sức khỏe thì những danh lợi kia có nghĩa lý gì. Và cũng đừng nghĩ rằng đợi đến khi bố mẹ có nhiều tiền thì sẽ như thế này như thế kia, nào ai biết sau này chuyện gì sẽ xảy ra, có thể sau một giây mọi chuyện đã khác.\n" +
                "\n" +
                "Những ông bố bà mẹ xin đừng vì những chuyện nhỏ nhặt mà dễ dàng ly hôn. Vì đau thương lớn nhất sau sự đổ vỡ đó không ai hết mà chính là thuộc về đứa con. Bạn đã kết hôn hay chưa kết hôn thì hãy nhớ một điều, xin hãy quý trọng “nó”."))
    }

    private fun addListStoryTC() {
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/03/vova-phan7-640x440.jpg", "Một ngày đi học của Vova", "Giờ sinh vật \n" +
                "\n" +
                "Cô giáo đưa ra một câu hỏi:\n" +
                "– Tại sao khi ta bón phân thì cây sẽ lớn nhanh hơn?\n" +
                "– Thưa cô vì… vì cây không chịu nổi mùi hôi thối của phân nên đã lớn vọt thật nhanh ạ! – Vova nhanh nhảu.\n" +
                "– ?!\n" +
                "\n" +
                "Giờ tập làm văn\n" +
                "Cô giáo thu bài tập làm văn với đề tài: “Tả con lợn nhà em”. Vova đứng lên xin cô cho khất đến cuối tuần, cô hỏi:\n" +
                "– Sao em chưa làm bài văn xong?\n" +
                "– Dạ… vì bố em đi công tác chưa về ạ!\n" +
                "– À! Chắc là nhờ bố làm hộ chứ gì?\n" +
                "– Không đâu ạ! Chẳng qua em muốn tả cho thật chính xác nên em mới nhảy vào chuồng lợn đo được chiều dài của nó. Còn… cân nặng bao nhiêu thì phải chờ bố em về rồi bắt trói khiêng lên mới biết được ạ.\n" +
                "– !!!\n" +
                "\n" +
                "Giờ địa lý\n" +
                "Vova và Tom thảo luận về chủ đề bốn mùa. Tom hỏi Vova:\n" +
                "– Tại sao mùa lạnh, người ta gọi là mùa đông nhỉ?\n" +
                "– Vì vào mùa lạnh mà nằm đông người thì sẽ ấm.\n" +
                "– Thế sao mùa nóng người ta gọi là mùa hè?\n" +
                "– Vì… mùa nóng nằm ngoài hè thì mát. Có thế mà cũng hỏi.\n" +
                "Giờ vật lý\n" +
                "Cô giáo: Khi ta đi biển, nếu chẳng may thuyền bị thủng, nước ùa vào trong khoang thì ta phải làm thế nào?\n" +
                "Vova: Thưa cô phải xử lý thật nhanh kẻo bị chìm, ta đục thêm một lỗ khác lớn hơn để nước chảy ra ngoài."))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/03/41483617.jpg", "Vova làm việc tốt", "Vova chạy về nhà khoe với mẹ.\n" +
                "\n" +
                "– Hôm nay con đã làm được 1 việc tốt.\n" +
                "– Việc gì thế con?\n" +
                "– Con đã đưa 1 bà cụ già qua đường.\n" +
                "– Ồ thật là 1 việc tốt, này mai con hãy phát huy nhé.\n" +
                "\n" +
                "Ngày hôm sau\n" +
                "\n" +
                "– Hôm nay con và các bạn cùng lớp đã làm được 35 việc tốt\n" +
                "– Việc gì mà nhiều thế con?\n" +
                "– Con và các bạn đã đưa 1 bà cụ già qua đường.\n" +
                "– Hôm nay sao con gặp nhiều cụ già thế?\n" +
                "– Không vẫn 1 bà cụ hôm qua thôi, hôm nay con và các bạn phải vất vả lắm mới đưa được bà cụ qua đường 35 lần đấy. Bà cụ ấy già rồi mà quẫy khoẻ lắm.\n" +
                "\n" +
                "-Mẹ ?!!!"))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/03/truyen_cuoi_moi_nhat_1.jpg", "Ăn gì?", "Ba học sinh gặp nhau bàn tính về chuyện ăn :\n" +
                "\n" +
                "– Học sinh 1: Tôi có thể ăn một lúc năm quả trứng gà\n" +
                "– Học sinh 2: Tưởng gì! Tôi có thể ăn một lúc được mười quả trứng gà\n" +
                "– Học sinh 3: Thế thì nhằm nhò gì! Một lúc tôi có thể ăn hàng trăm quả trứng.\n" +
                "– Học sinh 1, học sinh 2: Trứng gì vậy ?\n" +
                "– Học sinh 3: Trứng cá!\n" +
                "– Học sinh 1 và Học sinh 2: Trời!!!"))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/03/Untitled-640x440.png", "Trong giờ kể chuyện", "Cô giáo đang đọc truyện “Ba chú heo con” cho các bé nghe đến đoạn một chú heo gặp bác nông dân và xin rơm:\n" +
                "\n" +
                "– Bác ơi, cho cháu xin ít rơm nhé!\n" +
                "\n" +
                "Cô giáo ngừng lại hỏi Vova:\n" +
                "\n" +
                "– Con có biết bác nông dân nói gì không?\n" +
                "\n" +
                "Vova :\n" +
                "\n" +
                "– Thưa cô, bác ấy bảo: “Trời ơi! Một con heo biết nói!”.\n" +
                "\n" +
                "Cô giáo tức đỏ mặt, vừa học bài “Sự tích bánh chưng, bánh dày”, Cô lại hỏi tiếp:\n" +
                "\n" +
                "-Thế em có biết bánh chưng có từ bao giờ không?\n" +
                "\n" +
                "Tính theo mùa thì có từ giáp Tết, tính theo ngày thì có tại hàng quà sáng lúc 5 giờ ạ!\n" +
                "Cô giáo tức không chịu được liền mắng :\n" +
                "\n" +
                "– Em có biết tuần này đã bị điểm 2 lần thứ ba rồi không? Vova :\n" +
                "\n" +
                "– Thưa cô, em đã hiểu ý nghĩa câu: “Ghét của nào trời trao của ấy”."))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/03/6901368.jpg", "Voi ăn vụng", "Voi ăn vụng\n" +
                "\n" +
                "Bà mẹ quát cậu con trai:\n" +
                "\n" +
                "– Này, con hay ăn vụng thì tai sẽ to ra nhiều đấy!\n" +
                "\n" +
                "– Hứ, nhưng con có ăn vụng đâu!… À, vậy chắc là voi hay ăn vụng lắm mẹ nhỉ?\n" +
                "\n" +
                "– Sao con lại hỏi vậy?\n" +
                "\n" +
                "– Thì mẹ không thấy tai con voi to thế kia à ??!\n" +
                "\n" +
                "o O o\n" +
                "\n" +
                "Vừa đi vừa ngủ\n" +
                "\n" +
                "Bé Bi ham chơi không chịu đi ngủ, Mẹ nhắc nhở:\n" +
                "\n" +
                "– Bi! Con có vào đi ngủ ngay không?\n" +
                "\n" +
                "– Con không thể vừa đi vừa ngủ được mẹ ạ!\n" +
                "\n" +
                "– …!\n" +
                "\n"))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/03/137.jpg", "Vova tỏ tình", "Vova thường ngồi chung xe bus với Natasa. Một hôm, Vova lấy hết dũng cảm dúi cho Natasa một mẩu giấy, trên đấy viết:\n" +
                "\n" +
                "“Tôi rất thích bạn, nếu bạn đồng ý kết bạn với tôi thì hãy đưa lại mẩu giấy này cho tôi, còn nếu không đồng ý thì hãy vứt nó qua cửa sổ”.\n" +
                "\n" +
                "Một lúc sau Natasa chuyển lại mẩu giấy cũ, Vova vui mừng mở ra xem, trên giấy viết:\n" +
                "\n" +
                "“Cửa sổ đóng không mở được”."))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/04/noi-khoac1-640x440.jpg", "Nói khoác gặp nhau", "Anh nọ được dịp nói khoác:\n" +
                "\n" +
                "– Tôi được thấy có nhiều cái lạ lắm, nhưng lạ nhất là có một chiếc thuyền, dài không lấy gì mà đo cho xiết, có người thuở hai mươi tuổi đứng ở đằng mũi bắt đầu đi ra đằng lái, đi đến giữa cột buồm thì đã già, râu tóc bạc phơ, cứ thế đi, đến chết vẫn chưa tới lái.\n" +
                "\n" +
                "Trong làng cũng có một anh nói khoác nổi tiếng, nghe vậy liền kể ngay một câu chuyện:\n" +
                "\n" +
                "– Như thế đã lấy gì làm lạ ! Tôi đi rừng thấy có một cây cao ghê gớm. Có một con chim đậu trên cành cây ấy, đánh rơi một hạt đa. Hạt đa rơi xuống lưng chừng gặp mưa, gặp bụi rồi nảy mầm, đâm rễ thành cây đa. Cây đa lớn lên, sinh hoa, kết quả, hạt đa ở cây đa đó lại rơi vãi ra, đâm chồi, nẩy lộc thành nhiều cây đa con, đa con cũng như cây đa mẹ lớn lên, sinh hoa kết quả, lại nẩy ra hàng đàn cây đa cháu. Cứ thế mãi cho đến khi rơi tới đất thì đã bảy đời tất cả.\n" +
                "\n" +
                "Anh đi xa về nghe thế gân cổ lên cãi:\n" +
                "\n" +
                "– Làm gì có cây cao thế ! Chả ai tin được.\n" +
                "\n" +
                "Anh kia cười ranh mãnh:\n" +
                "\n" +
                "– Ấy không có cây cao như thế thì lấy đâu ra gỗ mà đóng chiếc thuyền của anh?"))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/04/truyen-co-tich-doi-giay-ung-da-trau-640x440.jpg", "Làng điếc", "” Điếc tai là tại hướng đình,\n" +
                "Cả làng điếc hết chứ mình em đâu!” – Ca dao Việt Nam\n" +
                "\n" +
                "Ngày xưa, có một làng nọ không hiểu tại phong thủy, tại hướng đình hay vì một cớ địa lý gì khác mà cả làng đều điếc hết. Điếc từ ông Lý, ông Hương cho đến anh Mõ, điếc từ ông già bà lão, cho đến cô gái ngây thơ, anh nông phu trai tráng, tất cả đều điếc câm, điếc đặc, điếc chẳng chừa một ai.\n" +
                "\n" +
                "Có một điều là không ai chịu nhận mình điếc. Nghe không hiểu họ cũng chẳng bao giờ hỏi lại, mà thực ra dù có nhắc đi nhắc lại đến hàng trăm lần họ cũng không nghe rõ hơn chút nào! Ai cũng muốn tỏ ra mình thông minh và thính tai nên bất cứ chuyện gì, họ chỉ nghe qua một lần rồi tùy hoàn cảnh và thái độ của người nói mà hiểu theo ý mình.\n" +
                "\n" +
                "Một hôm có một người bị lạc mất ba con dê bèn hốt hoảng đi tìm. Lúc đi đến một thửa ruộng, trông thấy bác nông phu đang cày, người ấy lại gần chào và hỏi:\n" +
                "\n" +
                "– Tôi có 3 con dê đi lạc, nếu bác có trông thấy làm ơn bảo cho tôi tìm. Thế nào tôi cũng đền ơn bác không dám quên.\n" +
                "\n" +
                "Bác nông phu giật mình trả lời:\n" +
                "\n" +
                "– Ông định hỏi làm gì mới được chứ. Thửa ruộng này từ đây cho tới cái đập nước đằng kia là của hương hỏa ông cha tôi để lại. Có giấy tờ rõ ràng.\n" +
                "\n" +
                "Bác nông phu múa tay múa chân chỉ huyên thuyên, và chỉ mãi về phía đập nước đằng xa.\n" +
                "\n" +
                "Người đánh mất dê đi đến cạnh đập nước và trông thấy đàn dê của mình đang ăn cỏ ở đấy. Thấy trong bầy dê có một con bị thương ở chân, người ấy bèn nghĩ thầm:\n" +
                "\n" +
                "– Mình đem con dê này biếu cho bác nông phu để đền ơn bác ta mới được.\n" +
                "\n" +
                "Người ấy đuổi đàn dê đến gần bác nông phu bảo:\n" +
                "\n" +
                "– Này bác, cám ơn bác nhé. Nhờ bác tôi mới tìm lại được đàn dê chóng thế này. Đây tôi biếu bác con dê nhỏ này gọi là . . .\n" +
                "\n" +
                "Nông phu trông thấy người ấy chỉ vào con dê bị thương bèn hoảng hốt:\n" +
                "\n" +
                "– Ông này lại còn muốn gì nữa? Dê của ông tôi chẳng hề trông thấy bao giờ. Cả con dê què này cũng thế. Sao ông lại định vu oan cho tôi đánh què dê của ông.\n" +
                "\n" +
                "Người chủ dê vẫn ôn tồn:\n" +
                "\n" +
                "– Không, tôi không thể nào biếu bác mấy con dê lành được. Chỉ một con này cũng đã quá lắm rồi. Đáng lẽ chẳng cần phải biếu bác tí gì cũng chẳng sao mà.\n" +
                "\n" +
                "Hai người cãi nhau và ai cũng cố làm cho người kia phải bằng lòng nghe theo lời mình. Cãi nhau mãi vẫn không xong bèn xoay ra đánh nhau. Họ đánh nhau ngay giữa đường nên lúc ấy có một người cưỡi ngựa đi qua, hai chàng bèn nắm chặt cổ áo nhau, kéo đến trước mặt người cưỡi ngựa nhờ người ấy phân xử.\n" +
                "\n" +
                "Người chủ dê nói trước:\n" +
                "\n" +
                "– Tôi bị lạc mất 3 con dê. Nhờ bác ấy chỉ giúp nên tôi tìm lại được. Tôi muốn đem con dê què này biếu bác ấy để đền ơn, nhưng bác ấy tham lam vô độ, lại còn đòi lấy nốt cả hai con dê lành. Tôi không chịu nên bác ấy đánh tôi.\n" +
                "\n" +
                "Đến lượt bác nông phu nói:\n" +
                "\n" +
                "– Tôi đang cày trong ruộng của tôi, ông này bỗng nhiên ở đâu chạy đến đòi tra hỏi đất nào là đất của tôi. Tôi bèn chỉ cho ông ta xem cái đập nước đằng kia là giới hạn đất của tôi, và thửa ruộng này là của ông cha tôi để lại. Ông ấy khám đất xong dắt 3 con dê này đến, vu cáo một cách vô lý rằng tôi đánh què dê của ông ta. Đã thế ông ta lại còn đánh tôi.\n" +
                "\n" +
                "Người cưỡi ngựa hết nhìn người này, lại nhìn người kia chẳng biết nói gì.\n" +
                "\n" +
                "Bác nông phu nắm chặt cương kềm cho ngựa đứng vững, có ý định giúp cho người ấy xuống ngựa dễ dàng, nhưng anh ta thấy thế hoảng hốt la lớn:\n" +
                "\n" +
                "– Con ngựa này là của tôi. Lúc tôi mua về nó còn là một con ngựa con. Chính tay tôi đã chăm nuôi săn sóc nó cho đến bây giờ. Các ông định ăn cướp ngựa ban ngày ban mặt thế này sao?\n" +
                "\n" +
                "Ba người dằng co một lúc và lại xoay ra đánh nhau. Đánh mãi mệt quá ba người bèn kéo nhau ra đình làng, nhờ ông Lý phân xử. Mỗi người lần lượt kể rõ lý do của mình. Ông Lý nghe xong nhìn kỹ từng người rồi bảo:\n" +
                "\n" +
                "– Ừ được, chuyện cũng chẳng quan hệ gì lắm. Nếu các chú đều trông thấy rõ trăng đã tròn nghĩa là sắp đến đêm rằm, vậy ngày mai chúng ta sẽ làm lễ tế Đình như thường lệ.\n" +
                "\n" +
                "Ba người tưởng rằng ông Lý hòa giải và bảo rằng nếu còn đánh nhau nữa thì sẽ phạt cả ba, bèn bỏ đi ai về nhà nấy.\n" +
                "\n" +
                "Ông Lý thấy ba người đi rồi bèn đi tìm bà Lý bảo:\n" +
                "\n" +
                "– Vừa rồi có ba người làng đến bảo rằng họ trông thấy trăng đã tròn rồi, vậy bà hãy sửa soạn chúng ta phải lo lễ vật tế đình.\n" +
                "\n" +
                "Bà Lý đáp:\n" +
                "\n" +
                "– Vâng, cám ơn ông. Nếu ông cho tôi một bộ quần áo mới để mặc Tết, thì tôi muốn tự đi chợ chọn hàng và màu tôi thích. Tôi không ngờ ông cũng nhớ rằng áo tôi rách hết cả rồi.\n" +
                "\n" +
                "Bà Lý sung sướng được may áo mới, vội vàng về nhà gọi cô con gái lớn bảo:\n" +
                "\n" +
                "– Cha con cho phép mẹ may một chiếc áo mới. Mẹ đã xin phép cha con lên chợ Huyện tự chọn hàng mẹ thích. Con có muốn đi chọn hàng với mẹ thì sửa soạn đi.\n" +
                "\n" +
                "Cô con gái mừng quá trả lời:\n" +
                "\n" +
                "– Thật không mẹ? Mẹ cũng biết đấy, con có còn là bé con nữa đâu! Con lớn đã lâu rồi mà. Nếu me bằng lòng cho đi lấy chồng thì sung sướng quá! Con thương mẹ quá!\n" +
                "\n" +
                "Cô bé hí hửng sắp được lấy chồng, chạy ra vườn trông thấy vú già bèn ôm chầm lấy vú:\n" +
                "\n" +
                "– Mẹ bằng lòng gã chồng cho tôi rồi vú ơi. Lễ cưới sẽ cử hành ngay lập tức.\n" +
                "\n" +
                "Vú em cảm động khóc òa lên:\n" +
                "\n" +
                "– Hu, hu, tôi ở với ông bà đã mấy chục năm nay rồi. Nhờ ơn Trời Phật xui khiến, ông bà cho tôi về quê thăm nhà, tôi cám ơn ông bà hết sức.\n" +
                "\n" +
                "Câu chuyện tạm ngừng tại đây, nhưng sự thực chuyện của bọn họ không thể nào kể hết được. Chỉ biết rằng cho đến bây giờ bọn họ vẫn hiểu lầm, cãi nhau, đánh nhau và sẽ còn hiểu lầm nhau mãi mãi, vì chẳng ai chịu nhận mình điếc bao giờ! Chỉ có một sự tiến bộ trông thấy là vì thời buổi văn minh, nên họ cãi nhau bằng . . . tiếng ngoại quốc."))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/04/r%C3%A2u-qu%E1%BA%B7p.jpg", "Râu quặp", "Có một anh chàng rất sợ vợ. Quanh năm anh ta không dám nói vợ nửa lời. Ngày nào anh ta cũng phải làm theo lời sai khiến chỉ bảo của vợ. Ðã thế mà thôi đâu, nhiều lúc anh còn bị vợ đay nghiến, nhiếc móc thậm tệ.\n" +
                "\n" +
                "Tức tối vô cùng, một hôm anh ra chợ tỉnh bói xem tại sao mình phải sợ vợ. Thầy bói không cần gieo quẻ, liền nói:\n" +
                "\n" +
                "– Nhìn tướng mạo anh thì sợ vợ là phải, vì có chòm râu mọc quặp vào trong.\n" +
                "\n" +
                "Nghe thầy bói nói như vậy, hôm sau vợ đi vắng, ngổi ở nhà một mình, anh ta lấy gương soi rồi cầm râu vuốt ra và nói:\n" +
                "\n" +
                "– Ngồi buồn thong thả, vuốt râu cho thẳng ra kẻo mà sợ vợ.\n" +
                "\n" +
                "Nào ngờ, vừa lúc đó, chị vợ đi làm về. Nghe được câu nói đó của chồng, chị gắt giọng:\n" +
                "\n" +
                "– Ông ở nhà, nói cái gì lảm nhảm một mình như vậy?\n" +
                "\n" +
                "Anh ta giật mình lo sợ, liền vuốt râu vào mà nói:\n" +
                "\n" +
                "– Y cựu hoàn y cựu! Y cựu hoàn y cựu!"))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/05/truyen-cuoi-hay-quan-re-thoi.jpg", "Quan rẻ thối", "Có một ông quan huyện thấy cần phải đi hành hạt để xem dân tình trong huyện đối với mình ra sao. Chọn ngày lành tháng tốt quan lên đường.\n" +
                "\n" +
                "Ðể cho oai, quan bắt dân phi phải khiêng mình bằng một chiếc võng đòn con thật đẹp. Lại thêm một chiếc lọng xanh do một cậu lính vác cho ra vẻ.\n" +
                "\n" +
                "Ngày ấy là phiên chợ huyện. Quan muốn dạo chợ. Sắp đến đầu chợ, quan nghe\n" +
                "trong một nhà bên phố, tiếng chồng bảo vợ:\n" +
                "\n" +
                "– Bà mày hôm nay không mua thịt chớ thịt rẻ lắm. Một quan phải hai người gánh. Quan thịt rẻ thối như thế không biết đường mà mua.\n" +
                "\n" +
                "Nói xong anh ta còn đay lại: “Quan rẻ thối”.\n" +
                "\n" +
                "Quan huyện biết lão này chửi xỏ mình, tức quá nhưng không biết trị làm sao được. Thấy lính hầu và dân phu có vẻ đắc ý cười tủm, quan tức quát chạy thẳng, không dạo chợ nữa."))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/05/truyen-cuoi-640x440.jpg", "Điều ước", "Một nhân viên bán hàng, một thư kí và một giám đốc cùng nhau ra ngoài ăn trưa. Họ bất ngờ phát hiện ra một chiếc đèn dầu cổ. Khi họ chà xát để lau chùi bụi bám lên chiếc đèn, thì bất ngờ Thần Đèn hiện ra. Thần Đèn nói:\n" +
                "\n" +
                "– “Ta sẽ tặng các con mỗi người một điều ước. Ai trước nào?”\n" +
                "\n" +
                "– “Con trước, con trước” – cô thư kí lanh lẹ -“Con muốn được ở Bali lướt sóng mà không cần quan tâm, lo lắng đến bất cứ việc gì trên đời này!”\n" +
                "\n" +
                "Bùm.. Cô biến mất.\n" +
                "\n" +
                "– “Con kế tiếp, con kế tiếp” – anh nhân viên bán hàng nôn nóng – “Con muốn được nằm dài trên bờ biển Hawaii, có nhân viên mát xa riêng, uống thỏa thích cocktail cùng với người yêu của con.”\n" +
                "\n" +
                "Bùm.. Anh cũng biến mất.\n" +
                "\n" +
                "– “Còn con?” – Thần Đèn hỏi anh giám đốc\n" +
                "\n" +
                "Anh ước: “Con muốn 2 người đó quay lại phòng làm việc sau giờ nghỉ trưa.”\n" +
                "\n" +
                "Bài học: Luôn luôn để sếp của bạn phát biểu trước."))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/th%E1%BB%ABa-m%E1%BB%99t-con-640x440.jpeg", "Thừa một con thì có", "Một anh ngốc ra chợ mua được một đàn bò sáu con, ngồi lên lưng con đầu đàn rồi dắt cả đàn về. Giữa đường, Ngốc ta lại nhìn đàn bò đằng sau, đếm: Một, hai, ba; Một, hai, ba, bốn… năm. Ðếm đi đếm lại năm, bảy lượt, Ngốc ta vẫn thấy có năm con. Cuống lên Ngốc ta vật đầu vật tai, nhưng không biết làm thế nào cả.\n" +
                "Về đến nhà, thấy vợ đứng chờ ở cổng. Ngốc ta ngồi trên lưng bò mếu máo nói:\n" +
                "\n" +
                "– Chết mất thôi! Tôi đánh mất một con bò rồi!\n" +
                "\n" +
                "Vợ hỏi:\n" +
                "\n" +
                "– Mua mấy con để mất một con?\n" +
                "\n" +
                "Ngốc ta chỉ đàn bò năm con theo sau:\n" +
                "\n" +
                "– Sáu con, bây giờ chỉ còn năm.\n" +
                "\n" +
                "Chị vợ vừa cười, vừa nói:\n" +
                "\n" +
                "– Thừa một con thì có!"))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/02/truyen-cuoi-nguoi-lon-18.jpg", "Nguyện vọng của anh lười", "Có một anh suốt ngày đêm chỉ nằm một chỗ, có hai bữa cơm cũng không muốn há miệng ăn. Thế là chết đói.\n" +
                "\n" +
                "Xuống âm phủ, Diêm Vương bắt đầu làm kiếp mèo. Anh ta bèn tâu:\n" +
                "\n" +
                "– Muôn tâu Ðại Vương, Ðại Vương bắt hóa kiếp mèo, thì xin cho được một bộ lông đen tuyền, chỉ có cái mũi là lông trắng mà thôi.\n" +
                "\n" +
                "Diêm Vương không hiểu ý ra làm sao, hỏi lại:  – Ðể làm gì?\n" +
                "\n" +
                "Anh ta tâu:  – Ðể khi con nằm trong xó tối chuột không trông thấy, chỉ thấy cái đốm trắng, uưởng là cục mỡ, chạy lại gặm, thế là con cứ việc há mồm ra ăn thịt, không mất công rình bắt nữa."))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/02/Con-soi-va-3-con-heo.jpg", "Sói và ba chú heo", "Có ba chú lợn, chú lợn A tên là “Ai” chú lợn B tên là “Đâu” chú lợn C tên là “Gì”\n" +
                "Một ngày nọ, chú lọn A và chú lợn B đứng tại cửa, chú lợn C đứng trên nóc nhà. Có một con sói phát hiện ra các chú lợn, nó muốn ăn thịt hết các chú lợn, thế là nó xông đến trước mặt chú lợn A…\n" +
                "– Sói: Mày là Ai?\n" +
                "– Lợn A: Đúng.\n" +
                "– Sói: Gì?\n" +
                "– Lợn A: Gì ở trên nóc nhà.\n" +
                "– Sói: Tao hỏi là mày tên gì?\n" +
                "– Lợn A: Tao là ai, Gì ở trên nóc nhà.\n" +
                "– Sói lại hỏi Lợn B.\n" +
                "– Sói: Thế mày là ai?\n" +
                "– Lợn B: Tao không phải là ai, nó là ai (chỉ về phía Lợn A)\n" +
                "– Sói: Mày quen nó?\n" +
                "– Lợn B: Ừ.\n" +
                "– Sói: Nó là ai?\n" +
                "– Lợn B: Đúng vậy.\n" +
                "– Sói: Gì?\n" +
                "– Lợn B: Gì ở trên nóc nhà.\n" +
                "– Sói: Đâu?\n" +
                "– Lợn B: Đâu là tao.\n" +
                "– Sói: Ai?\n" +
                "– Lợn B: Nó là ai (lại chỉ về phía Lợn A)\n" +
                "– Sói: Làm sao mà tao biết được.\n" +
                "– Lợn B: Thế mày tìm ai?\n" +
                "– Sói: Gì?\n" +
                "– Lợn B: Nó ở trên nóc nhà.\n" +
                "– Sói: Đâu?\n" +
                "– Lợn B: Là tao.\n" +
                "– Sói: Ai?\n" +
                "– Lợn B: Tao không phải là ai, Nó là ai.\n" +
                "– Sói: Trời ạ!\n" +
                "– Lợn A, Lợn B: “Trời ạ” là bố chúng tao.\n" +
                "– Sói: Gì, là bố của chúng mày?\n" +
                "– Lợn B: Không phải!\n" +
                "– ” Sói chịu không nổi nữa, ngước lên trời than: “Tại sao?”\n" +
                "– Lợn A, B, C: Mày quen ông của chúng tao?\n" +
                "– Sói: Gì?\n" +
                "– Lợn A: không phải, tại sao là ông của bọn tao.\n" +
                "– Sói: Tại sao?\n" +
                "– Lợn A: Đúng!\n" +
                "– Sói: Là gì?\n" +
                "– Lợn A: Không, là “tại sao”.\n" +
                "– Sói: Ai?\n" +
                "– Lợn A: Tao là ai.\n" +
                "– Sói: Mày là ai?\n" +
                "– Lợn A: Đúng, tao là ai.\n" +
                "– Sói: Gì?\n" +
                "– Lợn A, B: Nó ở trên nóc nhà.\n" +
                "……….\n" +
                "Sói lăn đùng ra ngất.!!"))
        listStoryTC.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/02/thumbs_cartoon-dog-character1.jpg", "Thơ vịnh con chó", "Có anh học trò nhỡ độ đường, vào huyện ăn xin, nói là học trò nghèo. Quan huyện vốn trước cũng là học trò nghèo, thương hại bảo:\n" +
                "\n" +
                "– Có phải anh học trò thì ta ra đề “Con chó” cho mà làm, làm được, sẽ có thưởng.\n" +
                "\n" +
                "Anh học trò nghĩ một hồi lâu đọc:\n" +
                "\n" +
                "Thoạt thấy chủ về, ngoe nguẩy theo,\n" +
                "Thương ôi! con chó ngỡ con mèo!\n" +
                "\n" +
                "Quan huyện nghe, phán:\n" +
                "\n" +
                "– Được, được, khá đấy! Học trò khá thật! Thơ không hay lắm, nhưng được cái đúng vần.\n" +
                "\n" +
                "Liền thưởng cho một quan tiền. Anh ta lạy tạ mang tiền ra về. Giữa đường, gặp một anh học trò khác. Anh này hỏi:\n" +
                "\n" +
                "– Tiền đâu mà nhiều thế?\n" +
                "\n" +
                "Anh kia kể hết đầu đuôi. Anh này liền vào huyện, cũng nói học trò nghèo, nhỡ độ đường. Quan huyện cũng ra thơ cho làm. Cũng đầu đề “Con chó”. Anh ta mừng quýnh, tưởng chuyến này ăn chắc, liền đọc:\n" +
                "\n" +
                "Thoạt thấy chủ nhà, ngoe nguẩy thời,\n" +
                "Thương ôi, con chó ngỡ ông trời!\n" +
                "\n" +
                "Quan huyện nghĩ anh này ám chỉ mình, tái mặt, sai lính đánh mấy chục roi, đuổi ra."))
    }

    private fun addListStoryTNN() {
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/gi%C3%B3-v%C3%A0-ng%C6%B0%E1%BB%9Di-du-kh%C3%A1ch-640x440.jpg", "Gió Bắc Và Mặt Trời", "Gió Bắc và Mặt Trời cãi nhau ai cũng cho mình là người mạnh mẽ hơn. Khi họ đang cãi nhau, sức nóng tỏa ra hầm hập và gió nổi lên ào ào, lúc đó có một người khách lạ đi trên đường mặc một chiếc áo khoác.\n" +
                "“Chúng ta hãy đồng ý với nhau như thế này,” Mặt Trời nói, “Ai lột bỏ được chiếc áo của người kia thì kẻ đó sẽ là người mạnh nhất.”\n" +
                "“Rất tốt,” Gió Bắc gầm lên, và lập tức thổi đến một cơn gió lạnh, ào ào tạt vào người du khách.\n" +
                "Khi cơn gió đầu tiên thổi, vạt áo của người du kháck cứ quất phần phật vào người anh ta. Anh ta vội vã quấn chặt nó vào người, khi gió càng mạnh thì anh lại giữ nó càng chặt thêm. Gió Bắc giận dữ xé nát cả chiếc áo của anh, nhưng vô ích, anh nhất định không buông nó ra.\n" +
                "Đến lượt Mặt Trời bắt đầu chiếu nắng. Ban đầu, những tia nắng của Mặt Trời còn dịu dàng, ấm áp dễ chịu sau cái lạnh giá của Gió Bắc, Người Du Khách nới lỏng nút áo và phanh ngực ra cho dễ chịu. Khi những tia nắng của Mặt Trời trở nên nóng hơn rồi lại nóng hơn nữa. Người Du Khách bỏ mũ ra và lau mồ hôi trên mặt. Cuối cùng nóng quá anh ta lột luôn cả chiếc áo ra, chạy nhanh tới một gốc cây to có bóng mát bên đường.\n" +
                "\n" +
                "Lời bàn: Nhẹ nhàng và tử tế luôn có sức thuyết phục hơn là bạo lực"))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/b%C3%A1c-ti%E1%BB%81u-phu.jpg", "Thần Mercury và Bác Tiều Phu", "Một Bác Tiều Phu nghèo chặt cây gần một vũng nước sâu trong rừng. Trời đã gần tối và Bác Tiều cũng đã mệt mỏi. Bác đã làm việc vất vả từ sáng sớm và những nhát rìu của bác không còn được chính xác như lúc sáng sớm nữa. Bỗng bác trượt tay và chiếc rìu văng khỏi tay bác bay vèo ngay xuống vũng nước.\n" +
                "Bác đứng nhìn thất vọng. Chiếc rìu là tất cả tài sản mà bác có để kiếm sống, bác chẳng có tiền đâu mà mua một chiếc mới. Khi bác cứ vặn tay đứng nhìn và khóc, thần Mercury bỗng xuất hiện và hỏi bác có chuyện gì thế. Bác Tiều kể lại tất cả mọi việc, và ngay lập tức, vị thần Mercury tốt bụng liền lao xuống vũng nước. Khi thần trở lên, trong tay thần là một chiếc rìu bằng vàng tuyệt diệu.\n" +
                "“Có phải chiếc này của ông không?” Thần hỏi Bác Tiều Phu.\n" +
                "“Không,” Bác Tiều Phu thật thà trả lời, “nó không phải của tôi đâu.”\n" +
                "Thần Mercury để chiếc rìu vàng trên bờ và lại lao xuống nước một lần nữa. Lần này thần mang lên một chiếc rìu bạc, nhưng Bác Tiều Phu vẫn bảo không phải là chiếc rìu của bác, và chiếc rìu của bác chỉ là một chiếc rìu bình thường có cán gỗ mà thôi.\n" +
                "Thần Mercury lại lặn xuống nước lần thứ ba, và khi thần trở lên, thì lần này thần tìm được đúng chiếc rìu bác đã đánh mất.\n" +
                "Bác Tiều Phu nghèo vui mừng khi đã tìm lại được chiếc rìu và rối rít cảm ơn vị thần. Thần Mercury hết sức hài lòng trước sự lưõng thiện của bác.\n" +
                "“Ta rất ngưỡng mộ tính lưõng thiện của ngươi,” thần bảo, “và để thưởng cho ngươi, ta ban cho ngươi luôn cả hai chiếc rìu vàng và bạc kia đấy.”\n" +
                "Bác Tiều Phu sung sướng trở về nhà với báu vật của mình, chẳng mấy chốc, câu chuyện của bác mọi người trong làng đều được biết. Thế là giờ đây, có nhiều người tiều phu trong làng cũng nghĩ rằng họ cũng có thể gặp được may mắn như bác. Họ vội đi vào rừng, mỗi người một chỗ, giấu chiếc rìu của họ đi và giả vờ họ đã bị mất. Rồi họ khóc lóc than van và kêu gọi thần Mercury đến cứu giúp họ.\n" +
                "Và quả thực, thần Mercury lại hiện ra, hết với người này lại đến với người khác. Với mỗi người, thần lại cho xem rìu vàng, và ai cũng nhanh nhảu nhận nó là chiếc rìu họ đã đánh mất. Nhưng thần không cho họ rìu vàng. Ồ không! Thay vì cho rìu vàng, thần lại gõ cho họ một cú vào đầu thật đau và đuổi họ về nhà. Hôm sau, khi họ trở lại để tìm chiếc rìu mà họ đã giấu trong rừng, họ cũng chẳng tìm thấy chúng ở đâu.\n" +
                "\n" +
                "Lời bàn: Thật thà là tốt nhất"))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/c%C3%A1nh-%C3%A9n.jpg", "Người tiêu hoang và con chim Én", "Một thanh niên trẻ, nổi tiếng trong đám bạn bè của anh ta về tính tiêu xài hoang phí, chẳng bao lâu đã nhẵn túi vì cố tiêu xài để giữ gìn lấy tiếng tăm cho mình. Vào một ngày mùa xuân đẹp trời, anh ta đã không còn một đồng xu dính túi, và cũng chẳng còn tài sản gì để bán đi mua lấy chiếc áo mới thay cho chiếc cũ đã sờn rách.\n" +
                "\n" +
                "Anh sẽ phải đi gặp bạn bè vào buổi sáng hôm đó, nhưng chẳng biết lấy tiền đâu ra để ăn mặc cho đẹp đẽ như mọi khi. Ngay lúc đó, một con chim Én bay qua, hót líu lo vui vẻ, và người thanh niên kia, cứ ngỡ là mùa hạ đã đến, vội vã mang tất cả quần áo cũ đi bán cho tiệm bán quần áo để đối lấy một chiếc áo mới.\n" +
                "\n" +
                "Thế nhưng chỉ vài ngày sau, thời tiết thay đổi và trở lạnh khủng khiếp, con Én tội nghiệp và anh chàng ngu ngốc với chiếc áo mới mỏng manh ngắn tay và đôi chân trần, trân mình trong giá buốt run rẩy và khó thoát được cái chết.\n" +
                "\n" +
                "Lời bàn: Một con Én không làm nên nổi một xuân."))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/b%E1%BB%8D-c%C3%A1nh-c%E1%BB%A9ng-660x378.jpg", "Đại Bàng Và Bọ Cánh Cứng", "Có lần một con Bọ Cánh Cứng năn nỉ Đại Bàng xin tha mạng cho một con thỏ bị Đại Bàng rượt chạy đến nó xin che chở. Nhưng Đại Bàng vẫn vồ lấy con mồi, sức vỗ mạnh của đôi cánh của nó hất văng Bọ Cánh Cứng ra xa đến cả chục thước. Nổi giận trước cái cách đối xử xem thường nó của Đại Bàng, Bọ Cánh Cứng bay vào tổ Đại Bàng và lăn trứng cho rơi xuống. Nó không chừa một cái trứng nào. Đại Bàng đau xót và giận dữ vô hạn, nhưng nó không biết ai đã làm cái việc tàn nhẫn này.\n" +
                "Năm sau, Đại Bàng xây tổ rất xa, cao trên một mỏm đá cheo leo trên núi, nhưng Bọ Cánh Cứng tìm được và một lần nữa lại phá hủy hết ổ trứng của Đại Bàng. Quá thất vọng, Đại Bàng giờ đây chỉ còn cách tìm đến thần Jupiter năn nỉ thần ấp trứng cho nó. Sẽ không ai dám làm hại được trứng của nó. Nhưng Bọ Cánh Cứng bay vo vo trên đầu thần, khiến thần ngẩng đầu lên đuổi nó đi, và trứng dưới bụng thần lăn ra rơi xuống đất.\n" +
                "Bây giờ Bọ Cánh Cứng mới kể cho thần nghe về lý do vì sao nó lại làm như vậy, và thần Jupiter cũng phải thông cảm với nó. Và người ta bảo rằng, từ đó trở về sau này luôn luôn là, mỗi khi Đại Bàng đẻ trứng vào mùa xuân, thì Bọ Cánh Cứng vẫn còn ngủ im trong lòng đất. Vì thần Jupiter đã quyết định cho chúng làm như vậy.\n" +
                "\n" +
                "Lời bàn: Ngay cả những người yếu đuối nhất cũng có thể tìm ra cách trả thù."))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/chuot-660x388.jpg", "Ếch Và Chuột", "Một con chuột nhắt phiêu lưu chạy dọc theo bờ ao ở đó có một con ếch sinh sống. Khi Ếch nhìn thấy Chuột, nó bơi vào bờ và ộp ộp kêu:\n" +
                "\n" +
                "“Không vào chơi với tôi một chút à? Tôi có thể hứa chắc bạn sẽ rất vui khi vào đây đấy.”\n" +
                "\n" +
                "Chuột Nhắt chẳng chờ phải mời mọc thêm, nó đang rất hồi hộp muốn khám phá thế giới và mọi thứ trên đời cho biết. Nhưng mặc dù nó có thể bơi được đôi chút, nó cũng chẳng dám liều mạng nhào xuống ao một mình.\n" +
                "\n" +
                "Nhưng Ếch đã có một cách. Nó lấy một cây sậy còn chắc chắn buộc chân Chuột vào chân nó. Và thế là nó nhào xuống ao, kéo lê theo thằng bạn ngu ngốc đàng sau nó.\n" +
                "\n" +
                "Chuột nhắt chỉ một lát sau đã sặc nước chịu nổi và muốn quay vào bờ; nhưng tên Ếch bội tín kia lại bày trò khác. Nó kéo Chuột lặn xuống nước và dìm cho chuột chết. Nhưng nó chưa kịp cởi sợi dây sậy vẫn còn cột con chuột chết vào chân nó, một con Diều Hâu bay đến lượn trên mặt ao. Nhìn thấy thân Chuột nổi lềnh bềnh trên mặt nước, Diều Hâu lao xuống, quắp lấy Chuột và bay mất, kéo theo con Ếch lủng lẳng treo dưới chân. Vậy là chỉ cần một lần lao xuống bắt mồi, nó đã được cả hai con.\n" +
                "\n" +
                "Lời bàn: Ăn chặn gặp kẻ cướp\n" +
                "\n"))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/con-c%C3%A1o-c%E1%BB%A5t-%C4%91u%C3%B4i.jpg", "Cáo Cụt Đuôi", "Một con Cáo bị mắc bẫy, sau nhiều lần giật mạnh đau đớn vùng vẫy thoát ra được, bèn chạy đi. Nhưng nó phải bỏ lại cái đuôi đẹp đẽ của nó lại trong bẫy.\n" +
                "\n" +
                "Trong một thời gian dài, nó không dám gặp mặt những con Cáo khác, vì nó biết rất rõ rằng, tất cả lũ Cáo kia sẽ lấy nó làm trò cười, chế giễu và đùa cợt sau lưng nó. Nhưng nó sống một mình cũng khó, nó cuối cùng cũng nghĩ ra được một kế để giải quyết cái vấn đề hóc búa này.\n" +
                "\n" +
                "Nó kêu gọi triệu tập một cuộc họp mặt tất cả lũ Cáo, nói rằng nó có một vài điều quan trọng cần phải nói cho cả làng biết.\n" +
                "\n" +
                "Khi chúng đã đến tham dự đông đủ, con Cáo cụt đuôi đứng dậy và diễn thuyết một hồi rất lâu về việc những con Cáo đã mắc nạn chỉ vì cái đuôi của mình.\n" +
                "\n" +
                "Con này thì đã bị chó săn vồ vì khi chạy đuôi bị vướng vào bụi gai. Con kia thì không thể chạy đủ nhanh để thoát vì cái đuôi quá nặng nề. Ngoài ra, như ai cũng đã biết, nó nói, rằng con người bây giờ đi săn Cáo cũng chỉ là muốn có được cái đuôi Cáo, họ cắt đuôi để treo làm chiến tích đi săn thú. Với những chứng cứ về tính nguy hiểm và vô dụng của cái đuôi, Cáo Già nói, nó khuyên tất cả các con Cáo nên về cắt đuôi đi, nếu muốn được sống cho an toàn.\n" +
                "\n" +
                "Khi nó vừa nói xong, một cụ Cáo đứng dậy, nói và cười mỉm:\n" +
                "\n" +
                "“Lão Cáo, xin lão vui lòng quay mặt đi chỗ khác một chút, rồi chúng tôi sẽ trả lời lão.”\n" +
                "\n" +
                "Khi con Cáo Cụt Đuôi tội nghiệp quay mặt đi, cả làng Cáo ồ lên cười và la ó, lúc đó Cáo Cụt Đuôi biết là có thuyết phục lũ Cáo kia bỏ cái đuôi của chúng thì cũng chẳng có ích gì nữa.\n" +
                "\n" +
                "Lời bàn: Đừng bao giờ nghe lời những người không muốn bạn hơn họ."))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/g%C3%A3-keo-ki%E1%BB%87t-640x440.jpg", "Gã Keo Kiệt", "Một gã keo kiệt chôn vàng ở một nơi bí mật trong vườn nhà. Hàng ngày, gã ra chỗ đó, đào vàng lên và đếm từng thỏi một để kiểm tra xem có còn đủ hay không. Ngày nào gã cũng làm như vậy nên một tên Trộm để ý thấy, nó theo dõi gã, đoán biết gã chôn cái gì, và vậy là một đêm nó, nó đến đào lên lấy hết vàng và trốn mất.\n" +
                "Khi gã keo kiệt phát hiện vàng đã bị mất, gã đau khổ và thất vọng vô hạn. Gã rên rỉ và khóc lóc, bứt đầu bứt tai.\n" +
                "Một người đi ngang nghe thấy tiếng gã khóc bèn hỏi có chuyện gì vậy.\n" +
                "“Vàng của tôi! Ô vàng của tôi đâu rồi!” gã càng khóc lớn, điên dại hơn, “đứa nào đã ăn cướp của tao!”\n" +
                "“Vàng của ông ư! Trong cái lỗ ấy à? Sao lại để vàng ở đấy? Sao ông không cất trong nhà để mỗi khi cần lấy bán đi mua đồ có dễ dàng hơn không?”\n" +
                "“Mua đồ ư!” Gã keo kiệt thét lên giận dữ. “Tại sao à, Tôi đâu có bao giờ đụng đến vàng. Tôi không bao giờ dám nghĩ đến chuyện bán đi tí vàng nào cả.”\n" +
                "Người khách lạ nhặt lấy một hòn đá và ném xuống lỗ.\n" +
                "“Nếu thế thì,” anh ta nói, “ ông lấp lỗ lại đi. Nó cũng đáng giá bằng đống vàng ông mất đấy!”\n" +
                "\n" +
                "Lời bàn: Một vật mà không dùng được thì chẳng có giá trị gì.\n" +
                "\n"))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/01/g%C3%A0-tr%E1%BB%91ng.jpg", "Một kẻ hợm hĩnh", "Anh Gà Trống bay lên đậu trên hàng rào rồi rướn cao đầu lên trời.\n" +
                "\n" +
                "– Anh đang ngắm bầu trời đấy à? – Chị Vịt thấy thế liền hỏi.\n" +
                "\n" +
                "– Bầu trời là cái gì đối với tôi cơ chứ ! – Gà Trống đáp lại và rướn cao đầu hơn – Một khoảng không gian ngu xuẩn chất đầy hành tinh đến nỗi không còn chen vào đâu được. Một sự luân phiên nhàm chán giữa ngày và đêm. Tất cả những cái đó đã quá quen thuộc.\n" +
                "\n" +
                "– Thế mà từ lâu em không biết anh là một người thú vị đến thế ! Anh có những ý tưởng mới cao siêu làm sao! Chị Vịt thốt lên.\n" +
                "\n" +
                "– Tôi dang đôi cánh của mình – Anh Gà Trống tiếp tục nói – Tôi sẽ bay cao hơn cả bầu trời, sẽ thách thức với tất cả các hành tinh và rồi bí ẩn nhưng kiêu hãnh, tôi sẽ quay trở về với biển xanh khôn cùng và … tôi sẽ chìm.\n" +
                "\n" +
                "Nói đến đây, Gà Trống chóng mặt mất thăng bằng, ngã nhào xuống vũng nước.\n" +
                "\n" +
                "– Ôi ! – Chị Vịt sợ hãi – Anh đang chìm đấy ư?\n" +
                "\n" +
                "– Ừ ! Đang chìm ! – Gà Trống tức giận trả lời, và rồi nhìn thấy một chú giun, anh ta liền mổ, nuốt chửng.\n" +
                "\n" +
                "Hệt như tất cả những anh gà khác !"))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2013/01/17-bear.jpg", "Bài học đầu tiên của Gấu con", "Ngày chủ nhật Gấu con xin phép mẹ ra đường chơi cùng các bạn. Gấu mẹ dặn:\n" +
                "\n" +
                "– Con chơi ngoan nhé. Nếu làm sai điều gì, con phải xin lỗi. Được ai giúp đỡ thì con phải cảm ơn.\n" +
                "\n" +
                "Gấu con tung tăng chạy nhảy và mải lắng nghe chim Sơn Ca hót nên va phải bạn Sóc khiến giỏ nấm văng tung toé ra đất. Gấu con vội vàng khoanh tay và lễ phép nói:\n" +
                "\n" +
                "– Cảm ơn bạn Sóc!\n" +
                "\n" +
                "Nói xong Gấu con cúi xuống nhặt nấm bỏ vào giỏ giúp Sóc. Sóc ngạc nhiên nói:\n" +
                "\n" +
                "– Sao Gấu con lại cảm ơn, phải nói xin lỗi chứ!\n" +
                "\n" +
                "Mải nhìn Khỉ mẹ ngồi chải lông cho Khỉ con nên Gấu con bị trượt chân, rơi xuống hố sâu. Gấu con sợ quá kêu thất thanh:\n" +
                "\n" +
                "– Cứu tôi với! Ai cứu tôi !!!\n" +
                "\n" +
                "Bác Voi ở đâu đi tới liền đưa vòi xuống hố và nhấc bổng Gấu con lên mặt đất. Gấu con luôn miệng:\n" +
                "\n" +
                "– Cháu xin lỗi bác Voi, Cháu xin lỗi bác Voi!\n" +
                "\n" +
                "Bác Voi cũng rất ngạc nhiên liền nói:\n" +
                "\n" +
                "– Sao Gấu con lại xin lỗi, phải nói cảm ơn chứ!\n" +
                "\n" +
                "Về nhà, Gấu con kể lại chuyện cho mẹ nghe. Gấu mẹ ôn tồn giảng giải:\n" +
                "\n" +
                "– Con nói như vậy là sai rồi. Khi làm đổ nấm của bạn Sóc, con phải xin lỗi. Còn khi bác Voi cứu con ra khỏi hố sâu, con phải cảm ơn.\n" +
                "\n" +
                "– Con nhớ rồi ạ! – Gấu con vui vẻ nói."))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2013/01/17-anis.jpg", "Suy bụng ta ra bụng người", "Suy bụng ta ra bụng người\n" +
                "\n" +
                "Có con quạ tha được xác một con chuột thối về ngồi trên cây rỉa mồi. Diều từ trên cao ngó thấy liền hạ cánh xuống bảo:\n" +
                "\n" +
                "– Này anh Quạ ơi, xác con chuột bị ngấm thuốc độc, đừng ăn mà chết đấy anh ạ!\n" +
                "\n" +
                "Quạ chẳng nghe mà lại còn la mắng:\n" +
                "\n" +
                "– Anh muốn chia phần miếng mồi ngon của tôi đấy hử, chẳng đời nào!\n" +
                "\n" +
                "Nói rồi Quạ bấu lấy con mồi, quay lưng lại ăn tiếp. Diều thấy ý tốt của mình bị nghi oan liền bỏ đi không thèm nói nữa. Quạ ăn hết miếng mồi, liền bị đứt ruột chết ngay.\n" +
                "\n" +
                "Trùn và cá\n" +
                "\n" +
                "Trùn bị móc vào lưỡi câu quăng xuống nước, thấy Cá lượn muốn cắn, nó lên tiếng bảo:\n" +
                "\n" +
                "– Người ta bắt tôi làm mồi để câu anh. Tôi chết đã đành, còn anh bị mắc câu sống thế nào được?\n" +
                "\n" +
                "Cá nghe nói thế sợ hãi bỏ đi.\n" +
                "\n" +
                "Người đi câu chờ lâu không thấy động, ngỡ là con mồi kém nhạy nên gỡ Trùn quẳng đi. Nhờ vậy Trùn lại gặp Cá. Cá ngỏ lời cám ơn.\n" +
                "\n" +
                "Nhưng Trùn cũng cám ơn lại Cá vì nhờ Cá không ăn mồi nên người ta mới gỡ Trùn quẳng đi."))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/09/ch%C3%B3-v%C3%A0-ng%C6%B0%E1%BB%9Di-%C4%91%E1%BA%A7u-b%E1%BA%BFp.jpg", "Chó và người đầu bếp", "Một người nhà giàu mở tiệc lớn, anh ta mời nhiều bạn bè và những người quen biết. Nhân dịp này con chó của anh ta cũng tự cho mình quyền được mời một con chó lạ là bạn nó, bảo với nó rằng,\n" +
                "\n" +
                "– “chủ tớ đãi tiệc, chắc chắn là sẽ có nhiều thức ăn thừa, đến ăn với tớ nhé.”.\n" +
                "\n" +
                "Con chó được mời liền đến đúng hẹn, xem thấy thức ăn bày biện thừa mứa thì rất khoái, nói rằng,\n" +
                "\n" +
                "-“ôi sung sướng làm sao khi mình đã đến đây! Đâu phải lúc nào mình cũng được như thế này. Mình sẽ ăn cho đã cho no cả hôm nay và ngày mai.”.\n" +
                "\n" +
                "Trong khi nó hân hoan và vẫy đuôi tỏ vẻ vui mừng với bạn thì người đầu bếp trông thấy liền tóm lấy bốn cẳng nó ném ra ngoài cửa sổ. Nó rõi đánh bịch một cái xuống đất và khệnh khạng chạy đi, tru lên đau đớn. Tiếng kêu của nó chẳng mấy chốc làm mấy con chó chạy rong trên đường chú ý, chạy lại hỏi thăm là nó đã ăn tiệc có thích không. Nó trả lời,\n" +
                "\n" +
                "” Sao, à nói thật với bạn, tôi uống rượu nhiều quá nên chẳng nhớ gì cả. Tôi chẳng biết lúc mình ra khỏi nhà như thế nào nữa.\n" +
                "Lời bàn: Người nào vào nhà bằng cửa sau thì sẽ ra bằng cửa sổ"))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2013/01/25-taythi.jpg", "Đông thi", "Thời Xuân Thu, ở nước Việt có một cô gái vô cùng xinh đẹp tên là Tây Thi. Nàng được người đời sau coi là một trong tứ đại mỹ nhân của Trung Quốc cổ đại. Người ta thường tả sắc đẹp của nàng khiến cho chim sa cá lặn, hoa nhường nguyệt thẹn. Trong mắt mọi người, từng động tác cử chỉ bình thường của nàng cũng đều uyển chuyển, đẹp đẽ đáng yêu.\n" +
                "\n" +
                "Tây Thi bị bệnh đau ngực, cứ mỗi lần phát bệnh, nàng đều lấy tay ôm ngực, cau mày nhăn mặt. Dù vậy, trong mắt mọi người, ngay cả dáng vẻ ấy của nàng cũng đẹp não nùng, khiến cho người ta thêm yêu mến.\n" +
                "Ở thôn bên cạnh có một cô gái xấu xí tên là Đông Thi, luôn tìm mọi cách trang điểm để trở nên xinh đẹp. Một hôm, Đông Thi gặp Tây Thi trên đường, thấy Tây Thi lấy tay ôm ngực, cau mày nhăn mặt, trông vô cùng xinh đẹp. Đông Thi nghĩ, người ta ca ngợi Tây Thi xinh đẹp, hoá ra là vì dáng vẻ của cô ta khi nhăn mặt, nếu làm như thế nhất định mình cũng sẽ trở nên xinh đẹp. Thế là Đông Thi bắt trước Tây Thi, tay ôm ngực, cau mày nhăn mặt, diễu qua diễu lại trong thôn. Điệu làm bộ làm tịch ấy khiến cho cô ta vốn đã xấu xí lại càng trở nên khó coi hơn, mọi người trông thấy đều phải vội vàng đóng cửa lại.\n" +
                "\n" +
                "Lời bàn:\n" +
                "Muốn được trở nên xinh đẹp không có gì là sai. Đông Thi đã sai ở chỗ không hiểu thế nào là đẹp. Không phải thấy người khác đẹp, cứ bắt chước theo là có thể trở nên xinh đẹp. Biết là chính mình, tự nhiên như mình vốn có thì đã đẹp lên một phần rồi."))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2013/01/26-old.jpg", "Lão hà tiện", "Ngày xửa ngày xưa, có một lão hà tiện yêu tiền hơn yêu cuộc sống của mình. Ông ta có một đứa con mười tuổi và rất nhiều nô bộc trong nhà. Lão hà tiện thấy nô bộc của mình cứ ra ra vào vào, trong lòng rất lo lắng. Hắn nghĩ, nếu nô bộc lấy cắp đồ đạc của mình mà mình không biết thì rõ ràng là đã mất quá nhiều!\n" +
                "\n" +
                "Lão hà tiện liền đuổi việc tất cả nô bộc trong nhà, bán cả nhà, đổi toàn bộ tài sản của mình thành vàng và chôn xuống đất. Hắn và đứa con trai ở trong hai căn phòng nhỏ, sống cuộc sống bình thường như những người khác. Không lâu sau đó, lão hà tiện lại có nỗi khổ khác, lão e rằng tiền vàng mà mình chôn dưới đất sẽ bị ai đó phát hiện ra. Thế là ngày nào lão cũng đào tiền vàng lên kiểm tra, chỉ khi tận mắt nhìn thấy những đồng tiền vàng óng lão mới yên tâm.\n" +
                "\n" +
                "Hành động kỳ quặc đó của lão hà tiện khiến mọi người chú ý, đặc biệt là người chăn cừu hàng xóm. Có một hôm, lão hà tiện lại đến chỗ giấu vàng, đảo mắt nhìn quanh thấy không có ai mới dám nhẹ nhàng đào hòm tiền vàng lên, đếm đi đếm lại, sau đó lại chôn vào chỗ cũ, yên tâm về nhà. Người chăn cừu nấp đằng sau một cái cây đã nhìn thấy tất cả. Thế là anh liền đến chỗ lão hà tiện chôn hòm tiền vàng, đào lên và mang chia cho những người nghèo trong làng.\n" +
                "\n" +
                "Ngày hôm sau, lão hà tiện lại đến chỗ chôn tiền vàng kiểm tra, khi phát hiện ra tiền vàng không còn nữa, liền ôm mặt khóc rưng rức. Có người thấy vẻ đau khổ của lão hà tiện liền hỏi nguyên do và an ủi:\n" +
                "– Ông đừng buồn nữa, tiền vàng tuy là của ông, nhưng từ trước đến nay ông chưa dùng gì đến nó, như vậy còn có ý nghĩa gì nữa? Bây giờ tuy không còn tiền nữa, nhưng nếu tiền có thể phát huy được tác dụng của nó, thì ông cũng nên cảm thấy vui mừng thay nó chứ, phải không?\n" +
                "\n" +
                "Lời bàn:\n" +
                "Tiền dù có nhiều đến mấy nhưng không phát huy được tác dụng của nó thì cũng chỉ giống như đống sắt vụn mà thôi."))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2013/01/14-rabbit.jpg", "Thỏ và Nhền Nhện", "Thỏ và Nhền Nhện thường đi kiếm ăn cùng nhau, chúng phân phối rất ăn ý nên lần nào cũng được no say.\n" +
                "\n" +
                "Một hôm chúng lại đi kiếm mồi. Nhưng lần này chúng không gặp may, phải mất bao thời gian chúng mới bắt được một con chim nhỏ. Con chim quá nhỏ không đủ cho hai con, chỉ đủ cho một con. Ai ăn đây? Thỏ bảo nó mất nhiều sức hơn, Nhện thì nói nó phải đổ bao mồ hôi. Cãi nhau mãi mà vẫn chưa có kết quả.\n" +
                "\n" +
                "Xưa nay Nhện vốn xảo quyệt. Nó cúi đầu ngẫm nghĩ. Rồi tỏ ra nghiêm chỉnh bảo Thỏ : “Anh Thỏ ạ, càng nhìn tôi càng thấy con chim này không bình thường, đây là con chim thần chúng ta không nên tranh giành nữa”.\n" +
                "\n" +
                "“Cái gì? Chim thần?”, Nhện biết trí thông minh của Thỏ nổi tiếng khắp nơi nhưng nó vẫn giả bộ nói : “Chúng ta không thể đụng vào chim tuỳ tiện được, phạm phải thần linh chúng ta sẽ xúi quẩy cả năm, làm sao bây giờ?”\n" +
                "\n" +
                "“Theo tôi nên chôn nó đi”.\n" +
                "\n" +
                "“Ðúng như thế Thượng đế sẽ không giáng tội lên đầu chúng ta”.\n" +
                "\n" +
                "Lúc chôn chim Nhện ta cố ý để lộ 2 cái chân chim ra ngoài. Thỏ biết Nhện làm thế để sau này tìm cho dễ, nhưng vẫn tỏ ra không hiểu hỏi: “Ðể lộ chân chim thần ra ngoài làm gì?”\n" +
                "\n" +
                "“Ðể bảo vệ chim thần tốt hơn không cho ai dẫm phải. Anh xem người khác qua đây trông thấy chân chim thần lại không nhanh rảo bước sao? Nhện giải thích.\n" +
                "\n" +
                "Mờ sáng hôm sau Nhện bèn lén đến cầm 2 chân chim mà lôi lên rồi kéo về nhà. Nó nói với vợ : “Hãy rán lên đã. Ðợi đến đêm chúng ta sẽ ăn. Phải cẩn thận đừng để nhà Thỏ trông thấy” nói xong Nhện bỏ đi chơi.\n" +
                "\n" +
                "Phải mất gần một ngày Nhện cái mới rán xong chim. Trời xẩm tối, Nhện cái cất chim rán trong một nồi, đậy điệm kỹ càng rồi vờ như không có gì sang tán phét cùng Thỏ cái.\n" +
                "Ðêm khuya, chẳng còn nhà nào thắp đèn, Nhện đực và Nhện cái cũng phải về nhà.\n" +
                "\n" +
                "Nhện đực dương dương tự đắc nói với vợ: “Giờ thì chúng ta ăn thịt rán được rồi, ăn từ từ thôi còn khối, không được gây tiếng ồn”. Nhện đực mở vung nồi. Ai ngờ vung kểnh, trong nồi chẳng còn lấy một mẩu xương chim. Nhện đực ngớ người ra, Nhện cái cũng không hiểu, lũ Nhện con càng ngơ ngác.\n" +
                "\n" +
                "Chim rán biến đâu mất? Chắc ai cũng đoán ra, chú Thỏ thông minh đã theo dõi Nhện từ đầu đến cuối. Ðợi cho Nhện cái rán chim xong bỏ vào nồi Thỏ ta vào lấy trộm đem giấu ở bìa làng.\n" +
                "\n" +
                "Mất chim rán Nhện đực nổi khùng với vợ, rồi trách mình ngu xuẩn không cất kỹ. Nhện đực còn vu cho Nhện cái ăn hết. Lũ Nhện con không được ăn thịt chim nhao nhao lên đòi. Nhện cái không nói được câu nào.\n" +
                "\n" +
                "Nghe bên nhà Nhện ầm ĩ, Thỏ ta cố tình sang xem rồi khuyên: “nửa đêm rồi cả nhà còn cãi vã gì nữa?”\n" +
                "\n" +
                "Nhện cái vừa bị một trận mắng tức tối trong lòng không kìm được chỉ vào mặt chồng nói : “Chả hiểu ông ấy mang ở đâu về một con chim, bảo tôi rán lên rồi cất vào nồi, ai ngờ lúc định ăn thì đã mất tiêu. Ông ấy còn vu cho tôi ăn vụng, oan cho tôi quá!” nói xong khóc nức nở.\n" +
                "\n" +
                "Nhện đực đứng như trời trồng, không nói được câu nào, chỉ mong có lỗ nào mà chui xuống cho đỡ xấu hổ.\n" +
                "Thỏ ta hoan hỉ mang chim rán về cả nhà cùng ăn. Từ đó Thỏ và Nhện không bao giờ đi kiếm ăn cùng với nhau nữa."))
        listStoryTNN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2013/01/30-cowboy.jpg", "Đôi bò và cặp bánh xe", "Một đôi bò ra sức kéo một chiếc xe chất đầy hàng qua một con đường quê lầy lội. Chúng phải lấy hết sức lực mới kéo nổi chiếc xe, nhưng không hề phàn nàn kêu ca.\n" +
                "\n" +
                "Cặp Bánh Xe thì lại khác hẳn. Mặc dù nhiệm vụ của chúng phải làm là hết sức nhẹ nhàng so với việc của đôi bò, chúng cứ kẽo kẹt rên rỉ theo mỗi vòng quay. Đôi bò tội nghiệp, mặc dù đã phải hết sức mới kéo được chiếc xe đi trong buồn sâu, lại còn phải ù tai vì những tiếng kêu ca phàn nàn nhức óc của Cặp Bánh Xe. Việc này, ai cũng biết, làm cho công việc của chúng trở nên nặng nề khó chịu đựng hơn.\n" +
                "\n" +
                "“Im đi!” Đôi Bò cuối cùng cũng phải la lên, mất hết cả kiên nhẫn. “Bánh Xe chúng mày phải làm những gì mà kêu ca phàn nàn nhức óc thế? Tụi tao phải kéo cả chiếc xe nặng nề, chứ không phải chúng mày, nhưng chúng tao có kêu ca gì đâu.”\n" +
                "\n" +
                "Lời bàn: Người sung sướng nhất lại hay kêu ca nhiều nhất!"))
    }

    private fun addListStoryTDG() {
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/huy%E1%BB%81n-quang.jpg", "Huyền Quang", "Vào thời nhà Trần có một người học trò trẻ tuổi ở xứ Bắc tên là Huyền Quang. Nhà chàng không đất cắm dùi nhưng cha mẹ chàng thì cố công cố sức làm thuê làm mướn các nơi để nuôi con ăn học. Khi Huyền Quang đến tuổi lấy vợ, cha mẹ dạm cho một cô gái, con một nhà khá giả trong vùng.\n" +
                "\n" +
                "Trải mấy năm trời, chàng đã từng sêu tết và đi làm rể bên nhà vợ khá là vất vả. Cho đến ngày gia đình sắm lễ vật xin cưới thì đột nhiên bên nhà gái trở mặt, trả lễ lại và từ hôn. Huyền Quang lấy làm buồn lòng vì thói đời tráo trở, chàng càng đau khổ hơn khi thấy cô gái thuận lấy người cháu họ một viên an phủ sứ.\n" +
                "\n" +
                "Sau đó, cha mẹ chàng lại tìm cho con một đám khác, nhưng cuộc nhân duyên lần này cũng dở dang, chỉ vì nhà gái chê nhà trai không có mả làm nên, không phải là nơi nương tựa. Vì vậy cho đến năm hai mươi tuổi Huyền Quang vẫn một thân một mình.\n" +
                "\n" +
                "Từ khi thất vọng về đường tình duyên, Huyền Quang lại càng bấm chí về đường kinh sử. Năm hai mươi tuổi, chàng thi đậu ở trường thi quê nhà, rồi vào thi đình đậu luôn Trạng Nguyên.\n" +
                "\n" +
                "Nghe tin Huyền Quang đậu Trạng Nguyên, có mấy tay phú hộ ở quanh vùng bắn tin cho con gái đến tuổi lấy chồng kèm theo cả một tư cơ đồ sộ. Một ông quan lớn ở kinh kỳ cũng mời quan tân khoa về thái ấp mình để xem mặt cô con gái yêu tuổi vừa đôi tám. Tiếp đó, ngày chàng vào kinh bái mạng để nhậm chức, một viên quan nội giám đến gặp riêng chàng và rỉ vào tai:\n" +
                "\n" +
                "– Hoàng hậu đang kén phò mã cho công chúa ba đấy. Nếu quan Trạng muốn, thì việc tốt đẹp nhất định phải thành.\n" +
                "\n" +
                "Thấy tính đời như vậy, Huyền Quang than:\n" +
                "\n" +
                "Khó khăn thì chẳng ai nhìn,\n" +
                "\n" +
                "Đến khi đỗ Trạng tám nghìn nhân duyên.\n" +
                "\n" +
                "Than đoạn, chàng nguyện sống suốt đời sẽ không lấy vợ. Thế rồi người ta thấy chàng nhất quyết từ chối mọi hứa hẹn tốt đẹp. Nhưng cuộc đời danh vọng của Huyền Quang cũng không làm chàng thấy vui lòng. Nhìn thấy những cảnh tượng xấu xa trong đám quan trường, chàng lại càng ghê tởm. Từ đấy Huyền Quang tỏ ra chán đời. Làm quan chưa được bao lâu, chàng đã đệ đơn lên vua xin từ chức để đi tu. Bấy giờ cha mẹ chàng đã nối gót nhau qua đời.\n" +
                "\n" +
                "Vua không thể nào bắt ép chí của chàng được. Huyền Quang tu hành rất chăm chỉ. Chẳng bao lâu, chàng đã thông thuộc tất cả kho tàng kinh sách của nhà Phật. Rồi đó, nhờ có học vấn không ai bì kịp, Huyền Quang được nhà vua ban cho danh hiệu Quốc sư. Vua còn cho chàng trông nom thư viện Trúc-lâm và cho trụ trì ở một ngôi chùa lớn cai quản hàng mấy nghìn tăng ni. Còn ít tuổi như chàng được trở thành một bậc giáo chủ, người đời bấy giờ coi là việc hiếm có.\n" +
                "\n" +
                "*\n" +
                "\n" +
                "Hồi bấy giờ vua Anh Tông mới lên ngai vàng. Thấy vị tổ Trúc-lâm là một người còn ít tuổi, vua không tin là có thể chịu đựng nổi sự diệt dục khổ hạnh. – “Cứ đưa đến một cô gái đẹp, nhất định thế nào thầy cũng sa ngã”. Nghĩ vậy, vua có ý định thử xem đạo đức của vị tổ trẻ tuổi này như thế nào. Nhân mấy ngày hoàng hậu se mình, vua cho triệu tổ về kinh làm lễ cầu siêu. Sau mấy đêm ngày, công việc cầu siêu đã xong, trước khi chàng trở về chùa, vua sai ban cho 10 lạng vàng để đền công khó nhọc. Huyền Quang không tiện chối từ đành phải cầm lấy, nhưng chàng đâu có ngờ rằng cái bẫy đã bắt đầu giương ra để đợi người nhẹ dạ.\n" +
                "\n" +
                "Thế rồi sau đó ít lâu, vua cho một cung nữ nhan sắc xinh đẹp tên là Điểm Bích, tìm cách đến chùa, nơi Huyền Quang trụ trì, bảo phải quyến rũ cho bằng được. Vua còn dặn Điểm Bích phải làm sao lấy ở sư thầy ít nhất là một lạng vàng đưa về làm tang chứng.\n" +
                "\n" +
                "Lại nói chuyện Huyền Quang hôm ấy nghỉ tại một thiền trai cất trên một ngọn đồi cách viện Trúc-lâm chừng vài dặm. Đây là một gian nhà nhỏ rất tĩnh mịch mà vua sai xây cho chàng để nghỉ ngơi sau những ngày giảng kinh mệt nhọc. Vào khoảng tắt mặt trời, chú tiểu đưa vào một cô gái vẻ mặt hốt hoảng nhợt nhạt, áo xống tơi tả.\n" +
                "\n" +
                "– Bạch thầy, người này bị cướp đuổi vừa gọi cửa kêu cứu.\n" +
                "\n" +
                "Đó là Điểm Bích, lúc này đã cải trang thành một cô gái quê mùa. Nàng khóc sướt mướt, một hai xin chùa cho ở trọ đêm nay. Nàng bịa ra câu chuyện bị côn đồ đuổi và phải chạy chốn vất vả như thế nào làm cho Huyền Quang không thể nào từ chối được. Cuối cùng theo lệnh của chàng, chú tiểu sắp xếp cho Điểm Bích một chỗ nghỉ ở phía ngoài thiền trai.\n" +
                "\n" +
                "Sự việc vừa xảy ra làm cho Huyền Quang thấy trong lòng không được yên tĩnh. Chàng để cho chú tiểu đi nghỉ, rồi giở quyển kinh ra tụng niệm mãi tới khuya. Sắp sửa đặt lưng xuống giường, chàng bỗng nghe thấy tiếng rên rỉ của người đàn bà. Chàng lại phải đánh thức chú tiểu dậy xem thử như thế nào. Khi nghe nói người đàn bà muốn xin được vào nằm phía trong thiền trai, vì ở ngoài không ngăn được sự sợ hãi, Huyền Quang lấy làm bối rối. Nhà thì hẹp chỉ có ba gian, nhân thân chỉ có hai thầy trò; các tăng chúng đều ở xa không tiện gọi.\n" +
                "\n" +
                "Suy nghĩ giây lát, Huyền Quang bất đắc dĩ cho người đàn bà vào ở chỗ tiếp khách, còn mình thì lui vào trai phòng khóa cửa lại. Nhưng vừa chợp mắt đi được một lúc, đã nghe tiếng rên rỉ ở phía ngoài. Chàng lại ngồi dậy cầm lấy tràng hạt và quyển kinh. Nhưng khi bước ra khỏi trai phòng, qua ánh đèn dầu le lói, chàng thấy người đàn bà nằm lõa lồ trên bộ ván. Chàng bước vội trở vào và quyết định ngồi trên giường tụng niệm cho tới sáng để tránh sự cám dỗ. Không ngờ giữa lúc những tiếng tụng niệm vừa cất lên, thì Điểm Bích từ phòng ngoài đã chạy vào, sán lại ngồi bên cạnh chàng, nói những câu cảm ơn nhưng lại xen vào nhiều lời khêu gợi.\n" +
                "\n" +
                "Biết người đàn bà này đến đây có mục đích không lương thiện, Huyền Quang liền nghiêm nét mặt lại:\n" +
                "\n" +
                "– A-di-đà Phật. Nàng là ai? Tại sao lại tìm đường vào đây để quấy rối người tu hành? Nếu không mau mau cải tà quy chính, ta sẽ hô hoán lên cho mọi người đến cầm lá dắt ra khỏi tu viện.\n" +
                "\n" +
                "Thấy Huyền Quang không phải là hạng người dễ quyến rũ, Điểm Bích đành phải thay đổi thái độ. Nàng chuyển sang bộ mặt rầu rĩ và bịa ra câu chuyện để gợi lòng trắc ẩn.\n" +
                "\n" +
                "– Thiếp vốn là con nhà thế phiệt. Bố thiếp làm quan một huyện ở vùng biển. Mùa tháng Năm vừa rồi nhân đi thu thuế được ba nghìn quan, cho dân phu đài tải về kinh. Không ngờ bị bọn cướp đường đón lấy mất cả. Quan trên thương tình cho khất đến cuối năm. Hiện nay bố thiếp đã thu góp tư trang mới được chừng một nửa. Bởi vậy thiếp phải đi khắp đó đây xin các nhà từ thiện kẻ ít người nhiều để bù vào số thiếu. Hôm nay đánh bạo đến đây định xin hòa thượng rủ lòng thương xót quyên cấp cho ít nhiều. Nhưng thấy cảnh chùa tôn nghiêm, nếu nói thật chưa chắc đã được, vì vậy phải dùng mẹo nhỏ để gặp hòa thượng, sau đó mới tỏ bày mục đích. Dám xin hòa thượng mở lượng hải hà cứu vớt bố thiếp và cả nhà thiếp. Thiếp nguyện đưa thân nữ tì hầu hạ suốt đời.\n" +
                "\n" +
                "Nghe nàng sụt sùi kể lể, Huyền Quang không ngăn được cảm động. Chàng vội trả lời:\n" +
                "\n" +
                "– Nàng đừng có lo lắng gì cả. Ngày mai ta sẽ tiến triều, tâu với vua xin tha tội cho cha nàng.\n" +
                "\n" +
                "Sợ Huyền Quang về triều thì việc của mình không đạt, Điểm Bích lại nói:\n" +
                "\n" +
                "– Bạch hòa thượng, việc của bố thiếp còn may là chưa đến tai Thánh thượng. Hòa thượng về tâu giúp cho thật là công đức vô biên, nhưng thiếp không muốn vì việc nhà thiếp làm phiền hòa thượng phải xuống núi nhọc sức.\n" +
                "\n" +
                "Huyền Quang sực nhớ tới mười nén vàng của vua còn bày ở trai phòng. Chàng vội lấy ra đưa cho người đàn bà mà rằng:\n" +
                "\n" +
                "– Ta biếu nàng tất cả, nàng đưa về mà chuộc tội cho cha!\n" +
                "\n" +
                "*\n" +
                "\n" +
                "Lại nói chuyện khi trở về cung, Điểm Bích liền đưa nộp mười nén vàng và tâu đối với vua rằng mình đã cám dỗ đước con mồi. Để vua tin, nàng còn đọc lên một bài thơ yêu đương nói là của Huyền Quang đã ngâm tặng mình trước khi phá giới.\n" +
                "\n" +
                "Vằng vặc trăng mai ánh nước,\n" +
                "\n" +
                "Hiu hiu gió trúc ngâm sinh.\n" +
                "\n" +
                "Người vừa tươi tốt, cảnh vừa lạ,\n" +
                "\n" +
                "Mâu Thích Ca nào chẳng hữu tình.\n" +
                "\n" +
                "Nghe xong câu chuyện và nhìn thấy mấy nén vàng, nhà vua thở dài hối hận:\n" +
                "\n" +
                "– Chao ôi. Bậy quá! Ta đã làm hại một vị tu hành trẻ tuổi. Tự dưng vô cớ đi gài bẫy, nhất định con chim khó có thể tránh được. Biết làm thế nào bây giờ?\n" +
                "\n" +
                "Nghe nói thế, một viên quan ghé vào tai vua hiến kế:\n" +
                "\n" +
                "– Tâu bệ hạ, xin bệ hạ cho thiết lập một lễ cúng Phật dọn toàn cỗ mặn rồi mời thầy về làm lễ. Nếu quả là thầy còn trong sạch thì chư phật sẽ độ cho cỗ mặn hóa thành chay, nhược bằng hư hỏng rồi thì chẳng bao giờ được độ.\n" +
                "\n" +
                "Vua cho là phải, bèn hạ lệnh cho gọi Huyền Quang về triều để chàng làm một lễ chay trọng thể vào dịp rằng tháng Bảy sắp tới.Vua còn bắt quân hầu dựng một đàn tràng nguy nga, các rạp đều trần trướng toàn bằng lụa hoàng quyến.Trái hẳn với tục lệ nhà chùa, hôm bước vào chính lễ, vua ra lệnh cho giết bò và lợn, dọn toàn cỗ mặn.\n" +
                "\n" +
                "Khi sắp bước vào rạp. Huyền Quang biết nhà vua cố ý làm nhục mình. Các mâm cỗ mặn tanh tưởi bày trên đàn kia nếu không phải là một sự xỉ vả thì còn gì nữa. Lụa hoàng quyến nói lái lại rõ ràng ám chỉ hai tiếng “Huyền Quang”. Chàng bèn ngửa mặt lên trời lớn tiếng khấn:\n" +
                "\n" +
                "– Kẻ đệ tử này nếu có điều gì bất chính, xin chư Phật cho đày xuống A-tì địa ngục, còn nếu không, thì xin cho những cỗ mặn kia hóa thành chay tất cả!\n" +
                "\n" +
                "Tự nhiên một trận gió mạnh nổi lên, cát bụi mù mịt, trời đất tối sầm cả lại. Một chốc gió tan, mọi người nhìn lên đàn tràng thì, lạ thay, tất cả các mâm cỗ mặn đều biến thành cỗ chay tinh khiết thơm tho, mọi mùi tanh tưởi đều đã bị quét sạch từ bao giờ. Huyền Quang thủng thỉnh bước lên đàn tràng giữa tiếng reo hò của chúng tăng và mọi người. Vua Anh Tông được tin, lập tức ra lệnh bắt Điểm Bích tra hỏi cho ra sự thật. Biết là bại lộ, người cũng nữ ấy cúi đầu thú hết tội lỗi. Vua truyền bắt Điểm Bích bỏ ngục để chờ ngày phán xử, rồi xa giá tới gặp Huyền Quang tạ lỗi. Câu nói đầu tiền của Huyền Quang là xin vua tha tội cho Điểm Bích."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/ph%C6%A1i-s%C3%A1ch-ph%C6%A1i-b%E1%BB%A5ng-640x440.jpg", "Phơi sách, phơi bụng", "Làng Quỳnh có một lão trọc phú. Lão này đã dốt lại thích học làm sang, thỉnh thoảng mò đến nhà Trạng, đòi mượn sách. Tất nhiên lão có mượn được sách về thì cũng biết gì đâu đọc. Quỳnh bực lắm, một bận, thấy lão lấp ló đầu cổng, Quỳnh vội vác ngay chiếc chõng tre ra sân, cởi áo nằm phơi bụng. Lão trọc phú bước vào, thấy lạ, hỏi:\n" +
                "\n" +
                "– Thầy làm gì thế?\n" +
                "\n" +
                "Quỳnh đáp:\n" +
                "\n" +
                "– À! Có gì đâu! Hôm nay được cái nắng tôi đem phơi sách cho khỏi khô mốc\n" +
                "\n" +
                "– Sách ở đâu?\n" +
                "\n" +
                "Quỳnh chỉ vào bụng:\n" +
                "\n" +
                "– Sách chứa đầy trong này!\n" +
                "\n" +
                "Biết mình bị đuổi khéo, trọc phú lủi thủi ra về.\n" +
                "\n" +
                "Bận khác, lão cho người mời Quỳnh đến nhà. Để rửa mối nhục cũ, lão bắt chước, đánh trần, nằm giữa sân đợi khách…\n" +
                "\n" +
                "Quỳnh vừa bước vào, lão cất giọng con vẹt, bắt chước…\n" +
                "\n" +
                "– Hôm nay được cái nắng tôi nằm phơi sách cho khỏi mốc\n" +
                "\n" +
                "Bất ngờ Quỳnh cười toáng, lấy tay vỗ bình bịch vào cái bụng phệ mà nói;\n" +
                "\n" +
                "– Ruột nhà ông toàn chứa những của ngon chưa tiêu hết phải đem phơi, chứ làm cóc gì có sách mà phơi!\n" +
                "\n" +
                "Lão trố mắt kinh ngạc:\n" +
                "\n" +
                "– Sao thầy biết?\n" +
                "\n" +
                "Quỳnh lại cười toáng lên, lấy tay lắc lắc cái bụng béo ụ ị của lão:\n" +
                "\n" +
                "– Ông nghe rõ chứ? Bụng ông nó đang kêu “Ong óc” đây này! Tiếng cơm, tiếng gà, tiếng cá, lợn… Chứ có phải tiếng chữ, tiếng sách đâu. Thôi ngồi dậy, mặc áo vào nhà đi.\n" +
                "\n" +
                "Lão trọc phú lủi thủi làm theo lời Quỳnh, và ngồi tiếp khách một cách miễn cưỡng."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/cai-can-thuy-ngan.jpg", "Cái cân thủy ngân", "Ngày xưa, có một nhà làm nghề buôn bán, gian tham chế ra một cái cân cán rỗng, trong đổ thủy ngân, hai đầu bịt đồng, không ai biết. Khi cân hàng bán cho người ta thì dốc cán về đằng móc, còn khi cân hàng mua của ai thì dốc cán cân về đằng quả. Như vậy một cái cân vừa nặng vừa nhẹ được, và bao giờ phần lợi cũng về mình.\n" +
                "\n" +
                "Không bao lâu nhà ấy trở nên giàu có, vì buôn bán lọc lừa.\n" +
                "\n" +
                "Nhà này sinh ra được hai đứa con mặt mũi khôi ngô, học hành thông thạo. Thiên hạ ai nấy đều khen là nhà có đại hồng phúc. Một hôm hai vợ chồng ngồi bàn với nhau: “Nhà ta bây giờ đã giàu có nhiều, lại được hai đứa con khôn ngoan học giỏi. Bây giờ ta đem phá bỏ cái cân điên đảo kia đi, để dành đức lại cho con về sau”.\n" +
                "\n" +
                "Bàn xong hai vợ chồng thuận tình làm lễ sám hối, trên thì cúng Phật, dưới cáo cùng tổ tiên, rồi đem cái cân ra chẻ. Khi chẻ ra, thì thấy trong cái cân có đọng một cục máu đỏ.\n" +
                "\n" +
                "Từ đó hai vợ chồng bảo nhau ăn ở tu nhân tích đức, tránh điều dữ, làm điều lành. Nhưng cách đó hai tháng, bỗng một hôm một đứa con lăn ra chết, rồi không bao lâu, đứa con còn lại cũng lăn ra chết nốt. Hai vợ chồng kêu gào khóc lóc thảm thiết, nghĩ rằng mình đã có bụng cải ác vi thiện mà Trời Phật không chứng quả. Rồi hai vợ chồng rầu rĩ khổ sở, cứ ngồi than dài thở vắn, không buồn động đến việc gì nữa.\n" +
                "\n" +
                "Một đêm, hai vợ chồng cùng nằm mơ có ông Bụt đến bảo rằng: “Vợ chồng hãy nên lo toan làm ăn tu tỉnh lại, chớ vội ngồi vậy mà trách Trời không có mắt. Trước Trời thấy chúng mày buôn bán lọc lừa, Trời đã sai hai con quỷ xuống đầu thai phá tan cho hết những của phi nghĩa chúng mày chắt bóp nhặt nhạnh bao nhiêu năm nay. May mà chúng mày sớm biết hối hận, cải tà quy chánh, tránh dữ làm lành, Trời mới sai bắt hai con quỷ ấy về. Đừng thương tiếc chúng nó làm chi nữa. Chúng mày cứ ăn ở ngay lành rồi Trời lại đền cho hai đứa con khác để ngày sau mà nhờ”.\n" +
                "\n" +
                "Hai vợ chồng biết thế, không thương khóc con nữa, lại làm ăn như cũ, và lúc nào cũng tâm tâm niệm niệm, cố gắng làm bao nhiêu điều từ thiện, phúc đức. Quả nhiên sau lại sinh được hai đứa con trai khác. Hai đứa con hiền lành tử tế, văn hay chữ tốt, rồi sau lớn lên, làm cho cha mẹ được vẻ vang sung sướng trong cảnh già."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/08/kh%E1%BB%89-v%C3%A0-ch%C3%A2u-ch%E1%BA%A5u.png", "Khỉ và châu chấu", "Từ ngày mới có mặt đất và muôn loài, các loài vật cùng nói một thứ tiếng như loài người. Chúng sinh sống với nhau rất hòa thuận, không loài nào bắt nạt, chèn ép loài nào. Duy có khỉ là hay ngỗ ngược, chúng cậy mình vừa chạy được ở dưới mặt đất vừa nhảy được ở trên ngọn cây nên hay bắt nạt các loài nhỏ hơn. Lần ấy khỉ đến một nơi nọ thấy một đàn châu chấu đang bay đi nhảy lại trên bãi cỏ xanh rờn. Nhìn đàn châu chấu bay nhảy vui vẻ, khỉ nổi lòng ghen và bỗng nảy ra một ý tinh nghịch.\n" +
                "\n" +
                "Một hôm chẳng biết từ nẻo rừng nào, đàn khỉ kéo nhau đến bãi cỏ. Chúng lăn qua lăn lại quần nát bãi cỏ rồi phóng uế bừa bãi ra đấy. Lũ châu chấu non đang tập bay, chưa cứng cánh bị khỉ đè chết vô kể. Khoàng Tý châu chấu bèn đến gặp Khoàng Tý khỉ để kiện. Khoàng Tý khỉ không những không thèm nghe mà còn dọa dẫm:\n" +
                "\n" +
                "– Bọn mày chưa bằng cái lông bọn tao mà dám láo xược à? Chúng mày muốn yên thân thì cút khỏi đây ngay. Rừng này là của tao, bãi cỏ này cũng là của chúng tao.\n" +
                "\n" +
                "Khoàng Tý châu chấu nghe mà tức đến tận đuôi cánh, nhưng vẫn phân trần:\n" +
                "\n" +
                "– Đầu các bác nhớ sai, miệng các bác nói không đúng rồi! Đây chính là đất đai của chúng tôi đấy! Từ lúc sinh ra chúng tôi đã ở đây. Bố mẹ cụ kỵ chúng tôi cũng ở đây, chết ở đây. Các bác ở trên rừng kia chứ!\n" +
                "\n" +
                "Đàn khỉ chừng mắt quát:\n" +
                "\n" +
                "– Lấy gì làm chứng mà bọn bay dám láo!\n" +
                "\n" +
                "Khoàng Tý châu chấu chỉ vào một mô đất cao giữa bãi cỏ nói:\n" +
                "\n" +
                "– Kia! Các bác xem, mô đất là mồ mả tổ tiên chúng tôi. Chúng tôi ở đây để giữ phần mộ thiêng đó.\n" +
                "\n" +
                "Đàn khỉ re lên cười. Chúng hè nhau nhảy lên mô đất cào bới. Lòng Khoàng Tý châu chấu đau như lá han xát. Khoàng Tý châu chấu không chịu nổi, mắng lũ khỉ:\n" +
                "\n" +
                "– Bớ khỉ! Chúng mày quá lắm! Đưng cậy to xác mà bắt nạt, hà hiếp chúng tao. Chúng tao bé người thật đấy nhưng không sợ chúng mày đâu! Muốn đánh nhay thì đánh!\n" +
                "\n" +
                "Khỉ vẫn nhe răng cười khục khục:\n" +
                "\n" +
                "– Dám thách đánh nhau với bọn tao à? Mỗi đứa chúng mày liệu có chịu được một cái phẩy tay của chúng tao không?\n" +
                "\n" +
                "Khoàng Tý châu chấu cứng cỏi đáp lại:\n" +
                "\n" +
                "– Trưa mai chúng tao sẽ gặp chúng mày ở chỗ này.\n" +
                "\n" +
                "Đàn khỉ lại nhe răng cười ròi lăn mình ra bãi cỏ ngủ khì.\n" +
                "\n" +
                "Khoàng Tý châu chấu trở về liền gọi ngay tất cả bầu đàn thê tử châu chấu lại để bàn việc đánh nhau vởi khỉ rửa nhục. Khi nghe Khoàng Tý của mình nói tơi chuyện đi đánh nhau với khỉ, lúc đầu có nhiều con run sợ. Có con bàn lui:\n" +
                "\n" +
                "– Khoàng Tý à! Ta lớn không bằng một ngón chân của khỉ, đánh chúng không nổi đâu. Ta chạy đi nơi khác nhường chúng đồng cỏ này thôi!\n" +
                "\n" +
                "Nhưng tiếng nói đó chưa kịp dứt thì cả đàn đã nhao nhao phản đối:\n" +
                "\n" +
                "– Không được! Đồng cỏ xanh tốt này là của tổ tiên ta, là của chúng ta, không thể để cho bọn khỉ muốn làm gì thì làm. Cái lý nó không thế. Đất đai của ai người ấy ở chứ. Ta đi mãi được à! Kẻ khác muốn cướp, ta phải đánh nhau thôi!\n" +
                "\n" +
                "Một con châu chấu già bị lũ khỉ giẫm què một chân, cũng tham gia:\n" +
                "\n" +
                "– Tuổi tôi đã gần hết nhưng thù này chưa trả thì chưa thể nhắm mắt được. Ta nhỏ người sức yếu phải biết cùng một bụng, họp cái sức lại cho lớn mới thắng được. Bụng già nghĩ kỹ rồi, chúng nó lớn xác nhưng ngu. Khi chúng đến, chúng ta chia nhay bay đến đậu lên trán, lên đầy chúng nó. Khi chúng thượng cẳng chân hạ cẳng tay nhằm đánh ta, ta nhanh chân nhảy đi, thế là chúng nó sẽ tự đánh nhau đến vỡ đầu. Chúng ta sẽ thắng cuộc dễ dàng mà!\n" +
                "\n" +
                "Đàn hò reo thích thú. Khoàng Tý châu chấu liền chọn những con khỏe nhất để đi đánh trước. Mọi việc đã sắp đặt xong, tất cả cùng một bụng nghĩ. Ngay đêm ấy, bác châu chấu già bay đến lũ khỉ:\n" +
                "\n" +
                "– Này các loài khỉ ơi! Tôi đã già, sức lại yếu, Khoàng Tý châu chấu đã đuổi tôi đi, không cho tôi nhập đoàn. Tôi nghe nói các bác sắp khởi quân đánh nhau với lũ chúng nó. Tôi xin hiến kế để các bác giết hết chúng đi cho hả giận. Các bác là người tốt bụng nên tôi xin mách điều này: cùng loài tôi biết, họ hàng nhà tôi có cánh, bay đến chỗ nào cũng được, nhưng đánh nhau lại rất sợ gậy gộc. Các bác muốn thắng nhanh mà lại không tốn sức thì cứ kiếm mỗi bác một đoạn gậy cứng. Khi chúng nó đến, các bác cứ mang gậy ra khua, bay mỏi cánh, hễ chúng đậu đâu, cứ đập một nhát là nát tan như đập một giọt nước. Chỉ loáng mắt là chết hết mà!\n" +
                "\n" +
                "Châu chấu già nói xong rồi chỉ vào cái chân què nói tiếp:\n" +
                "\n" +
                "– Đây các bác coi, một chân tôi què vì bị đàn cáo dùng gậy quật đấy! May mà tôi chưa mỏi cánh còn bay thoát.\n" +
                "\n" +
                "Đàn khỉ ngốc nghếch nnghe châu chấu già nói vậy liền tin ngay. Sáng hôm sau từ lúc ông mặt trời chưa dậy, đàn khỉ đã chí chéo kéo đến bãi cỏ. Con nào cũng mang theo một đoạn gậy. Chờ mãi vẫn không thấy con châu chấu nào, Khoàng Tý khỉ sai quân đến gặp Khoàng Tý châu chấu.\n" +
                "\n" +
                "Lần thứ nhất, Khoàng Tý châu chấu bảo:\n" +
                "\n" +
                "– Chúng tao còn đang bận ngủ!\n" +
                "\n" +
                "Lần thứ hai, Khoàng Tý châu chấu lại bảo:\n" +
                "\n" +
                "– Chúng tao còn đang bận ăn! Muốn chết chúng mày sẽ được chết! Giục gì!\n" +
                "\n" +
                "Châu chấu cứ nấn ná cho đến khi ông mặt trời đính giữa đỉnh đầu, khi cánh châu chấu đã cứng và cũng là lúc bụng khỉ đói meo. Bất chợt đàn châu chấu mới rào rào bay tới. Lũ khỉ bị đánh úp bất ngờ đâm hốt hoảng. Châu chấu thi nhau nhảy lên đầu lũ khỉ, vừa đá vừa phóng uế bừa.\n" +
                "\n" +
                "Đàn khỉ tức khí cứ thất châu chấu ở đâu là nhè đánh tới tấp. Lũ khỉ đánh lộn nhau, kêu chí chóe. châu chấu càng bay lung tung, đậu lung tung như trêu tức lũ khỉ. Bọn khỉ càng phang lẫn nhau khỏe hơn. Chỉ loáng mắt, xác khỉ đã la liệt trên bãi cỏ, con nào cũng lòi mắt, nhe răng trắng nhởn!\n" +
                "\n" +
                "Thế là hết đời bọn ác, cậy thế hà hiếp bắt nạt kẻ yế. Từ đó đần châu chấu lại ngày ngày tụ tập ở bãi cỏ vui chơi, nhảy nhót như xưa."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/Tiki_Fruit-Starburst1722-SM-660x440.jpg", "Cúng Thành Hoàng", "Lần khác, vợ Quỳnh ốm, thuốc thang chữa mãi không khỏi, xem bói, thì ra không phải tại Chúa Liễu mà do động Thành Hoàng bản thổ. Quỳnh ra đình khấn vái, xin Thành Hoàng cho khỏi, sẽ sửa gà lễ tạ. Khấn xong, về đến nhà thì vợ đã khỏi rồi. Bà vợ giục làm gà lễ tạ, Quỳnh bảo:\n" +
                "\n" +
                "– Được, nhà không có gà ta có cái khác để lễ tạ rồi. Rồi Quỳnh vào ổ gà, thủ hai quả trứng, đem luộc. Người nhà tưởng luộc để đánh gió. Một lúc, Quỳnh khăn áo chững chạc, cầm cái đĩa và hai quả trứng đi. Người nhà lấy làm lạ, đi theo xem, thì thấy Quỳnh vào đình để đĩa trứng lên hương án rồi đứng đọc bài văn tế nôm rằng:\n" +
                "\n" +
                "Chú là kẻ cả trong làng,\n" +
                "Ta là người sang trong nước,\n" +
                "Đôi bên chức tước chả kém gì nhau.\n" +
                "Vì trẻ nó đau, phải ra khấn vái.\n" +
                "Phiên chợ thì trái, không mua được gì.\n" +
                "Nhà có con ri nó vừa nhảy ổ,\n" +
                "Bắt ra mà mổ, nghĩ cũng thương tình,\n" +
                "Chú có anh linh, xơi hai trứng vậy.\n" +
                "Khấn xong, chẳng lễ, chẳng vái gì trở ra về nói với vợ là yên tâm dưỡng cho thật lành bệnh bởi Thần hoàng đã nhận lễ mà bằng lòng rồi."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/doc-truyen-trang-quynh.jpg", "Mẹo trảy kinh", "Mùa đông năm ấy, Quỳnh có việc đi gặp người bà con đang sinh sống ở Thăng Long. Đường về kinh thì xa, cuốc bộ phải mất cả tuần, mà Quỳnh vẻn vẹn có một quan tiền giắt lưng. Mới ngày thứ ba túi đã hết nhẵn tiền, chiều xuống, trời âm u, lại điểm mưa lâm thâm, gió bấc. Đến đầu làng kia, bụng đói cồn cào, vừa may gặp một đứa bé mục đồng dắt trâu về xóm, Quỳnh mừng rỡ hỏi thăm lối vào nhà ấp trưởng.\n" +
                "\n" +
                "Ấp trưởng làng này vừa giàu sụ, vừa nổi tiếng quỷ quyệt. Qua vài lời chuyện trò với người lỡ độ đường, hắn đoán thầm khách không phải là hạng tầm thường, bèn vồn vã mời nghỉ lại và sai gia nhân làm mâm cơm thịnh soạn để thết đãi. Nhưng mấy ngày liền, khách cứ đi đi lại lại, rồi đến bữa nằm dài đợi cơm rượu hỏi đến chức danh công vụ thì cứ ậm ậm ờ ờ. Chủ nhà sốt ruột, sinh nghi. Như thường lệ, tối hôm ấy ăn xong một lúc, Quỳnh cáo lui về phòng riêng giáp với phòng ngủ của chủ nhân. Được một chập, Quỳnh tắt đèn lên giường nằm. Biết ở phòng bên có người vẫn thức rình mò mọi hành vi của mình, lát sau Quỳnh vờ thức dậy rón rén thắp đèn, sau đó cẩn thận lần dưới vạt áo, lấy ra một bọc nho nhỏ bên trong có ba gói vuông, bản bằng nhau. Khách cầm bút long chấm chấm, mút mút đầu ngòi, hí hoái viết vào từng gói như để đánh dấu cho khỏi nhầm lẫn (thực ra chẳng viết gì cả), miệng lẩm nhẩm đọc, cố ý cho kẻ đang rình bên kia khe vách vừa đủ lắng nghe: Độc dược của nhà chúa… Độc dược của bà chính cung… Độc dược của thái tử. Làm như vậy, đoạn Quỳnh đem gói chung thành một bọc như cũ, giắt vào lưng áo. Xong rồi tắt đèn, lên giường nằm trở lại. Khi phòng bên này bắt đầu tiếng ngáy đều đều, thì phòng bên vọng sang tiếng động khe khẽ. Tên ấp trưởng bí mật mở chốt cửa ra ngoài, lẻn đến chuồng ngựa… Hộc tốc lao đi trong đêm.\n" +
                "\n" +
                "Sáng hôm sau, mới hửng sáng, quan quân từ đâu ập tới nhà ấp trưởng đông nghịt, gươm giáo tua tủa vây kín mọi phía. Quỳnh mở mắt, chưa kịp búi tóc đã bị trói nghiền lại, quẵng lên một chiếc xe có bốn ngựa kéo, trẩy về kinh.\n" +
                "\n" +
                "Trước phủ chúa, Quỳnh bị điệu ra xét xử với nhân chứng và vật chứng rành rành. Chúa đích thân tự tay mở tang vật. Té ra chẳng có gì ghê gớm! Chiếc bọc được gói kỹ lưỡng trong mấy lần mo cau, phủ ngoài bằng một vuông vải điều là chiếc bọc chứa ở bên trong mấy gói cơm khô nhỏ, Chúa lấy mũi hài đá té nắm cơm về phía Quỳnh, hất hàm tỏ vẻ khinh miệt:\n" +
                "\n" +
                "– Ta tưởng thế nào… Tài giỏi như Trạng mà cũng ăn cả cái vứt đi này à?\n" +
                "\n" +
                "– Khải chúa.\n" +
                "\n" +
                "Quỳnh đáp lại không chút ngần ngừ, nhà chúa thừa thãi mới gọi đó là của vứt đi. Còn thần dân bên dưới đâu dám phung phí một hạt, họ gọi cơm gạo là ngọc thực.\n" +
                "\n" +
                "Nói rồi, Quỳnh trân trọng nhặt lấy mấy hạt cơm khô bỏ vào mồm nhai rào rạo. Chúa biết mình lỡ lời, đỏ bừng mặt, lại thêm một phen mắc lỡm, tức lộn ruột. Không có cớ gì buộc tội Quỳnh, chúa truyền nọc tên ấp trưởng ra, bắt lính đánh ba chục trượng vì tội nói láo và báo sai.\n" +
                "\n" +
                "Trước cảnh tượng ấy, Trạng chỉ biết mỉm cười. Mặc dầu đã được tha bổng, trước khi bái biệt bề trên, Quỳnh vẫn không quên giễu chúa bằng những câu khéo:\n" +
                "\n" +
                "– Xin chúa rộng lượng tha thứ cho ấp trưởng. Và cho thần được cảm ơn hắn cùng quan quân triều đình."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/01/n%C3%A0ng-ti%C3%AAn-c%C3%B3c-640x440.jpg", "Nàng tiên cóc", "Ngày xưa, có hai vợ chồng nông dân hiếm hoi, cầu Trời khấn Phật mãi người vợ mới có thai, nhưng đến khi sinh ra, không phải là người mà lại là một con cóc.\n" +
                "\n" +
                "Con cóc lớn lên, biết nói tiếng người, song hình thù sần sùi, xấu xí, khiến cha mẹ nó lấy làm buồn phiền, thường than thở với nhau: “Vợ chồng mình già cả, hiếm hoi, tưởng sinh được mụn con nối dòng, trông nom đỡ đần mình, ngờ đâu oan gia nghiệp báo lại sinh ra cóc, còn trông mong gì nữa”!\n" +
                "\n" +
                "Cóc nghe thấy thế, khuyên cha mẹ đừng lo. Rồi ngay hôm sau cóc nhảy đi coi ruộng cho cha mẹ, và từ khi nó trông nom đồng áng thì chẳng có ai lấy trộm lúa ruộng nhà nó như trước nữa.\n" +
                "\n" +
                "Một hôm, có mấy thư sinh đi qua ruộng nó, dẫm lên lúa, bỗng nghe có tiếng lanh lảnh như giọng con gái bảo rằng: “Xin các cậu đi cho có ý tứ kẻo làm nát lúa nhà em”. Lũ thư sinh nhìn vào ruộng lúa, chẳng thấy ai, chỉ thấy một con cóc đang ngồi đó. Tiếng nói dịu ngọt làm cho một anh trong bọn đâm ra có cảm tình. Chàng thư sinh này bấy lâu đọc sách đạo thần tiên, tin tưởng có sự mầu nhiệm ở đời, nên về nhà nói với cha mẹ xin hỏi cóc làm vợ.\n" +
                "\n" +
                "Ban đầu cha mẹ thư sinh tưởng con mình hóa dại, song anh ta cứ một mực đòi lấy cóc làm vợ cho kỳ được, nếu không thì thề quyết chẳng lấy ai. Người cha bèn kiếm cớ từ khước, bảo chỉ có một mình anh ta là con trai, cưới cóc về có sinh ra được con cái để nối dòng không? Thư sinh tin là sẽ có sự nhiệm màu xảy đến trong ngày cưới cóc về, Tiên Phật sẽ giúp cho cóc thành người có đức hạnh, nhan sắc hơn đời. Thấy con đã nhất quyết như vậy, cha mẹ anh ta cũng đành phải chiều theo, đem trầu cau đi hỏi cóc.\n" +
                "\n" +
                "Đến ngày cưới, bên nhà trai mang đủ lễ vật, đồ nữ trang, quần áo cho cô dâu như người thường, chàng rể hy vọng Tiên Phật hóa phép cho cóc thành một cô gái xinh tươi như chàng vẫn mộng tưởng. Cả hai họ cũng trông mong như vậy, nhưng đến khi rước dâu, mọi người phải tức cười và xấu hổ vì đưa đón một con cóc nhảy về nhà chồng.\n" +
                "\n" +
                "Cha mẹ chồng vừa rầu, phiền cho con trai, vừa chua xót vì con dâu cóc, liền cấp ruộng cho đôi lứa đi ở riêng. Thư sinh cũng buồn lòng, cặm cụi học hành, nghiên cứu các khoa học thần bí, hy vọng gỡ rối cho gia đình, nhất là đối với cha mẹ già đang khát khao có cháu bế. Cóc thì siêng năng công việc ở nhà, thức khuya dậy sớm khuyên chồng chăm chỉ bút nghiên.\n" +
                "\n" +
                "Ngày ngày anh ta đi học về thì đã thấy cơm nước sẵn sàng, nhà cửa sạch sẽ ngăn nắp, mới nghĩ bụng rằng trong lúc vắng mình, chắc vợ trút lốt cóc thành người, chứ một con cóc thì làm sao lo việc nội trợ khéo léo được thế kia? Mấy bận anh ta thử rình, ra đi rồi thình lình trở về bất ngờ, hy vọng bắt gặp vợ là một cô gái xinh đẹp, song chỉ thấy một con cóc sần sùi ở nhà. Anh van nài cóc hóa thành người đẹp cho mình được sung sướng, nhưng cóc vẫn thản nhiên không tỏ vẻ gì cả.\n" +
                "\n" +
                "Một tối, anh cho cóc hay tin mình được bổ đi dạy ở trường tỉnh, ngỏ thật rằng mình không thể đưa vợ đi theo nếu vợ vẫn giữ lốt cóc. Từ ngày cưới về anh ta đã chịu biết bao lời chế diễu của hàng xóm, bè bạn. Hơn nữa, cha mẹ vẫn thúc dục anh lấy thêm vợ khác để có con nối nghiệp tông đường. Cóc lặng yên nghe chồng than thở, khuyên chồng chớ nên quá buồn phiền, và xin phép hôm sau về nhà thăm cha mẹ.\n" +
                "\n" +
                "Sáng ngày, cóc đi theo chồng, được một quãng thì nhảy vào một cái bụi bên đường. Thư sinh dừng bước lại thì thấy ở bụi cây đi ra một cô gái xinh đẹp lạ lùng, quá sức ước mong của anh bấy lâu. Anh sung sướng ngẩn ngơ nhìn người vợ đẹp lại gần, say đắm ngắm nghía vợ từ đầu đến chân rồi thiết tha xin vợ từ đây cứ giữ hình người. Biết là vợ đã trút lốt cóc ra trong bụi, anh ta kiếm cớ đi lùi lại sau rồi chạy lẻn đến bụi tìm lốt cóc mà dấu vào mình.\n" +
                "\n" +
                "Đến nhà, cha mẹ thư sinh mừng rỡ thấy con dâu cóc đã hóa ra người xinh đẹp, dịu dàng. Anh chồng hân hoan thừa lúc mọi người không để ý đến, đem lốt da cóc bỏ vào bếp lửa cho tiêu tan. Hai vợ chồng ở lại nhà cha mẹ cả đôi bên luôn mấy ngày, vui vẻ tiệc tùng liên tiếp rồi mới trở về nhà.\n" +
                "\n" +
                "Trên đường về vợ kiếm cớ vào bụi cây để tìm lại lốt cũ, không thấy, chồng mới cho hay là mình đã lấy đốt đi rồi. Vợ đành phải giữ nguyên hình người để về với chồng.\n" +
                "\n" +
                "Hai vợ chồng ăn ở với nhau đằm thắm vui vẻ, vợ sinh được nhiều con cái, chồng học thi đỗ cao làm nên chức lớn, sống một đời sung sướng."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/Smurf_River_Bridge-660x440.jpg", "Sự tích Cao Lãnh", "Đồng Tháp Mười ngoài ruộng lúa phì nhiêu và cá tôm lấp lánh, sen nở bạt ngàn, còn có sự tích về một địa danh mà không hẳn ai cũng biết, đó là: Cao Lãnh.\n" +
                "Hồi trước có cặp vợ chồng Đỗ Công Tường, tục danh là Lãnh, từ miền trung đến đây lập nghiệp. Sau mấy năm chí thú làm ăn, gia cư ông Lãnh khá khang trang. Tính tình ông chính trực ngay thẳng nên được dân làng cử làm chức câu đương, một chức danh để phân xử những vụ tố tụng trong làng.\n" +
                "\n" +
                "Ông bà Lãnh trồng một vườn quít. Hàng xóm thường tụ tập đến đây để đổi chác, mua bán. Lâu ngày chỗ ấy thành chợ. Đó là chợ Cầu Ông Lãnh ngày nay.\n" +
                "\n" +
                "Đến năm Canh Thìn (1820) , nạn dịch tả hoành hành rất dữ. Dân chúng trong lành bị bệnh , chết rất nhiều. Xóm làng chợ búa trở nên vắng vẻ, ảm đạm. Thuở ấy, chưa có thuốc men như bây giờ nên người ta cho rằng bệnh dịch tá là do trời đất, thần thánh gây ra để quở phạt dân làng. Ông Lãnh cũng không suy tư gì hơn quan niệm đương thời nên ông lập bàn thờ giữa sân chợ để khấn vái xin trời đất, thần thánh giúp dân thoát khỏi tình cảnh chết chóc bệnh hoạn ấy. Điều đáng nói là hai ông bà nguyện thế mạng mình để cầu cho dân chúng thoát cảnh đau thương.\n" +
                "\n" +
                "Cúng xong , hai ông bà ăn chay ba bữa. Đến sáng hôm thứ tư thì bà Lãnh mắc bệnh. Đến tối bà qua đời. Đang lo việc an táng cho bà thì ông lại phát bệnh và cũng ra đi đột ngột. Nhân dân trong làng lo việc chôn cất ông bà xong thì bệnh dịch tá cũng tự dứt luôn. Mọi người trở lại cuộc sống an nhàn như cũ. Do vậy, họ cho rằng nhờ vợ chồng ông Lãnh thế mạng nên cứu được chúng dân. Để tưởng nhớ công ơn, dân làng lập miếu ngay trên ngôi mộ của hai ông bà, tại làng Mỹ Trà bên bờ kinh Thầy Khâm để thờ phụng, gọi là miếu ông Chủ Chợ.\n" +
                "\n" +
                "Chợ vườn quít từ đó được gọi theo tên ông. Vì tên tục của ông là Lãnh, lại làm chức cầu đương, nên dân chúng thường gọi là Câu Lãnh và chợ gọi là chợ Câu Lãnh, chợ Câu Lãnh ngày càng thịnh vượng và người đến mua bán lại đọc trệch Câu Lãnh thành Cao Lãnh nên tên Cao Lãnh được dùng từ đó."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/05/d8c4323c149501bd003a03219248836712676704654b8f1dc1aee30.510x675.w.b-640x440.jpg", "Tiêu diệt mãng xà", "Ngày xưa, trong một hang núi nọ có một con mãng xà. Đầu nó to bằng cái chum, trên đầu có mào đỏ, hai mắt như hai quả quýt, thân dài hơn trượng. Nó đi đến đâu là cuốn thành bão đến đấy, cây cối đổ rào rào, bụi bốc mù mịt. Nó đã ăn thịt không biết bao nhiêu là súc vật và người. Người ta dùng nhiều cách để diệt trừ, nhưng mãng xà đã không chết mà còn phá hoại dữ dội hơn. Cuối cùng nhà vua phải sai dựng cho nó một cái đền và hứa mỗi năm khấn một mạng người để nó đỡ phá phách. Nhà vua ra lệnh bắt các làng mỗi năm phải nộp một người con gái để dâng cúng mãng xà, nhưng cũng cho rao trong nước, ai tiêu diệt được con quái vật ấy thì sẽ phong quận công và cho lấy công chúa làm vợ.\n" +
                "\n" +
                "Bấy giờ có một chàng trẻ tuổi từ lâu được một nhà sư đưa lên nuôi trên một ngôi chùa ở núi cao. Hàng ngày nhà sư truyền cho anh nghề múa gươm và các môn võ nghệ. Thành tài, anh được thầy tặng một thanh gươm quý và cho phép “hạ sơn”. Hôm ấy anh trở về làng. Sau khi kéo bộ suốt cả một ngày mệt nhọc, anh thấy một tòa đền có ánh sáng le lói, không biết là đền mãng xà, bèn ghé vào nghỉ chân. Vừa bước vào cổng đền bỗng nghe có tiếng khóc thút thít ở phía trong, anh lấy làm ngạc nhiên vội lần vào thượng điện. Dưới ánh đèn dầu, anh thấy một cô gái trạc mười tám, hai mươi tuổi, bị trói vào cột ở một góc điện. Anh lập tức bước đến cởi trói cho nàng và nói:\n" +
                "\n" +
                "– Làm sao cô lại bị trói ngồi ở đây?\n" +
                "\n" +
                "Cô gái gạt nước mắt nói:\n" +
                "\n" +
                "– Chàng là ai, ở xứ nào mà không biết đây là đền thờ mãng xà ư?\n" +
                "\n" +
                "Đoạn cô kể lại những hành động của mãng xà, mỗi năm phải nộp một mạng người ra sao, cuối cùng cô nức nở:\n" +
                "\n" +
                "– Nhà thiếp có một mẹ một con, nghĩ mình chết đi cũng không tiếc, chỉ thương mẹ già không có ai nuôi. Nhưng thôi chàng hãy đi mau khỏi chốn này, nếu không mãng xà nó đền thì chẳng còn tính mạng.\n" +
                "\n" +
                "– Thế bao giờ thì nó đến đây?\n" +
                "\n" +
                "– Chỉ nội trong đêm nay!\n" +
                "\n" +
                "Chàng trẻ tuổi ân cần:\n" +
                "\n" +
                "– Tôi muốn thay nàng nộp mạng cho mãng xà để nàng được về với mẹ.\n" +
                "\n" +
                "Cô gái đáp:\n" +
                "\n" +
                "– Thiếp không muốn vì mình mà người khác phải chết. Cứ để mặc thiếp chịu số kiếp thê thảm, tiền oan nghiệp chướng này. Chỉ mong chàng nếu có đi qua làng, hãy làm ơn ghé vào an ủi mẹ già giúp thiếp.\n" +
                "\n" +
                "– Không. Nàng hãy kịp tránh khỏi nơi đây để mặc tôi với con quái vật.\n" +
                "\n" +
                "Rồi rút gươm ra khỏi bao, chàng nói tiếp:\n" +
                "\n" +
                "– Nó không thể làm hại được tôi đâu. Tôi sẽ bắt cái này ra đối mặt một phen với nó. Nàng hãy chạy về làng mau đi!\n" +
                "\n" +
                "Nói đoạn, anh dẫn cô gái ra khỏi cánh rừng, rồi trở lại đền nai nịt gọn ghẽ, quyết thức đợi mãng xà.\n" +
                "\n" +
                "Vào khoảng nửa đêm, bỗng phía ngoài có tiếng rào rào, cành cây gẫy răng rắc. Một mùi tanh tưởi xông vào mũi đến lộn mửa. Chàng trẻ tuổi đứng dậy rút gươm nấp vào bên thượng điện. Mãng xà quen như mọi khi, từ từ vắt mình qua tường tiến vào. Nhưng nó vừa thò cái đầu vào đền thì chàng trẻ tuổi đã khởi thế công ngay. Lưỡi gươm của anh lóe lên trong đêm tối như chớp giật. Con quái vật bị thương, lao tới toan nuốt sống kẻ thù. Nhưng đường gươm lợi hại của anh đã lại bồi cho nó một nhát thứ hai. Mãng xà đau quá, rống lên, hà hơi phun gió rồi quật đuôi tới tấp làm anh lăn đi mấy vòng. Sắp bị lọt vào miệng quái vật thì may sao, anh đã kịp đứng bật dậy, thủ thế đâm cho nó một mũi thứ ba, nhưng vì đâm mạnh quá nên mũi gươm bị gãy. Anh bèn bồi tiếp mấy nhát, mãng xà bị thương nặng. Cả khúc thân của nó quằn quại mạnh đến nỗi tường và mái đền đổ sụp, gạch ngói lăn xuống rào rào. Anh giơ lưỡi gươm chặt lấy cái đầu con ác thú.\n" +
                "\n" +
                "Giết được mãng xà, chàng trẻ tuổi khát nước quá chạy khắp rừng đi tìm suối giải khát, rồi vì mệt quá, anh lần ra bên bờ suối ngủ thiếp một ngày một đêm.\n" +
                "\n" +
                "Trưa hôm sau, một viên quản có phận sự gác ở khu vực này tiến vào đền để dò động tĩnh. Hắn vô cùng kinh ngạc khi thấy mãng xà nằm trên vũng máu, mà cô gái thì không biết đã biến đi đường nào. Nhưng nghĩ đến lời hứa của vua, hắn lập tức xách lấy đầu mãng xà phóng ngựa về kinh lĩnh thưởng. Trông thấy đầu con quái vật, nhà vua rất vui mừng. Vua hỏi:\n" +
                "\n" +
                "– “Ai đã giết được mãng xà?” Viên quan đáp: – “Tâu bệ hạ chính là kẻ hạ thần này”. Vua khen ngợi hồi lâu, rồi ban sắc chỉ phong cho làm quận công, lại truyền gả công chúa như lời đã hứa.\n" +
                "\n" +
                "Đám cưới tổ chức rất linh đình. Nhưng giữa hôm cưới, trong khi vua quan tề tựu đông đủ, thì bỗng có một người khách lạ xin vào yết kiến. Vua truyền cho vào. Người khách lạ chính là chàng trẻ tuổi đã giết mãng xà. Vua hỏi:\n" +
                "\n" +
                "– Nhà ngươi đến đây có việc gì?\n" +
                "\n" +
                "Chàng trẻ tuổi đáp:\n" +
                "\n" +
                "– Tâu bệ hạ, chỉ xin phép bệ hạ cho tôi được lấy lại một mảnh gươm gãy còn giắt trong đầu mãng xà mà thôi!\n" +
                "\n" +
                "Vua hết sức ngạc nhiên:\n" +
                "\n" +
                "– A, vậy ra không phải là phò mã của ta đã hạ thủ mãng xà ư?\n" +
                "\n" +
                "Vua nhìn sang phò mã. Phò mã mặt đã tái đi, nhưng vẫn cố cãi:\n" +
                "\n" +
                "– Nó là thằng bá vơ nào dám vào đây nhận xằng!\n" +
                "\n" +
                "Vua liền sai hoãn ngay lễ cưới lại rồi bảo vệ sĩ bổ đầu mãng xà để tìm mảnh gươm. Một lát sau vệ sĩ đã đưa mảnh thép về dâng nộp, khi ráp vào với gươm của chàng trẻ tuổi thì vừa như in. Vua thét:\n" +
                "\n" +
                "– Thì ra phò mã đã lừa dối trẫm và mọi người.\n" +
                "\n" +
                "Lập tức vua sai lột thẻ vàng quận công của hắn rồi đeo vào cho chàng trẻ tuổi. Sau đó vua dắt anh ngồi vào chỗ ngồi của phò mã, và ra lệnh cho lễ cưới lại tiếp tục như cũ.Trong khi đó thì viên quản bị giải ra pháp trường."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2013/01/con-v%E1%BB%A3-kh%C3%B4n-l%E1%BA%A5y-th%E1%BA%B1ng-ch%E1%BB%93ng-d%E1%BA%A1i-nh%C6%B0-b%C3%B4ng-hoa-nh%C3%A0i-c%E1%BA%AFm-b%C3%A3i-c%E1%BB%A9t-tr%C3%A2u.jpg", "Con vợ khôn lấy thằng chồng dại như bông hoa nhài cắm bãi cứt trâu", "Xưa, có một người đàn bà làm nghề dệt vải. Nàng bản tính thông minh tháo vát, nhưng lấy phải người chồng đần độn không làm được nghề gì nên thân. Một hôm, vợ đưa cho chồng mấy tấm vải bảo mang ra chợ bán. Vợ dặn: – “Nếu không được bốn quan mỗi tấm thì đừng có bán, nghe!”\n" +
                "\n" +
                "Chồng mang vải ra chợ đi khắp nơi, rao khản cả cổ mà chả có ai mua cả. Mãi về sau có một ông cụ già mua cho hai tấm. Nhưng ông ta lại không mang tiền theo. Ông cụ bảo hắn:\n" +
                "\n" +
                "– Chốc nữa anh đến nhà tôi lấy tiền nhé! Nhà tôi cũng ở trong xã này thôi.\n" +
                "\n" +
                "Hắn hỏi:\n" +
                "\n" +
                "– Nhà ông ở đâu?\n" +
                "\n" +
                "– Tôi ở chỗ: “chợ đông không ai bán, chỗ kèn thổi tò le, chỗ cây tre một mắt”. Đến đó tôi sẽ trả tiền ngay.\n" +
                "\n" +
                "Đến chiều hắn đi tìm người mua hàng chịu của hắn. Gặp ai hắn cũng hỏi thăm “chỗ chợ đông không ai bán, chỗ kèn thổi tò le, chỗ cây tre một mắt” là ở đâu, nhưng chẳng một ai biết thế nào mà trả lời. Người ta chỉ nói với hắn:\n" +
                "\n" +
                "– Thôi rồi, anh mắc phải tay bịp bợm nào đấy thôi!\n" +
                "\n" +
                "Hắn đi loanh quanh mãi đến tối mịt không tìm được nhà, đành phải trở về ôm mặt hu hu khóc.\n" +
                "\n" +
                "Vợ hắn hỏi tại sao thì hắn kể cho vợ nghe tất cả câu chuyện. Người vợ bảo:\n" +
                "\n" +
                "– Cũng dễ tìm thôi! “Chỗ chợ đông không ai bán” là cái nhà trường, “chỗ kèn thổi tò le” là bụi lau vì khi gió thổi nghe như tiếng kèn sáo, “chỗ cây tre một mắt” là bụi hành hay tỏi gì đó. Vậy anh phải kiếm người đó ở một cái trường học, gần đó có bụi lau, trước cửa có vườn trồng hành tỏi.\n" +
                "\n" +
                "Qua ngày sau, anh chồng lại cất bước đi tìm. Quả đúng như lời người vợ nói, hắn gặp ông lão hôm qua. Đó là một thầy đồ dạy học trò. Thấy hắn đến, ông đồ liền hỏi xem nhờ ai mách cho mà biết được chỗ ở của mình. Hắn đáp: – “Tôi tìm ông suốt cả một buổi chiều hôm qua. May nhờ có vợ tôi mách cho đấy”. Ông thầy nghĩ: -“Người đàn bà này hẳn là một cô gái thông minh tài trí, ít người sánh kịp”. Hôm đó nhân nhà có giỗ, ông đồ mời hắn ngồi lại ăn cỗ. Hắn ta cắm đầu chén một bữa no nê lại được ông đồ gửi phần về biếu vợ. Nhưng khi trả tiền, ông đồ còn gửi hắn một gói khác bảo đưa cho vợ. Trong đó chỉ có một cục phân trâu ở giữa có cắm một cánh hoa nhài. Hắn ta chẳng hiểu gì cả cứ việc cầm lấy về nhà.\n" +
                "\n" +
                "Người vợ trông thấy, hiểu ý ông thầy muốn mỉa mai mình:\n" +
                "\n" +
                "Con vợ khôn lấy thằng chồng dại\n" +
                "\n" +
                "Như bông hoa lài cắm bãi cứt trâu\n" +
                "\n" +
                "Càng ngẫm nghĩ về “gói quà”, nàng càng buồn bực, trách chồng dốt nát để mang về cho mình một lời trêu chọc chua cay, rồi nghĩ tới duyên phận hẩm hiu, nước mắt nàng lã chã. Nàng vứt cái thoi, bụng bảo dạ: – “Thân thế ta thật chả ra gì. Trên đời có bao nhiêu người khôn ngoan tài giỏi, còn ta thì lấy nhầm phải một thằng chồng u mê đần độn!”. Trong một cơn phiền muộn, nàng chạy ra bờ sông, toan nhảy xuống dòng nước trẫm mình cho rồi một đời.\n" +
                "\n" +
                "Lại nói chuyện ông thầy dạy học, sau khi tiễn chân anh chàng bán vải ra khỏi cửa, nghĩ đi nghĩ lại thấy sự trêu chọc ác nghiệt của mình thật là không phải. Ông đâm ra lo câu chuyện đưa tới một kết quả không hay: – “Không biết chừng người đàn bà ấy phẫn chí liều thân hoại thể thì ta sẽ có tội rất lớn với danh giáo”. Nghĩ thế, ông đồ bèn đi mượn một cái giỏ đựng cá thủng trôn, rồi mang ra bờ sông cùng với chiếc cần câu làm bộ câu cá. Ông cứ men theo dọc bờ sông gần làng, đi lại trông chừng. Khi thấy một người đàn bà ngồi trên bờ vắng đang ôm mặt khóc thút thít, ông biết ý vội tiến đến gần, có ý chìa giỏ cho nàng thấy và nói:\n" +
                "\n" +
                "– Chị này ngồi tránh đi chỗ khác cho tôi câu cá nào.\n" +
                "\n" +
                "Người đàn bà đó đúng là vợ anh chàng bán vải. Nàng ngước mắt trông lên thấy có một người đàn ông đầu đã hai thứ tóc mà lại mang chiếc giỏ rách đi câu. Nàng tự nghĩ: – “Người nào đây ngu quá là ngu. Chồng mình tuy khờ dại nhưng cũng chưa đến nỗi này”. Rồi nàng kết luận: – “Vậy ra chồng mình vẫn còn có những chỗ hơn người”. Nghĩ vậy, nàng bỏ ý định tự tử mà trở về nhà."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/%C4%91%E1%BA%A7u-to-b%E1%BA%B1ng-c%C3%A1i-b%E1%BB%93-640x440.jpg", "Đầu to bằng cái bồ", "Chuyện kể rằng lúc Quỳnh còn nhỏ, mới bảy tám tuổi, Quỳnh đã tỏ ra thông minh đỉnh ngộ nhưng cũng là một đứa trẻ chúa nghịch. Hồi ấy bọn trẻ thường chơi trò xước xách, lấy tàu chuối làm cờ, lá sen làm lọng. Trong trò chơi, Quỳnh bao giờ cũng lấn lướt.\n" +
                "\n" +
                "Một đêm mùa thu, trăng tháng tám sáng vằng vặc, đang chơi với đám trẻ ở sân nhà, Quỳnh bảo:\n" +
                "\n" +
                "– Chúng bay làm kiệu cho tao ngồi, rồi tao đưa đi xem một người mà cái đầu to bằng cái bồ!\n" +
                "\n" +
                "Lũ trẻ tưởng thật, liền tranh nhau làm kiệu rước Quỳnh đi vòng vòng quanh sân, mệt thở muốn đứt hơi. Xong, chúng nhất định bắt Quỳnh phải giữ lời hứa. Lúc ấy trăng đã mờ, Quỳnh bảo:\n" +
                "\n" +
                "– Tụi bây đứng đợi cả ở đây, tôi đi đốt lửa soi cho mà xem!\n" +
                "\n" +
                "Bọn trẻ nhỏ hơi sợ, không dám ở lại, chỉ những đứa lớn hơn, bạo dạn đứng chờ. Quỳnh lấy lửa thắp đèn xong đâu đấy, rồi thò đầu che ngọn đèn, bảo:\n" +
                "\n" +
                "– Kìa, trông trên vách kìa. Ông to đầu đã ra đấy!\n" +
                "\n" +
                "Anh nào cũng nhìn nhớn nhơ nhớn nhác, thấy bóng đầu Quỳnh ở vách to bằng cái bồ thật. Lũ trẻ biết Quỳnh xỏ, quay ra bắt Quỳnh làm kiệu đền, Quỳnh chạy vào buồng đóng cửa lại, kêu ầm lên. Ông bố tưởng là trẻ đánh, cầm roi chạy ra, lũ trẻ chạy tán loạn."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/Ariel-the-little-mermaid-1005742_800_600-660x440.jpg", "Người đàn bà tiết liệt", "Ngày xưa ở vùng Bắc Ninh là đất nổi tiếng có nhiều con gái đẹp, có một cô gái làng Cách bi, về làm vợ ông cử nhân Nguyên Hanh, giữ chức tri huyện Thủy đường, người ta vẫn thường gọi là bà huyện Thủy đường. Lấy chồng sinh được một con trai vừa được 7 tháng thì chồng mất. Bà huyện đang còn trẻ đẹp, nhưng nhất quyết ở vậy thờ chồng nuôi con.\n" +
                "\n" +
                "Trong làng có tên lý trưởng, vốn là tay cường hào, thấy bà huyện goá đang độ “gái một con trông mòn con mắt” nên thường kiếm cách trêu ghẹo. Muốn được yên thân nuôi con, bà khôn khéo từ chối, bảo chờ đến ngày bà đoạn tang chồng. Một hôm tên lý trưởng đón đường bà đi chợ về, xông ra ôm bà. Bà bỏ chạy về nhà, lạy bàn thờ chồng, rồi trao nhà cửa cho họ hàng, bế con lên chùa Kim giang để tu. Khi con trai được 7 tuổi, bà đưa con trở về nhà, bày lễ tế chồng, giết trâu mời họ hàng và xóm làng đến dự tiệc. Tên lý trưởng đã làm nhục bà lò mò đến, hí hửng nhắc đến lời hứa hẹn cũ. Bà trả lời rằng đợi cúng chồng xong rồi sẽ bàn tính đến.\n" +
                "\n" +
                "Trước đông đủ mặt bà con làng xóm, bà lạy bàn thờ chồng xong rồi cầm dao sắc chỉ vào mặt tên lý trưởng mà kể tội làm nhục bà trước kia. Bà nói rằng bà còn sống đến nay là vì đứa con trai nối nghiệp còn nhỏ, bây giờ bà có thể gửi con lại cho họ Nguyễn mà chết theo chồng cho trọn tiết nghĩa. Nói xong, bà tự cắt đứt lìa bên vú đã bị tên lý trưởng chọc ghẹo trước kia, rồi ngã xuống chết. Cả họ liền bắt trói tên cường hào giái lên quan trên trị tội.\n" +
                "\n" +
                "Con trai bà huyện Thủy đường là Nguyễn Cao, về sau học hành thi đỗ ra làm quan vào cuối triều vua Tự đức. Khi mất nước, Nguyễn Cao bỏ quan về làng, dù rất nghèo túng. Người Pháp dụ ông ra làm quan, nhưng ông từ chối, họ bảo ông rằng:\n" +
                "\n" +
                "– Chúng tôi nghi bụng ông lắm.\n" +
                "\n" +
                "– Nguyễn Cao trả lòi: các ông nghi thì để tôi vạch bụng ra cho mà xem.\n" +
                "\n" +
                "Vừa nói, ông vừa lấy móng tay bấm thủng bụng, lôi ruột ra. Người Pháp vội vàng đưa thầy thuốc đến cứu chữa, nhét ruột ông vào. Không được chết phô bày gan ruột yêu nước của mình, Nguyễn Cao liền cắn lưỡi tự tử.\n" +
                "\n" +
                "Dân gian khi nhắc đến mẹ con bà, thường nói: ” Mẹ anh hùng sinh ra con hào kiệt”."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2013/01/n%E1%BB%A3-duy%C3%AAn-trong-m%E1%BB%99ng.jpg", "Nợ duyên trong mộng", "Ngày xưa ở động Sơn-la thuộc Hưng-hóa có một chàng trẻ tuổi tên là Chu sinh. Bố mẹ mất sớm, chàng được chú đưa về nuôi cho ăn học. Nhưng người chú yêu dấu cháu bao nhiêu thì người thím lại ghét bỏ bấy nhiêu. Thấy phải nuôi báo cô một đứa cháu dài lưng tốn vải ăn no lại nằm, người đàn bà ấy rất bực mình. Lâu dần, người thím không kiêng nể nữa, mỗi khi có chuyện không vừa ý, chửi mắng chàng hết lời.\n" +
                "\n" +
                "Một hôm, chú đi vắng, ở nhà thím la rầy, Chu sinh cãi lại mấy câu. Thấy thế, người thím không ngăn được cơn thịnh nộ:\n" +
                "\n" +
                "– Đã thế mày đi đâu thì cút ngay đi, đừng có vác mặt về đây mà ăn nữa!\n" +
                "\n" +
                "Nghe mấy câu xúc phạm, Chu sinh bỗng tức giận đầy người. Chàng vào thu dọn áo quần sách vở rồi tức tốc ra đi, thề quyết sẽ không trở lại gặp thím nữa. Chàng tìm về mấy gian nhà nát của bố mẹ bấy lâu vẫn bỏ hoang, trải manh chiếu rách lên giường rồi làm một giấc.\n" +
                "\n" +
                "Người chú về biết rõ cơ sự, bèn tìm đến nhà, rủ cháu về. Chu sinh đã nhịn đói hai hôm nhưng nhất quyết không chịu. Người chú đành mang tiền gạo đến cho chàng và cố tình khuyên dỗ. Cháu hẹn chú ba ngày. Nhưng ba ngày trôi qua vẫn không thấy cháu về, chú lại mang tiền gạo sang chu cấp. Cháu lại khất ba ngày khác, nhưng rồi vẫn không về. Người chú cuối cùng cũng bực mình, đến nhà bảo: – “Tao bảo mày không nghe thì kệ xác mày, không hơi đâu mà khuyên dỗ mãi!”\n" +
                "\n" +
                "Nói rồi từ đó mặc kệ Chu sinh, nhất định không đoái hoài nữa. Sau khi gạo tiền đã hết, Chu sinh nằm nhịn luôn trong hai ngày. Tuy bụng đói, chàng vẫn không chịu chạm trán với người thím ác nghiệt. Hôm ấy, sau khi ngâm mấy bài thơ, chàng tự nhiên ngủ thiếp đi. Đang lúc mơ mơ màng màng, bỗng thấy có một viên quan phẩm phục rực rỡ, theo sau có mấy tên thị vệ đến nhà mình. Bấy giờ chàng đang ngồi đọc sách. Chàng tưởng họ vào nhầm nhà, nhưng khi xưng tên tuổi thì thấy quả họ đang tìm mình. Viên quan mở hộp vàng lấy ra một đạo dụ đọc cho chàng nghe. Lúc đầu chàng cứ tưởng hoàng đế đang trị vì triệu mình, nhưng khi nghe xong thì chàng lấy làm ngạc nhiên. Những tiếng “quốc mẫu nước Hoa-thành” thật là mới lạ, chưa nghe nói bao giờ; cả đến giọng đọc của viên quan cũng nghe lơ lớ, không phải người ở vùng kinh kỳ tới.\n" +
                "\n" +
                "Khi biết những người khách lạ đến với thiện ý đưa mình tiến kinh làm phò mã thì Chu sinh thấy yên tâm. Chàng nghĩ bụng: – “Hẵng cứ phó mặc cho may rủi một phen thử xem”. Chàng bèn bước theo chân họ. Đường rất mờ mịt. Chỉ một thôi, họ đã tiến vào một nơi có nhà cửa đẹp đẽ, người đi lại đông đúc như một thị trấn. Vượt qua mấy lần cổng thành lớn. Có lính canh gác nghiêm ngặt, đã thấy trước mặt một tòa lâu đài nguy nga, trên đề chữ “điện Hoàng-kim”. Viên quan bảo chờ trước sân rồng rồi tiến vào một nơi có mành ngọc che. Một chốc hắn rón rén bước ra giục chàng vào làm lễ. Chu sinh chỉ mới kịp cúi đầu lạy hai lạy thì ở trong có tiếng truyền ra cho chước miễn, và bảo dắt lên thềm. Chàng thấy đó là một bà cụ già chừng 60 tuổi, mặt mũi phúc hậu, nhìn mình với cặp mắt có cảm tình. Tuy đói bụng nhưng chàng cố hết sức giữ lễ. Người ta mời chàng ngồi lên sập vàng bên tả chỗ ngồi của quốc mẫu. Sau buổi trà nước, tiệc yến dọn lên, sơn hào hải vị bày đầy cả chiếu. Một chốc, từ trong cung tiến ra một cái kiệu nhỏ, trên có một thiếu niên bước xuống vái chào Chu sinh. Quốc mẫu nói bằng một giọng thân mật:\n" +
                "\n" +
                "– Con ra tiếp đi. Chú rể mới bao giờ mà chả thẹn.\n" +
                "\n" +
                "Thế rồi hai người chén thù chán tạc. Chu sinh chưa bao giờ cảm thấy sung sướng và ngon miệng hơn thế. Giữa bữa ăn, quốc mẫu cho chàng biết tiên đế là chồng bà với cha chàng đã từng đính ước gả con cho mau. Bây giờ cốt mời chàng đến đây để thực hiện lời hứa đó. Tuy chưa hiểu hai bên quen biết từ bao giờ, lại cũng chưa rõ mặt mũi công chúa Mộng Trang ra sao, nhưng chàng cũng cung kính gật đầu.\n" +
                "\n" +
                "Ăn xong, quốc mẫu ngoảnh lại bảo chàng:\n" +
                "\n" +
                "– Phò mã hãy trở về đợi ba ngày nữa sẽ lại cho người đến rước.\n" +
                "\n" +
                "Liền đó, chàng từ tạ ra về, có cờ trống đàn sáo tiễn ra đến ngoài hoàng cung.\n" +
                "\n" +
                "Thoáng có cơn gió lạnh phả vào mặt, Chu sinh giật mình tỉnh dậy thì thấy mình vẫn nằm trên manh chiếu rách cũ, nhưng miệng còn hơi rượu và bụng hãy còn no. Suy đi nghĩ lại, chàng không hiểu ra thế nào cả.\n" +
                "\n" +
                "Ba ngày sau, chàng lại nằm mê như trước, lần này, đến điện Hoàng-kim thì đã thấy đèn treo, hoa kết, rực rỡ vô cùng. Chu sinh được dắt vào một gian buồng, thay bỏ đồ cũ để mặc quần áo mới may. Được một chốc, có một bọn người cung nữ đưa công chúa ra gặp tân lang. Chàng chỉ hồi hộp chờ có mỗi phút đó. Và chàng sung sướng vô cùng khi nhìn trộm thấy diện mạo của vợ khó có ai sánh kịp. Hai bên cùng vào làm lễ và cùng rót rượu cho nhau uống giữa nhữn tiếng đàn sáo nhã nhạc và lời chúc tụng hoan hỷ của mọi người.\n" +
                "\n" +
                "Sau đó, vâng lện quốc mẫu, hai người đưa nhau vào Tây phòng. Đêm ấy, Chu sinh sung sướng vô hạn và mặc dầu thoáng thấy có những vằn lạ ở bụng và lưng vợ nhưng chàng vẫn không quan tâm.\n" +
                "\n" +
                "Sáng hôm sau, ăn xong hai người lại ra hầu quốc mẫu. Bà bảo chàng:\n" +
                "\n" +
                "– Nước đây là nước Hoa-thành. Năm xưa tiên đế mất đi để lại cho ta dân đông, công việc nhiều. Thái tử còn nhỏ tuổi mà ta thì đã già rồi, trông nom không xiết. May có công chúa giúp đỡ từ bấy đến nay. Lấy chồng thì phải theo chồng nhưng công chúa mà đi thì không ai giúp cho ta cả. Vậy phò mã nên thể tình ta, để vợ ở đây, cứ ba ngày một sẽ cho Xuyên Hoa sứ về đón.\n" +
                "\n" +
                "Chu sinh chỉ còn biết vâng dạ.\n" +
                "\n" +
                "Trò chuyện một lúc, Chu sinh ra về. Công chúa tiễn chồng ra hoàng cung vẻ lưu luyến buồn rầu lộ ra nét mặt. Thái tử nói bỡn:\n" +
                "\n" +
                "– Vợ chồng mới cưới hôm qua, hôm nay đã thương nhớ nhau đến thế ư?\n" +
                "\n" +
                "Mọi người đều cười rộ làm cho chàng đỏ cả tai.\n" +
                "\n" +
                "Thế rồi Chu sinh lại tỉnh dậy sau một giấc ngủ một ngày một đêm. Mùi rượu và mùi hương của công chúa vẫn còn thấy phảng phất. Lần này, chàng không còn coi là một sự lạ nữa. Chàng lại giở sách ôn luyện. Bụng vẫn không thấy đói.\n" +
                "\n" +
                "Từ đó cứ ba ngày một lần, Chu sinh lại chiêm bao đến nước Hoa-thành để được gặp gỡ công chúa và để được ăn những bữa tiệc no say. Hết chiêm bao, chàng lại sống cô độc và thiếu thốn trong gian nhà nát. Tuy ngoài giấc mộng chàng không hề ăn uống gì mà mặt mũi vẫn hồng hào tươi tốt.\n" +
                "\n" +
                "Cuộc đời cứ đều đặn như thế kéo dài đến hơn một năm trời. Xóm làng cho là chàng có phép tịch cốc, hỏi thì chàng chỉ cười mà không trả lời. Lúc này công chúa vợ Chu sinh đã sinh được một con trai. Quốc mẫu hạ lệnh cho vợ các quan phải đến cho đứa bé bú. Thằng bé chóng lớn. Ngày đầy tuổi tới, chàng đến sớm hơn mọi lần. Lúc đến nơi đã thấy cung đình xúm xít những triều thần, các quan lớn bé cùng các bô lão ăn mặc rực rỡ, chào hỏi lăng xăng. Họ mang tiền nong, lễ vật đến mừng con chàng nhiều lắm, chất đầy cả sập. Đổi lại, quốc mẫu sai dọn tiệc đãi họ. Chu sinh phải thân đi rót rượu mời mọc khá vất vả.\n" +
                "\n" +
                "Một hôm, chàng theo lệ thường đến yết kiến mẹ vợ. Chàng ngạc nhiên khi thấy mặt bà có vẻ buồn rầu hốt hoảng khác thường. Hỏi thì quốc mẫu gạt nước mắt trả lời:\n" +
                "\n" +
                "– Từ lâu ta vẫn có ý giấu phò mã. Nhưng nay đã đến lúc không thể giấu được nữa. Đã hai tháng nay, ngày nào cũng có tin cáo cấp ở biên thùy. Bọn giặc dữ đã tràn vào cõi, cướp bóc và tàn hại dân ta không biết bao nhiêu mà kể. Quân ta nghênh chiến bị tử thương vô số. Hôm nay, coi chừng giặc đã phạm đến gần kinh đô. Cho nên ta định ngày mai sẽ thiên đô đi nơi khác.\n" +
                "\n" +
                "Chu sinh toan hỏi thêm về tình hình chiến sự thì đã thấy quan thượng thư Bộ binh xin vào yết kiến:\n" +
                "\n" +
                "– Tân bệ hạ, quân giặc mỗi ngày một thêm mạnh và đông. Cứ như con số hạ thần nắm được thì quân và dân ta đã hy sinh mất một phần ba. Nếu bệ hạ cố ở lại thì còn dân đâu mà lập nước nữa. Vậy xin kíp thiên đô nội trong đêm nay!\n" +
                "\n" +
                "Nghe nói, quốc mẫu sợ hãi, lập tức sai thảo chiếu hỏa tốc đi mọi phương ra lệnh đúng giờ hợi khởi hành. Rồi bà day lại bảo Chu sinh:\n" +
                "\n" +
                "– Quốc gia đại sự, không thể để phò mã đi theo, cũng không dặn dò được nhiều. Chỉ nhắc phò mã biết rằng ta đã sai Xuyên hoa sứ mang tiền của công chúa gửi cho phò mã dùng, phò mã cố gắng học thành tài, sẽ có ngày tái ngộ. Chẳng những công chúa mà còn cháu nhỏ cũng không tiện đi theo phò mã. Hãy tạm chia tay một thời gian, chừng hai mươi sáu tháng nữa, cha con sẽ lại hú hý với nhau. Thôi vào gặp vợ một tý để còn xuất hành!\n" +
                "\n" +
                "Chu sinh bước vào buồng nước mắt ứa ra. Công chúa lúc ấy đang sửa soạn hành trang, nàng bảo chồng:\n" +
                "\n" +
                "– Ở đời ly hợp là thường, miễn chàng cố gắng là sẽ gặp nhau không mấy chốc. Thiếp sợ chàng buồn nên đã cho thị nữ là Đồng Nhân làm bạn cho đến ngày tái ngộ. Thiếp lại tặng chàng một hòn ngọc bích làm bằng chất ngọt của các thứ hoa quý, mùa nực đeo vào thì mát, mùa rét thì ấm, chàng luôn luôn đeo bên mình xem như là có thiếp!\n" +
                "\n" +
                "Chu sinh vội bảo vợ:\n" +
                "\n" +
                "– Nàng có thể theo ta được không ? Hay nếu không thì nàng cho ta theo với.\n" +
                "\n" +
                "Công chúa đáp:\n" +
                "\n" +
                "– Không được. Hiện nay chàng đang còn sự nghiệp của chàng. Còn thiếp phải giúp mẹ bảo toàn cơ đồ và tính mạng muôn dân. Hai bề chưa vẹn, chưa theo nhau được. Thôi đừng buồn nữa, ngày sau hạnh phúc còn dài.\n" +
                "\n" +
                "Nói rồi dứt áo bước ra. Chu sinh lại níu lại hỏi:\n" +
                "\n" +
                "– Ngày sao sẽ gặp nhau ở đâu và vào lúc nào, nàng có thể cho ta biết trước được chăng?\n" +
                "\n" +
                "Công chúa cầm lấy hòn ngọc, bỏ vào túi áo chàng và nói:\n" +
                "\n" +
                "– Trong đó có nói rõ cả.\n" +
                "\n" +
                "Khi chợt tỉnh dậy thì Chu sinh thấy cảnh tượng lo lắng ly biệt vừa rồi đã biến đâu mất. Chàng vừa thắp đèn soi thì thấy giữa đường có một gói mười lạng vàng. Chàng móc túi, quả có một viên ngọc màu trắng như ngà, có vân xanh, dài như quản bút, trên có khắc mất câu thơ:\n" +
                "\n" +
                "Bao giờ mười vạn tinh binh,\n" +
                "\n" +
                "Nhạc quân trống trận rập rình ngoài biên.\n" +
                "\n" +
                "Phía Tây Hồ-thủy tiến thuyền,\n" +
                "\n" +
                "Hoa-cương nẻo nọ thẳng liền sang Đông.\n" +
                "\n" +
                "Chờ khi báo tiệp dâng công,\n" +
                "\n" +
                "Non song đề chữ tương phùng về sau.\n" +
                "\n" +
                "Xin đừng đắp nhớ đổi sầu,\n" +
                "\n" +
                "Mười lăm năm lại gặp nhau đó mà.\n" +
                "\n" +
                "Chàng đọc đi đọc lại hai ba lần vẫn không hiểu nghĩa thế nào. Rồi chàng cố suy nghĩ để tìm hiểu sự gặp gỡ bấy lâu nhưng cũng không thể ra manh mối. Óc rối như tơ vò, chàng bụng bảo dạ: – “Rồi thời gian khắc sẽ sáng tỏ. Chả hơi đâu mà nghĩ cho mệt”.\n" +
                "\n" +
                "Hôm ấy, trời chưa sáng đã nghe có tiếng khóc. Chàng vội chạy sang nhà láng giềng hỏi tin. Họ cho biết là người thím của chàng bị cảm chết sắp sửa đem đi chôn. Nghe thấy thế, Chu sinh quyết định trở lại nhà chú. Người chú thấy cháu ôm sách vở trở về thì không nén được tức giận, bảo:\n" +
                "\n" +
                "– Đã hai năm nay mày không đoái hoài gì đến tao, sao không đi luôn một thể, còn về mà làm gì?\n" +
                "\n" +
                "Chàng nhanh trí tìm được cách nói dối:\n" +
                "\n" +
                "– Hôm qua cháu chiêm bao thấy cha cháu về bảo rằng chú nghèo lắm, lại sắp có gia biến. Vậy có số vàng chôn ở nền nhà đào lên đưa về giúp chú. Vì thế bây giờ nghe tin có tang, cháu mới về.\n" +
                "\n" +
                "Nói rồi bày cả mười lạng vàng lên bàn. Thấy vậy, chú đổi giận ra mừng. Từ đấy, chu sinh yên tâm ở lại nhà chú học tập. Chàng không mộng mị như trước và cũng không hề rỉ răng với ai về việc lạ xảy ra.\n" +
                "\n" +
                "Khoa ấy, Chu sinh đậu hương cống. Chú dạm vợ cho mấy nơi nhưng chàng nhất thiết từ chối.\n" +
                "\n" +
                "Một hôm người chú đi buôn có đưa về một cô gái mười tám tuổi bị lạc đường. Nghe cô gái xưng tên là Đồng Nhân, Chu sinh sực nhớ đến lời vợ dặn trước khi chia tay, bèn bằng lòng theo lời bàn của chú, lấy nàng làm thiếp. Hơn một năm, Đồng Nhân sinh cho chàng một đứa con trai. Đứa bé càng lớn, Chu sinh càng thấy nó giống với đứa con của chàng ở nước Hoa-thành do công chúa đẻ với chàng. Chàng tính đốt ngón tay thì vừa hai mươi sáu tháng, đúng như lời quốc mẫu.\n" +
                "\n" +
                "Lúc này cuộc đời thật của Chu sinh ngày một vinh hiển và giàu thịnh hơn trước. Chàng làm quan to trong triều, được mọi người nể phục.\n" +
                "\n" +
                "Một năm, ở Tuyên-quang có giặc, vua phong cho chàng làm đại tướng mang hai vạn quân đi dẹp giặc. Quan quân sắp tới trại thì gặp một con khe ngăn đường. Hỏi dân gần đấy thì họ cho biết đó là khe Hồ-thủy, trước mặt là Hoa-điệp-cương, đi vòng sang phía Tây hoặc phía Đông một ngày là đến trại giặc. Nghe nhắc đến những tên ấy, chàng bỗng nhớ tới những câu khắc trên hòn ngọc. Chàng mới giở ngọc ra đọc lại bài thơ thì rõ ràng đó là những lời kín đáo bày ra cho chàng mẹo phá giặc. Chàng cứ theo kế đó hai mặt tiến công, quả nhiên giặc thua to, bị giết và bị bắt gần hết.\n" +
                "\n" +
                "Sau khi thắng trận, chàng đi thuyền quanh Hoa-cương. Người lái đò cho chàng biết cách đây 15 năm có một đàn bướm độ vài vạn con nửa đêm ở đâu bay tới rợp trời cho nên gọi là Hoa-điệp. Chu sinh hiểu ra, vừa lạ vừa mừng, vội sai dừng thuyền lại nghỉ ngơi. Đêm hôm ấy chàng lại chiêm bao thấy Xuyên Hoa sứ đến đón. Chàng đi ngay. Lúc đến nơi, chàng nhận thấy cảnh vật lúc này đẹp hơn xưa nhiều: lâu đài quy mô, dân cư đông đúc. Vừa tới cửa hoàng cung đã có quốc mẫu ra đón niềm nở:\n" +
                "\n" +
                "– Phò mã đi dẹp giặc hẳn là khó nhọc. Chao ôi, bây giờ râu ria mọc đã dài không được trẻ như trước. Ngày tháng chóng thật!\n" +
                "\n" +
                "Rồi đó chàng lại gặp công chúa ở Tây phòng, hai bên chuyện trò ái ân vô cùng nồng đượm.\n" +
                "\n" +
                "Qua ngày sau, mãi đến chiều, Chu sinh vẫn chưa muốn về. Quốc mẫu vào buồng giục chàng cố làm cho xong việc nước, và bảo:\n" +
                "\n" +
                "– Ta nay đã già lắm rồi. Ta quyết định mười hôm nữa sẽ chia đôi nước, một nửa cho thái tử, một nửa cho công chúa. Vậy phò mã nhớ trở lại đây mà coi lấy nước mới. Ngày nay dân sự yên ổn nhưng phò mã cũng nên chú ý phòng ngừa quân địch vẫn thường đột nhập vào quấy rối trong nước Hoa-thành này.\n" +
                "\n" +
                "Chu sinh chỉ kịp dạ mấy tiếng trong mơ thì đã có người đánh thức dậy. Bọn tỳ nữ vây xung quanh cho biết là chàng đã ngủ một đêm một ngày. Chàng vội nói tránh cho họ yên tâm:\n" +
                "\n" +
                "– Lâu nay việc quân mệt nhọc nên ngủ bù, không ngờ làm phiền chư tướng.\n" +
                "\n" +
                "Đoạn, chàng trù tính việc đề phòng cho nước Hoa-thành. Chàng nghĩ, chỉ có loài chim là kẻ thù của bướm nên ngay sau đó chàng tậu luôn ba mươi khu ruộng xung quanh Hoa-cương, cho người cày cấy ăn không với mỗi nhiệm vụ là đuổi bắt chim chóc cho mình.\n" +
                "\n" +
                "Thế rồi chàng mang quân về. Nhà vua khen ngợi công lao chàng và ban thưởng rất hậu. Nhưng vua thấy ngạc nhiên khi thấy liền đó, chàng dâng biểu xin từ chức. Vua không ép được đành phải để chàng thỏa chí.\n" +
                "\n" +
                "Được thôi quan, một hôm chàng từ giã chú, đưa vợ con lên thăm vùng Hoa-điệp-cương. Sắp tới nơi, tự nhiên cả ba người hóa làm ba con bướm trắng bay lên trời. Vượt qua Hồ-thủy, Xuyên Hoa sứ và cả một đại đội quân nhà bướm tiến ra đón bọn họ."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/02/qu%E1%BA%A3-b%E1%BA%A7u-k%E1%BB%B3-l%E1%BA%A1-640x440.png", "Quả bầu kỳ lạ", "Tờ Chú (có nghĩa là anh đen) nghèo nhất làng. Họ nghèo lắm, nghèo đến nỗi không có một con dao mẻ để phát nương, một cái thuổng để đào củ mài. Tờ Chú phải đi ờ cho chủ làng để lấy cơm gạo nuôi thân, nuôi mẹ.\n" +
                "Nhà chủ làng giàu lắm, trâu hàng đàn, voi hàng lũ, ruộng chim bay mỏi cánh, muông thú chạy chồn chân không hết. Tờ Chú không ao ước gì hơn ngoài mảnh ruộng, đám nương để cấy lúa, trồng ngô nuôi mẹ.\n" +
                "Một hôm Tờ Chú nói vơi chủ làng:\n" +
                "– Tôi không muốn ở thuê cho chủ làng mãi. Tôi muốn có một mảnh ruộng, một đám nương. Chủ làng có thể cho tôi một khoảng rừng để tôi phái nương, vỡ ruộng được không?\n" +
                "Chủ làng nghe chàng trai nói vậy, lắc đầu.\n" +
                "Nhiều lần Tờ Chú hỏi xin nhưng không lần nào chủa làng trả lời cả. Một hôm chủ làng đang uống rượu, Tờ Chú lại vào xin. Hắn bực mình chỉ lên dãy núi xanh xanh phía chân trời và nói:\n" +
                "– Thôi được, mày đã muốn thì tao cũng chẳng tiếc nữa. Nếu mày có sức thì cả dãy núi kia, tha hồ cho mày phát.\n" +
                "Nghe chủ làng nói thế, Tờ Chú sung sướng quá, vội chạy về báo tin cho mẹ biết. Mẹ khuyên:\n" +
                "– Con chớ nên đi, dãy núi hoang kia là chỗ ở của hùm beo, rắn rết. Con lên đấy sẽ bị chết mất xác. Rồi đây, ai thay con nuôi nấng, chăm sóc mẹ?\n" +
                "Tờ Chú an ủi:\n" +
                "– Mẹ không lo. Hùm beo con chẳng sợ, rắn rết con chẳng kinh. Chủ làng đã cho đất, nhất định con sẽ phát được nương, vỡ được ruộng.\n" +
                "Thấy con quả quyết, người mẹ cũng không can ngăn nữa. Sáng hôm sau, Tờ Chú từ biệt mẹ lên đường. Chàng cứ nhắm hướng núi xanh trước mặt mà đi. Đi mãi, suốt chín ngày, chín đêm liền không nghỉ, ngày thứ mười, Tờ Chú đến chân núi. Đó là một khu rừng rộng bạt ngàn, cây to cây nhỏ chen nhau kín mặt đất. Chàn dùng tay không bẻ gãy cây nhỏ, lấy đá đập đổ cây to. Qua chín ngày, chín đêm nữa, Tờ Chú đã khai phá được một khu đất rộng. Đến ngày thứ mười, anh bỗng thấy một con chim gõ kiến bay đến nói:\n" +
                "– Nghĩ tay một tý đã, Tờ Chú. Tôi có câu chuyện muốn nói vơi anh. Hãy để cho loài chim chúng tôi ít cây để làm tổ. Rẫy của anh đã dài hơn rẫy chủ làng rồi đó. Tôi bay rã cả cánh ra rồi mà vẫn không hết đám rẫy anh vừa phát.\n" +
                "Nghe chim gõ kiến nói, Tờ Chú ngưng tay không phát theo chiều dọc nữa. Chàng quay lại phát chiều ngang. Cũng đến ngày thứ mười thì chàng thấy một con nai vàng từ trong rừng chạy ra, nói:\n" +
                "– Rẫy của anh rộng gập đôi rẫy của chủ làng rồi. Tôi chạy đã mỏi cả gối mà vẫn không hết. Anh hãy dành chỗ đất cho loài thú chúng tôi.\n" +
                "Tờ Chú nghe lời nai, ngừng tay. Đúng là rẫy của chàng bề dài hơn rẫy của chủ làng, bề ngang rộng hơn rẫy chủ làng. Từ nay, gia đình chàng sẽ có ngô, lúa. Tờ Chú đập đá lấy lửa đốt rẫy. Xong việc, chàng về bản lấy thóc giống lên gieo. Nhưng khi về đến nhà, bao nhiêu thóc giống, mẹ chàng đã ăn hết cả rồi. Chàng hỏi vay các nhà trong bản, nhưng chẳng ai còn thóc cho chàng vay. Cùng đường, Tờ Chú phải đến nhà chủ làng vay thóc giống. Tên chủ làng nham hiểm cho chàng vay loại thóc đã luộc chín rồi. Tờ Chú không biết cứ mang lên rẫy gieo. Không thấy lúa mọc, chàng lại đến nhà chủ làng vay lần nữa. Chủ làng nói:\n" +
                "– Giàng không cho mày sướng đâu,Tờ Chú ạ. Mày đừng phí công vô ích. Nếu lần này mày gieo không mọc thì đúng là cái số mày như vậy. Mày lại đến ở thuê cho tao thôi.\n" +
                "Đúng như chủ làng nói, lần thứ hai, Tờ Chú gieo lúa vẫn không mọc. Nhìn cả đám rẫy, cỏ đã bắt đầu mọc, cây non đã đâm chồi. Tờ Chú buồn quá ngồi khóc. Chắc là Giàng không muốn cho mẹ con chàng có gạo cơm, bỗng thấy một quả bầu khô từ đâu trôi đến, đụng vào chân. Bực mình, chàng đá quả bầu cho trôi theo dòng nước, nhưng nó lại trôi trở lại, đụng vào chân chàng. Hai ba lần như vậy, Tờ Chú nghĩ: “Hay là mình trồng bầu ăn vậy. Ăn bầu người cũng sống được. Nếu không, mình chỉ còn cách là lại đi làm thuê cho chủ làng”.\n" +
                "Nghĩ vậy, chàng vớt quả bầu lên rồi về nhà từ biệt mẹ lên rẫy trồng bầu. Đến nơi, chàng ghè quả bầu vào đá, lấy hạt rắc khắp rẫy.\n" +
                "Hôm sau, ra xem rẫy. Tờ Chú hết sức kinh ngạc vì rẫy của chàng đã là một rừng bầu. Hôm sau nữa, bầu đã ra hoa và ngày thứ ba thì khắp rẫy lố nhố những quả.\n" +
                "Tờ Chú mừng quá, hái một quả về nướng ăn thì thấy rất thơm ngon. Sung sướng quá, chàng reo lên:\n" +
                "– Sống rồi, ta sẽ mang bầu về cho mẹ, chắc là mẹ mừng lắm.\n" +
                "Nhưng khi ra đến rẫy định hái bầu về cho mẹ thì cả rẫy bầu đã úa vàng. Quả bầu mới hôm qua xanh mơn mởn, hôm nay đã khô đét. Tờ Chú đi đi lại lại khắp rẫy, nhìn những quả bầu khô, nước mắt cứ trào ra. Chàng nghĩ: “Giàng không cho ăn bầu tươi, thì lấy hạt bầu về cho mẹ ăn cầm hơi vậy”. Chàng liền hái một quả ghé vào đá. Quả bầu vỡ đôi, tung ra không biết cơ man nào là hạt, nhưng không giống những hạt bầu mà là một thứ hạt nhỏ, vỏ cứng. Tờ Chú nhìn kỹ thì đúng là hạt thóc. Thóc cứ chảy rào rào như thác nước. Kinh ngạc quá, chàng đập thử quả thứ hai rồi quả thứ ba, quả nào cũng đầy những thóc là thóc. Tờ Chú mừng quá vội đi hái bầu, chất từng đống vào chòi rồi gùi thóc về nhà cho mẹ.\n" +
                "Đến nhà, thấy mẹ đang nằm co quắp bên đống lửa tàn, da bọc lấy xương vì đói. Tờ Chú hốt hoảng lay gọi mẹ.\n" +
                "– Mẹ ơi, có lúa gạo rồi. Con đem về đây, mẹ dậy mà ăn.\n" +
                "Người mẹ mở mắt, trông thấy con, nước mắt cứ trào ra. Đến khi nhìn thấy gùi thóc bên bếp bà lại nhắm mắt lại và nói.\n" +
                "– Con đem bán thóc trả cho người ta, con ạ. Mẹ không nở ăn cơm gạo không phải do sức của mẹ con ta làm ra. Thà là mẹ chết còn hơn ăn phải của ăn trộm, ăn cắp.\n" +
                "– Mẹ ơi, thóc của nhà ta đấy mà. Tờ Chú vội nói.\n" +
                "Người mẹ vẫn lắc đầu:\n" +
                "– Con đi gieo lúa, lúa không mọc. Con đi gieo bầy, bầy ăn được thì Giàng lại làm cho héo đi. Thế mà con bảo là thóc của rẫy nhà ta thì mẹ tin sao được.\n" +
                "– Nếu mẹ không tin thì để con cõng mẹ lên rẫy xem, mẹ sẽ rõ.\n" +
                "Không đợi mẹ trả lời, Tờ Chú nâng mẹ dậy, sốc bà cụ lên lưng cõng đi. Chàng đi như bay, phút chốc đã đến chòi giữa rẫy. Chàng đặt mẹ nằm bên bếp lửa rồi lấy một quả bầu, ghè vào đá. Thóc từ trong quả bầu rào rào chảy ra như thác nước. Người mẹ thấy vậy, mắt sáng lên:\n" +
                "– Giàng giúp mẹ con ta rồi con ơi.\n" +
                "Từ ngày có rẫy bầy kỳ lạ, mẹ con Tờ Chú trở nên no đủ. Dân dưới bản bị đói, kêu nhau lên rẫy đào củ, được mẹ con chàng cho thóc, nhờ vậy mà qua được nạn đói.\n" +
                "Chủ làng nghe tin Tờ Chú nhờ phát rẫy trên núi trồng bầy mà có dư lúa gạo, bèn tìm cách đòi nợ. Tờ Chú trả rất sòng phẳng hàng chục quả bầu, chủ làng hí hửng màng bầy về, chắc mẩm phen này sẽ suốt đời dư thóc gạo. Nhưng khi đập bầu ra thì quả nào cũng toàn sỏi cát. Chủ làng tức giận nhưng không làm gì được chàng trai. Còn mẹ con Tờ Chú từ đó trở đi không bao giờ bị đói như xưa nữa."))
        listStoryTDG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/01/hqdefault-640x440.jpg", "Nhặt bã trầu", "Một ông quan vào quán ngồi bệ vệ lắm, Quỳnh giả làm học trò xác, mon men đến đứng bên, hễ thấy quan ăn miếng trầu nào nhả bã ra thì lại cúi xuống nhặt.\n" +
                "\n" +
                "Quan hỏi:\n" +
                "\n" +
                "– Mày là ai?\n" +
                "\n" +
                "– Bẩm, tôi là học trò.\n" +
                "\n" +
                "– Học trò sao lại lẩn thẩn thế?\n" +
                "\n" +
                "– Bẩm, chúng tôi thấy phương ngôn thường nói: “Miệng kẻ sang có gang có thép!”, chúng tôi nhặt xem gang thép như thế nào.\n" +
                "\n" +
                "Quan thấy Quỳnh có ý xược, ra oai thét:\n" +
                "\n" +
                "– Ðã xưng là học trò, thì phải đối ngay câu phương ngôn ấy đi, đối được thì tha cho, không sẽ đánh đòn!\n" +
                "\n" +
                "Quỳnh rụt tè thưa:\n" +
                "\n" +
                "– Bẩm quan khó lắm!\n" +
                "\n" +
                "Quan lại quở:\n" +
                "\n" +
                "– Khó thì khó cũng phải đối!\n" +
                "\n" +
                "– Bẩm quan con xin đối.\n" +
                "\n" +
                "– Nói mau!\n" +
                "\n" +
                "Quỳnh mới đọc:\n" +
                "\n" +
                "– Ðồ nhà khó vừa nhọ vừa thâm.\n" +
                "\n" +
                "Quan ngồi lặng đi rồi đỏ mặt nói:\n" +
                "\n" +
                "– Ừ đối cũng chỉnh, nhưng mà xấc lắm."))
    }

    private fun addListStoryCTTG() {
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/woman_watering_plants-660x440.jpg", "Sự tích hoa Antigon", "Theo truyền thuyết Hy Lạp thì tiền thân của hoa Antigôn là một nàng công chúa xinh đẹp con vua Ơđipơ và hoàng hậu Jocaxto. Ngày xưa ở vùng Thêbet, khi hoàng hậu Jocaxto sinh hạ hoàng tử Ơđipo thì nhà vua Laios được báo mộng rằng lớn lên hoàng tử sẽ giết vua cha và lấy hoàng hậu . Sợ hãi vua sai đem hoàng tử vứt bỏ một nơi thật xa. Ơđipơ được những người chăn cừu vùng Corintho đem về nuôi. Lớn lên, chàng trở thành một thanh niên tuấn tú, có sức khoẻ phi thường. Một lần vì bất hoà với một người đi đường, chàng không ngờ đó là vua cha của mình, chàng đã giết chết người đó.\n" +
                "\n" +
                "Lúc bấy giờ ở Thêbét, có một con quái vật đầu người mình sư tử (nhân sư) thường đến quấy nhiễu nhân dân. Vua Crêon, người kế nghiệp Laios trao giải thưởng: Hễ ai giết được con quái vật sẽ được truyền ngôi và lấy hoàng hậu làm vợ. Ơđipơ đã giết được con nhân sư và lên làm vua. Sau khi sinh hạ với Jocaxto được ba người con: một con gái tên là Antigôn và hai con trai là Ereoclơ và Polynixơ, Ơđipơ được thần báo mộng về mối tình oan trái của mình.\n" +
                "\n" +
                "Đau đớn và thất vọng ! Jocaxtơ treo cổ tự tử còn Ơđipơ thì chọc mù hai mắt và rời khỏi thành phố. Vua Crêon đem Polynixơ ra xử tử và cấm không một ai được đến gần. Vì thương em, Antigon đã dũng cảm đem xác em đi mai táng. Nàng bị vua Crêon giết chết. Cô vừa ngã xuống, một dây hoa rất mảnh trườn lên khỏi mặt đất. Xen giữa những chiếc lá xanh là những chùm hoa màu hồng rất đẹp, bất chấp tất cả mọi luật lệ hoa cứ vươn mãi ra khoe sắc."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/lovely_girl_cartoon_S-08020-660x440.jpg", "Nàng Ngón Út", "Xưa có một nhà nọ, tuy hai vợ chồng tuổi đã ngoài bốn mươi nhưng không con. Hai người rất lấy làm buồn phiền về sự hẩm hiu của mình.\n" +
                "\n" +
                "Một hôm, hai vợ chống bàn với nhau sắm lễ vật đến tháp cầu con. Họ khấn rằng:\n" +
                "\n" +
                "– Cúi lạy thánh thần, xin ngài xuống phước cho chúng con, ban cho một đứa con, dù là gái, xấu xí bé nhỏ cũng được, vì chúng con tuổi mỗi ngày một già mà không có tiếng trẻ làm vui.\n" +
                "\n" +
                "Sau đó mấy hôm thì người vợ quả nhiên có nghén. Bà nói cho người chồng biết. Hai vợ chồng rất lấy làm vui mừng. Họ ngày đêm hy vọng đứa bé sắp ra đời sẽ khôn ngoan, xinh đẹp hơn các đứa bé khác.\n" +
                "\n" +
                "Nhưng lạ thay, đã mười tháng mà chưa chuyển dạ. Rồi hai năm qua, ba năm trôi qua. Hai vợ chồng rất lo sợ, buồn phiền.\n" +
                "\n" +
                "Rồi cũng đến ngày bà chuyển dạ. Bà sinh ra một bé gái chỉ bằng ngón tay út. Hai vợ chồng nhìn con mà lòng đau như cắt. Tuy nhiên, họ cũng hy vọng rồi đứa bé sẽ lớn dần.\n" +
                "\n" +
                "Hai vợ chồng đặt tên cho con gái là Ka Điêng. Từ ngày sinh Ka Điêng, hai vợ chồng ít đi thăm bà con hàng xóm. Họ thấy tủi hổ về đứa con quái dị.\n" +
                "\n" +
                "Thấm thoắt đã được mười sáu năm, đứa bé vẫn không lớn lên thêm được tí nào, nhưng cũng biết nói, biết đi như người thường. Hai vợ chồng già ngày càng buồn chán và lo sợ. Họ càng than phiền về số phận hẩm hiu của mình.\n" +
                "\n" +
                "Rồi một hôm, hai vợ chồng to nhỏ bàn với nhau tìm cách bỏ chết đứa bé. Người chồng trước mặt vợ thì thuần tình đem đứa bé bỏ vào rừng sâu, gửi nó cho thú dữ, nhưng khi nhìn lại đứa con ruột thịt thì không nỡ lòng.\n" +
                "\n" +
                "Đêm hôm ấy, người chồng lén sắp cơm gạo, mắm muối đủ chừng một tháng. Sáng hôm sau ông gạt nước mắt bồng con gái vào rừng, cùng với số lượng đồ dự trữ hồi đêm ông đã dấu ngoài bụi. Vào đến rừng sâu, ông chặt cây làm một cái chòi nhỏ. Dựng xong chiếc chòi thì trời đã quá trưa. Ông lấy gói cơm mở ra rồi hai cha con cùng ăn. Đang ăn. Ka Điêng thấy cha tự dưng nước mắt chảy ròng bèn hỏi:\n" +
                "\n" +
                "– Ơ kìa, tại sao cha lại khóc, hay cha sợ thú rừng?\n" +
                "\n" +
                "Người cha nhìn con ngậm ngùi rằng:\n" +
                "\n" +
                "– Cha không sợ thú rừng đâu con ạ! Cha khóc vì một lát nữa hai cha con sẽ tạm xa nhau. Mẹ con từ khi sinh con đến nay đã mười sáu năm, nhưng không lúc nào được khuây khoả, vì con không được như những đứa con hàng xóm, mặc dù cha mẹ đã hết lòng chăm sóc con. Cha mẹ nghĩ không nở tâm, nhưng không còn cách nào hơn. Nay cha dựng cho con cái chòi này, cùng miếng rẫy kia, để con trồng dưa sống tạm qua ngày. Thỉnh thoảng cha sẽ đến thăm con. Cha cầu trời phù hộ cho con được an lành, thoát khỏi các tai hoạ.\n" +
                "\n" +
                "Nàng Ka Điêng nghe cha nói vậy cũng mủi lòng. Thế rồi hai cha con ngậm ngùi chia tay.\n" +
                "\n" +
                "Từ khi đem con vào rừng sâu, thỉnh thoảng cha nàng lại ghé thăm và chăm sóc đám dưa dùm Ka Điêng. Với ngày tháng, Ka Điêng vẫn sống bình thường, rẫy dưa hấu ngày một tốt tươi và ra hoa kết quả.\n" +
                "\n" +
                "Một hôm, có một hoàng tử dẫn đoàn quân đi săn bắn. Khi trở về, đoàn quân đi qua đám dưa của nàng Ka Điêng. Đoàn quân lấy làm lạ không hiểu tại sao giữa nơi rừng sâu này lại có trơ trọi mỗi rẫy dưa. Họ muốn ghé vào hái ăn. Nhưng thấy vắng chủ, bèn đến trình hoàng tử, và xin vào hái trái ăn đỡ khát. Nghe nói có rẫy dưa hấu tốt quả ở chốn rừng sâu, hoàng tử đích thân vào đám dưa xem thử chủ rẫy là ai. Hoàng tử nhìn thấy những trái dưa to thì làm lạ lắm. Nhưng chưa gặp được chủ dưa nên chưa dám hái. Chàng hái thử một trái bổ ra ăn nếm. Mới ăn được nửa trái, hoàng tử đã thấy no, dưa rất ngọt mà lại nhiều nước. Nửa còn lại hoàng tử đành bỏ đấy.\n" +
                "\n" +
                "Chờ cho đoàn người lạ đi khỏi, nàng Ka Điêng mới từ chỗ nấp ra thăm dưa. Thấy nửa trái dưa bỏ dở còn đỏ tươi, nàng thấy tiếc, bèn nhặt lên ăn nốt.\n" +
                "\n" +
                "Từ khi Ka Điêng ăn nửa quả dưa thừa ấy, người nàng tự nhiên trở nên khác thường. Nàng đã thụ thai.\n" +
                "\n" +
                "Một năm sau, Ka Điêng sinh ra một bé trai mặt mày rất khôi ngô tuấn tú. Nàng không còn quạnh hiu như lúc trước. Mặc dù không biết người cha của đứa bé là ai nhưng nàng vẫn cảm thấy vui sướng.\n" +
                "\n" +
                "Bẵng đi hơn một năm trời. Một hôm hoàng tử lại đem quân đi săn bắn. Lúc đi ngang rẫy dưa năm trước bỗng chàng nghe có tiếng hát ru con với giọng buồn quyến rũ, mà lại như oán than. Hoàng tử lấy làm lạ, định vào nhưng trời sắp tối, nên chàng lưỡng lự. Tiếng hát não nề cứ cất lên, khiến cho hoàng tử càng mê mẫn không đành rời bước. Hoàng tử quyết ở lại để tìm xem ai mà có tiếng hát quyến rũ lòng người đến thế.\n" +
                "\n" +
                "Nàng Ka Điêng vừa trông thấy một chàng trai xinh đẹp từ xa đang xăm xăm bước tới chỗ mình, liền liền bỏ con trên nôi mà lẫn trốn. Hoàng tử bước vào chòi tranh thấy đứa bé đang nằm trên nôi một mình. Nhìn đứa bé, hoàng tử tự nhiên thấy mình yêu nó lạ lùng. Không cón do dự, chàng bèn cuối xuống bồng đứa bé lên hôn. Chàng ẵm đứa bé đi quan chòi tìm ngóng tìm xem mẹ đứa bé ở đâu, mà mãi vẫn không thấy. Rồi trời sập tối lúc nào không rõ. Còn về nàng Ka Điêng, khi nhìn thấy chàng trai lạ ẵm con mình thì định ra giành lấy, nhưng lại thôi vì sợ người lạ thấy mặt, xấu hổ. Nàng nhìn lên chàng trai thì rất ngạc nhiên, vì thấy mặt con mình giống chàng như một. Nàng suy nghĩ, nhưng lại cảm thấy vô lí, vì nàng chưa hề chung đụng với chàng cũng như với bất cứ người con trai nào bao giờ.\n" +
                "\n" +
                "Đang miên man suy nghĩ thì đứa bé khóc ré lên, nàng hốt hoảng bối rối, bèn lên tiếng:\n" +
                "\n" +
                "– Xin người khách hãy trả đứa bé vào nôi cho tôi. Và xin khách lạ vui lòng đi khỏi chòi tranh xấu xí này.\n" +
                "\n" +
                "Nghe có tiếng người, hoàng tử đưa mắt tìm tứ phía, nhưng vẫn chẳng thấy ai cả. Hoàng tử bèn lên tiếng:\n" +
                "\n" +
                "– Hỡi người mẹ đứa bé khôi ngô tuấn tú này, hãy vui lòng cho tôi thấy mặt, dù chỉ một đôi chút cũng cam lòng. Nếu nàng từ chối thì tôi sẽ ở trọn đêm nay lại đây, ngày mai tôi sẽ bắt luôn đứa bé đem về.\n" +
                "\n" +
                "Nàng Ka Điêng nghe hoàng tử nói vậy bèn từ chỗ nấp bước ra. Hoàng tử hết sức ngạc nhiên khi thấy một người đàn bà vô cùng bé nhỏ mà lại là mẹ của một đứa bé to lớn như những đứa trẻ con khác. Mãi một lúc sau hoàng tử mới ngẫm nghĩ và nói:\n" +
                "\n" +
                "– Nói thật cùng em, ý anh đã quyết, dù có gian lao cực nhọc đến đâu anh cũng cam lòng cùng chung sống với em và đứa trẻ khôi ngô này. Mong em đừng từ chối, biết đâu đấy chẳng là duyên trời định.\n" +
                "\n" +
                "Nàng Ka Điêng lấy làm cảm động bởi những lời lẽ chân tình của chàng, nên bằng lòng chấp nhận cuộc kết nghĩa trăm năm. Hai người nên vợ nên chồng từ đó.\n" +
                "\n" +
                "Việc hoàng tử lấy một người vợ vô cùng nhỏ bé dần dần đã đến tai vua cha và hoàng hậu, cùng hai người anh.\n" +
                "\n" +
                "Một hôm, hai người anh vào tâu vua cha để tìm cách ly gián hoàng tử với nàng Ka Điêng, vì cho rằng Ka Điêng là một yêu quái hiện hình, dùng tà thuật mê hoặc em mình, biết đâu chẳng có ngày nó lại làm đổ triều chính gia phong.\n" +
                "\n" +
                "Nghe hai hoàng tử nói có lý, một hôm nhà vua cho gọi cả ba con trai lại, rồi truyền rằng:\n" +
                "\n" +
                "– Ta truyền cho các con, nội trong bảy hôm, các con hãy dẫn đến cho ta nhìn mặt ba nàng dâu cùng với lễ vật. Mỗi người con dâu phải mang cho ta một bộ y phục, gồm đầy đủ hia mũ, áo quần, cùng quà bánh. Nếu lễ vật của ai vừa ý ta thì sẽ nhường ngôi, nhưng nếu ai không tuân lệnh thì sẽ bị nghiêm trị không dung thứ.\n" +
                "\n" +
                "Hoàng tử út nghe lệnh vua ban khắc khe như vậy thì rất lo sợ. Chàng lấy làm chán nản không muốn trở lại chòi tranh, nhưng lại nhớ đến đứa bé và người vợ, nên đành quay gót trở về.\n" +
                "\n" +
                "Nàng Ka Điêng thấy chồng trở về với bộ mặt lo buồn, thì hỏi:\n" +
                "\n" +
                "– Hình như chàng có điều gì sầu muộn, chẳng hay tại triều nội có việc gì? Chàng có thể cho em biết được chăng?\n" +
                "\n" +
                "Hoàng tử bèn thuật lại cho vợ nghe những điều mà vua cha vừa ban. Nghe xong câu chuyện, nàng Ka Điêng mỉm cười với chồng:\n" +
                "\n" +
                "– Xin chàng đừng buồn, em sẽ lo liệu mọi việc chu toàn. Xin chàng chớ bận tâm về những chuyện nhỏ mọn ấy.\n" +
                "\n" +
                "Hoàng tử nghe nàng nói mà lòng vẫn hồ nghi, nhưng không còn cách nào khác, nên cũng yên lòng chờ xem.\n" +
                "\n" +
                "Sắp đến ngày hẹn mà vẫn chưa thấy vợ sắm sửa được gì, hoàng tử càng sốt ruột. Nàng Ka Điêng thấy chồng không được bình tâm chỉ cười mà không nói gì, nên chàng càng thêm lo lắng.\n" +
                "\n" +
                "Đến ngày hẹn, hoàng tử vô cùng bối rối, lo nghĩ. Chàng định nói với vợ về những lo lắng của mình, thì bỗng trong chớp mắt hiện lên một người con gái vô cùng xinh đẹp đứng mỉm cười trước mặt chàng. Nàng Ka Điêng đã hiện nguyên hình. Nàng cười nói với hoàng tử:\n" +
                "\n" +
                "– Chàng không nhận ra em ư? Em là Ka Điêng vợ chàng đây. Chúng ta hãy sớm lên đường về kinh kẻo muộn, phiền đến vua cha cùng các anh trông đợi.\n" +
                "\n" +
                "Lúc bấy giờ hoàng tử vẫn chưa hế ngạc nhiên, nhưng cũng rất sung sướng. Hai vợ chồng vội vàng sắm sửa lễ vật cùng hành trang để lên đường về kinh. Tại triều nội, đức vua và hoàng hậu ngừ trên ngai vàng, hai bên đủ mặt bá quan văn võ. Nhà vua cho gọi từng người con lên dâng lễ. Đầu tiên là hai vợ chồng anh cả, rồi tiếp đến vợ chồng hoàng tử hai. Cả hai đôi vợ chồng người anh đều dâng mũ, áo, quà bánh, nhưng đều bị vua cha và hoàng hậu loại, vì quà bánh thì không có gì lạ và ngon hơn những loại vua và hoàng hậu đã từng ăn, áo mũ thì cũng không có cái nào vừa cả.\n" +
                "\n" +
                "Đến lượt hoàng tử út, đức vua và hoàng hậu vừa trông thấy vợ chàng thì tưởng như có tiên nga giáng thế. Vua cha và hoàng hậu cùng bá quan phải trầm trồ khen ngợi vì sắc đẹp của nàng. Khi nàng Ka Điêng dân quà bánh lên, vừa mở ra, mùi vị đã bốc lên ngào ngạt. Vua cha và hoàng hậu dùng bánh của nàng rất ngon lành. Đến bộ cẩm bào, món đồ quý giá toàn là trân châu, mã não, vua xỏ thử thì thứ nào cũng vừa như in. Dùng thử xong mọi thứ đâu đấy, vua cha hỏi cô con dâu út:\n" +
                "\n" +
                "– Con hãy tâu cho cha rõ tên và ý nghĩa của hai loại bánh này?\n" +
                "\n" +
                "Nàng Ka Điên cúi đầu thưa:\n" +
                "\n" +
                "– Muôn tâu đức phụ hoàng và mẫu hậu, bánh hình tròn màu đỏ gọi là Sakaya làm bằng trứng gà và đường, chưng cách thuỷ, tượng trưng cho thần thái dương hệ, ví như phụ hoàng, thuộc về dương. Còn loại bánh làm bằng nếp hương, giữa có nhân đậu tên là Pay nung tường trưng mặt đất, thuộc âm ví như mẫu hậu. Ý nghĩa của hai loại bánh trên là tỏ lòng kính biếu bậc sinh thành. Kính mong phụ hoàng cùng mẫu hậu nhận sự biết ơn chân thành của chúng con.\n" +
                "\n" +
                "Nhà vua cùng hoàng hậu khi nghe vợ hoàn tử út nói vậy lấy làm cảm động, và cùng khen nàng dâu thảo. Nhà vua phán:\n" +
                "\n" +
                "– Trẫm nay tuổi già sức yếu. Xét hoàng tử út là người trung can, nghĩa khí, một gươn tốt soi chung toàn dân. Vậy trước đông đủ các mặt các khanh, ta truyền cho hoàn tử út được kế vị ngai vàng. Còn hai loại bánh Sakaya và Pay nung phải truyền khắp bàn dân thiên hạ, để từ nay mỗi khi làm lễ cầu hôn, hoặc giỗ tổ tiên, mọi người đều phải dùng hai loại bánh này.\n" +
                "\n" +
                "Truyền lệnh xong thì nhà vua bãi triều. Hôm sau triều đình tổ chức đại lễ tôn hoàng tử út lên làm vua và nàng Ka Điêng lên làm hoàng hậu.\n" +
                "\n" +
                "Bàn dân thiên hạ quanh vùng nghe tin cũng tự tổ chức ăn mừng vị tân vương và tân hoàng hậu. Còn hai người anh và hai chị dâu từ lấy hổ thẹn kéo nhau ra về."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/2accss-660x440.jpg", "Sự tích hoa Tuy Líp", "Bạn đã có dịp được nghe hoa trò chuyện chưa? Còn tôi, thú thật là vào một sớm đầu xuân tôi đã tình cờ được nghe hoa Tuyết trò chuyện với hoa Tuy Líp của người Udơbếch rồi. Đúng hơn là hoa Tuy Líp nói, còn hoa Tuyết thì chỉ lắng tai nghe, thi thoảng mới ngắt lời bạn bằng một vài câu hỏi.\n" +
                "\n" +
                "Nhưng tốt nhất là tôi sẽ kể lần lượt cho các bạn nghe mọi chuyện. Tôi đã được một người bạn gái tặng cho mấy hạt hoa Tuy Líp tìm được trên các sườn đá Derapsan. Về mùa Thu, tôi đem những cái hạt ấy trồng trong mảnh vườn bên cạnh bức tường nhà, gần một khóm hoa Tuyết.\n" +
                "\n" +
                "Mùa Xuân, tuyết thường tan vào tháng ba, tiết trời ấm áp một cách đặc biệt. Tất cả các bông hoa Tuyết cũng như hoa Tuy Líp đều lần lượt nhú lên qua một lớp tuyết mỏng và hớn hở đón chào mùa xuân.\n" +
                "\n" +
                "Vào một đêm tháng tư, tôi ngồi lại khá muộn trước một công trình mà tôi chỉ muốn làm cho xong ngay. Khi tôi đặt dấu chấm cuối cùng rồi ra mở cửa sổ, ngồi xuống chiếc ghế bành nghỉ xả hơi, hít thở luồng không khí trong lành thì ở phía chân trời đã rực lên ánh bình minh. Tôi chợt nghe có tiếng reo thanh thanh, thật tươi rói và dễ chịu, hệt như những chiếc ly pha lê chạm nhẹ vào nhau ở đâu đó.\n" +
                "\n" +
                "– Xin chào – Bông hoa Tuyết khẽ lên tiếng.\n" +
                "\n" +
                "Sau đấy là giọng đáp lại hơi khô một chút:\n" +
                "\n" +
                "– Chào!\n" +
                "\n" +
                "– Hẳn cậu là người ở xứ khác đến khu vườn nhà chúng tớ? – Vẫn giọng nói thanh thản hỏi.\n" +
                "\n" +
                "– Lần đầu tiên tôi được nở hoa ở đây.\n" +
                "\n" +
                "– Vậy, chúng ta quen nhau rồi nhé. Tôi là cây hoa Tuyết.\n" +
                "\n" +
                "– Còn tôi là hoa Tuy Líp.\n" +
                "\n" +
                "– Cậu từ đâu tới đây?\n" +
                "\n" +
                "– Từ một miền xa lắm, có tên là Udơbêkixtan.\n" +
                "\n" +
                "– Ồ, cậu ở xa thật đấy – Hoa Tuyết thỏ thẻ, làm như nó đã quá biết Udơbêkixtan ở đâu và xa xôi như thế nào – Theo phong tục của vườn nhà tớ, cậu cần phải kể cho tớ nghe về chuyện của đời cậu.\n" +
                "\n" +
                "– Chuyện đời mình thì ngán ngẩm lắm – Hoa Tuy Líp thở dài. Chúng tôi đã truyền đời truyền kiếp kể cho nhau nghe để không một ai trong chúng tôi quên rằng, cô bé Tuy Líp đã phải gánh chịu những bông hoa của chúng tôi phải cháy lên ngọn lửa vĩnh cửu để tưởng nhớ ai… Một ngàn năm trước đây tại một thung lũng trong núi\n" +
                "\n" +
                "Derapsan có một người sống bằng nghề chăn cừu tên là Xabiđan. Ông sống rất cực khổ vì đàn cừu ông chăn dắt không phải là sở hữu của ông mà là của điền chủ Hamít. Xabiđan chỉ có đôi cánh tay lực lưỡng, một cây sáo tự khoét lấy và bảy cô con gái mắt đen huyền. Cô út có tên gọi hơi khác thường: Tuy Líp. Xabiđan rất yêu quí các con gái của mình, xong cũng đã nhiều lần ông than thở :\n" +
                "\n" +
                "– Ôi, giá ta có đứa con trai….\n" +
                "\n" +
                "– Vì sao ông ta lại thích con trai hơn? – Cây hoa Tuyết hỏi.\n" +
                "\n" +
                "– Vì đối với một người cha, con trai giống như đôi cánh. Còn con gái… con gái rồi sẽ đi lấy chồng, sẽ bỏ cha và để lại cho trái tim ông nỗi đơn độc và buồn rầu.\n" +
                "\n" +
                "Một hôm, cô út và là cô gái đẹp nhất của người chăn cừu – nàng Tuy Líp mười tuổi, mang bữa ăn trưa đến cho cha. Để cho người cha đang mệt mỏi được khuây khỏa, nàng bèn cất tiếng hát những bài hát nàng tự nghĩ ra và nhảy những điệu múa trông thật uyển chuyển và đẹp mắt. Đôi gò má nàng cứ hồng hào thêm lên, và cặp mắt đen láy thì sáng rực như hai vì sao, không một công chúa nào có thể sánh được.\n" +
                "\n" +
                "Đúng giờ khắc ấy, số phận cay nghiệt đã phái điền chủ Hamít cưỡi một con ngựa hùng dũng đến trước đàn cừu. Vừa trông thấy nàng Tuy Líp nhảy múa, gã bèn dừng ngựa lại, nấp sau mấy bụi cây nhỏ theo dõi từng động tác nhảy tuyệt diệu của cô gái kiều diễm.\n" +
                "\n" +
                "Nhảy xong Tuy Líp nói với cha:\n" +
                "\n" +
                "– Cha ơi, con muốn được múa hát cả đời để cho mọi người được vui sướng.\n" +
                "\n" +
                "– Ôi, con yêu quí của ta – người cha lắc đầu – Con là một cô gái nghèo hèn, kiếm đâu ra những xiêm áo lụa là và những bộ y phục múa trong suốt?\n" +
                "\n" +
                "Hamít rình chờ cho đến khi cô gái mang bát đĩa về nhà thì xông ra túm lấy cô đưa cô về dinh cơ nhà mình. Gã đẩy Tuy Líp vào một căn phòng kín, ở đó đã có hàng trăm cô gái đẹp đang dệt thảm. Suốt từ lúc mặt trời mọc cho đến tận hoàng hôn, Tuy Líp dầm mình trong đám bụi nhuế nhóa với công việc dệt thảm tẻ ngắt và mệt mỏi. Một mùa Hè tối tăm và tuyệt vọng đã qua. Rồi mùa Thu và mùa Đông cũng chấm hết. Nhưng khi mùa Xuân vừa đến thì nỗi buồn nhớ núi non, nhớ những con suối chảy rì rào và tiếng chim ca bỗng dày vò Tuy Líp khôn nguôi, khiến nàng phải đi đến quyết định : Hoặc là chết hoặc là trở về với tự do.\n" +
                "\n" +
                "Một bữa nọ, cô gái lại bên cửa sổ phóng tầm mắt qua lỗ khe nhỏ nhìn xuống phía dưới. Nàng phát hiện ra ở ngay dưới chân cửa sổ có vô số những mảnh chai, kính vỡ – đó chính là cái bẫy, nếu tù nhân nữ nào liều mạng phá cửa sổ bỏ trốn thì sẽ bị cứa đứt chân.\n" +
                "\n" +
                "Đúng lúc đó có một con chim bay đến đậu ngay bên bệ cửa sổ – đấy chính là con bồ câu trắng của người chị cả tên là Phairidôđa.\n" +
                "\n" +
                "Làm thế nào để báo tin về nhà đây? Tuy Líp không biết viết, thậm chí ở nhà cũng chẳng ai biết đọc. Cô vội vã cắt ngay một mớ tóc đen của mình, dứt một vài sợi quí vẫn thường dùng để dệt thảm rồi chuyển qua khe hở cho chú bồ cầu tin cẩn. Chim tạm biệt nàng, bay đi.\n" +
                "\n" +
                "Khi nhận được tin em út, Phairidôđa nghĩ nát óc tìm cách cứu em gái. Cuối cùng nàng đến gặp bà lão Turơxun. Bà lão sống đơn độc trong túp lều rách nát, ngày ngày kiếm cây cỏ làm thuốc chữa bệnh. Tương truyền Turơxun có thuốc phục sinh.\n" +
                "\n" +
                "Turơxun nghe hết chuyện Phairidôđa kể, bà liếc nhìn mặt trăng rồi lầm bầm khấn:\n" +
                "\n" +
                "– Tự do không phải thứ quà tặng mà phải đánh đổi nó bằng máu.\n" +
                "\n" +
                "– Bằng máu của Tuy Líp ? – Phairidôđa sợ hãi kêu lên.\n" +
                "\n" +
                "– Phải, bằng máu của Tuy Líp, bằng máu của tất cả bảy chị em nhà ngươi. Mà không chỉ có thế, còn bằng chính cả máu của tất cả những người bạn quí, của những đứa bé nghèo nàn của các ngươi nữa. Hãy nghe ta nói đây.\n" +
                "Sau hai đêm nữa, đến đêm thứ ba, khi mặt trăng bắt đầu mọc lúc nửa đêm, Hamít sẽ tổ chức tại dinh cơ nhà lão một bữa đại tiệc. Như thường lệ, bọn lính gác bao giờ cũng là những kẻ bị chuốc rượu say trước nhất, mặc dù sáng hôm sau họ phải trả giá bằng một cái đầu. Ngay đêm ấy, trước lúc trăng lên, chị em các ngươi và các bạn gái của Tuy Líp phải lọt được vào dinh cơ, còn chim bồ câu sẽ chỉ cho các ngươi cửa sổ phòng giam các cô gái. Hãy đi chân đất đến gần cửa sổ mà mở ra. Ta nói là phải đi chân đất. Bàn chân các ngươi sẽ bị thương vì mảnh kính. Bây giờ ta sẽ nói tại sao. Hamít nhanh chóng phát hiện ra bầy nô lệ của gã chạy trốn và gã sẽ đuổi theo. Căn cứ vào một vài vết máu, gã có thể biết một cách rõ ràng bầy nô lệ trốn đi đâu, nhưng nếu dấu vết đó lại quá nhiều thì gã sẽ lúng túng, trong khi đó có người lại đang leo lên một sườn dốc đứng mà ngựa của gã không leo được.\n" +
                "Phairidôđa làm tất cả những việc mà Turơxun chỉ vẽ. Những tên lính canh bị chuốc rượu say mềm không còn nhận ra các cô gái đang lén lút bỏ trốn. Sau khi bị mảnh kính cứa nát bàn chân, các cô mở cửa sổ ra và khẽ gọi Tuy Líp. Tuy Líp nhảy ào qua cửa sổ, mặc dù hai bàn chân bị thương đau nhói nàng vẫn không dám kêu ca. Các bạn gái của nàng cũng chịu những đau đớn như thế.\n" +
                "Các cô gái chạy toán loạn theo sườn núi. Dù hai bàn chân bị thương, phải chạy một cách khó khăn, các cô vẫn không dám rên rỉ, vì nếu để lộ, các cô sẽ mất tự do, một món quà mà các cô phải đổi bằng một giá quá đắt. Các cô cứ men theo sườn núi đá còn phủ tuyết mà chạy cho đến khi nghe rõ những tiếng vó ngựa dồn dập.\n" +
                "\n" +
                "– Hamít đang đuổi theo chúng ta đấy! – Tuy Líp hét lên, giục mọi người – hãy chạy nhanh lên!\n" +
                "\n" +
                "Các cô gái chạy trốn dường như có gió giúp sức cho họ. Tuy vậy Tuy Líp đã bắt đầu đuối sức, nàng bị rớt lại sau. Ngựa của Hamít đã ập đến sau lưng nàng. Chẳng lẽ nàng lại trở thành tù nhân của gã điền chủ không đội trời chung này, và lại không được trông thấy mặt trời cùng núi rừng nữa hay sao? “Không, thà chết trong tự do còn hơn là sống đời nô lệ!” Và, thế là Tuy Líp gieo mình xuống dưới vó ngựa. Cả bốn vó ngựa xéo lên người nàng, nhưng chính con vật đã bị khuất và bị gẫy một chân. Hamít bị thương lết về nhà lúc trời còn chưa sáng, hối hả giục lũ gia nhân đuổi bắt những kẻ trốn chạy.\n" +
                "\n" +
                "Tuy Líp người đẫm máu cố gượng đứng lên, nhưng mới đi được vài bước, nàng đã khựng lại và ngã sấp xuống tuyết.\n" +
                "\n" +
                "Sáng hôm sau, Hamít cùng lũ lâu la mò lên đỉnh núi cao tuyết phủ. Trước mắt chúng hiện ra một cảnh tượng kì lạ: trên bãi tuyết trắng lạnh có cơ mang những bông hoa đỏ đã bừng nở.\n" +
                "\n" +
                "– Chuyện đời tôi như vậy đấy, do đó tại sao tôi lại có tên là Tuy Líp. Tuy Líp nói xong liền im lặng. Cây hoa Tuyết cũng lặng thinh.\n" +
                "\n" +
                "Tôi cảm thấy sống lưng ớn lạnh. Tôi đứng dậy lấy khăn chùm kín cổ, bước ra vườn.\n" +
                "\n" +
                "Lạ chưa kìa, những bông tuyết mảnh mai kia đã kịp rơi xuống và trải khắp khu vườn một lớp trắng mỏng tự khi nào vậy? Còn một chậu hoa, gần bức tường nhà có một bông Tuy Líp đỏ rực đã nở hết cỡ. Tôi cúi xuống và phát hiện ra một giọt nước mắt khá to, trong suốt, dính chặt vào chiếc cánh dưới của bông hoa Tuyết."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/09/c%E1%BA%ADu-b%C3%A9-v%C3%A0-c%C3%A2y-t%C3%A1o-640x440.jpg", "Cậu bé và cây táo", "Ngày xửa ngày xưa, có một cậu bé hàng ngày cậu rất thích đến chơi với một cây táo rất to. Cậu leo lên cây để hái trái ăn, ngủ những giấc trưa ngon lành dưới bóng râm của cây. Cậu rất yêu quý cây táo và ngược lại cây táo cũng rất quý mến cậu.\n" +
                "\n" +
                "Thời gian cứ thế trôi đi rất nhanh, cậu bé giờ đã lớn và cậu không còn lui tới chơi với cây táo nữa. Rồi một ngày nọ, cậu đi tới chỗ cây táo với một nét mặt buồn rầu. Cây táo reo lên gọi cậu:\n" +
                "\n" +
                "– Hãy tới chơi với ta.\n" +
                "\n" +
                "Cậu bé đáp:\n" +
                "\n" +
                "– Cháu giờ đã lớn rồi, không còn là đứa trẻ năm xưa nữa, cháu chẳng thích chơi dưới gốc cây nữa. Cháu giờ chỉ thích chơi đồ chơi và hiện giờ cháu đang cần tiền để mua chúng.\n" +
                "\n" +
                "Cây táo nói với cậu bé:\n" +
                "\n" +
                "– Rất tiếc ta chỉ có những trái táo ngọt, ta không có tiền. Nhưng cậu có thể hái những trái táo chín mọng của ta đem đi bán đổi lấy tiền mua đồ chơi.\n" +
                "\n" +
                "Cậu bé mừng rỡ, cậu trèo lên cây hái toàn bộ số táo trên cây và sung sướng đem đi bán. Cây táo rất buồn bã vì kể từ hôm đó không thấy cậu bé quay trở lại.\n" +
                "\n" +
                "Một hôm, cậu bé – giờ đã lớn thành một chàng trai, cậu trở lại và cây táo thấy rất vui mừng khi nhìn thấy cậu. Cây nói:\n" +
                "\n" +
                "– Hãy tới chơi với ta\n" +
                "\n" +
                "Cậu đáp:\n" +
                "\n" +
                "– Cháu giờ không có thời gian đâu để vui chơi. Cháu còn phải làm việc để kiếm tiền nuôi sống gia đình cháu. Gia đình cháu hiện giờ đang rất cần một ngôi nhà nhỏ để trú ngụ. Bác có gì để giúp đỡ cháu không?\n" +
                "\n" +
                "Câu táo nói với cậu:\n" +
                "\n" +
                "– Ta xin lỗi cháu, ta thì không có tiền mà cũng chẳng có nhà. Nhưng cháu có thể chặt cành của ta để dựng nhà.\n" +
                "\n" +
                "Thế là chàng trai cầm rìu tới chặt hết cành trên cây táo. Cậu vui vẻ trở gỗ về dựng nhà và cũng kể từ hôm đó cây táo lại không thấy cậu quay trở lại nữa, cây táo rất buồn.\n" +
                "\n" +
                "Một ngày hè oi bức và nóng nực, chàng trai – giờ đây đã cao tuổi – quay lại chỗ cây táo. Cây táo thấy chàng trai mừng rỡ gọi:\n" +
                "\n" +
                "– Hãy tới chơi với ta\n" +
                "\n" +
                "Chàng trai ủ rũ nói với cây táo:\n" +
                "\n" +
                "– Cháu cảm thấy rất buồn vì càng ngày cháu càng già đi. Cháu muốn được chèo thuyền để thư giãn một mình. Bác có thể giúp gì được cho cháu?\n" +
                "\n" +
                "Cây táo đáp:\n" +
                "\n" +
                "– Ta thì không có thuyền, nhưng cậu có thể dùng thân cây của ta đóng lấy một chiếc thuyền để một mình chèo thuyền ra xa. Được thư giãn nghỉ ngơi trên thuyền một mình giữa sông nước chắc cậu sẽ thấy nhẹ nhõm và thanh thản hơn.\n" +
                "\n" +
                "Chàng trai chặt cây táo để làm thành một chiếc thuyền. Cậu chèo thuyền lênh đênh giữa sông để nghỉ ngơi thư thái.\n" +
                "\n" +
                "Nhiều năm sau, cậu quay lại chỗ cây táo. Thấy cậu tới cây táo nói:\n" +
                "\n" +
                "– Xin lỗi con trai của ta, giờ đây ta không còn gì để giúp con nữa rồi. Ta giờ chỉ là một cái gốc, không có thân cũng chẳng có táo. Ta thật sự không giúp được gì cho cậu nữa, cái còn lại duy nhất của ta là bộ rễ đang chết dần chết mòn – Cây táo nói với cậu, những giọt nước mắt rưng rưng chảy xuống.\n" +
                "\n" +
                "Cậu bé đáp:\n" +
                "\n" +
                "– Giờ đây cháu cũng đã già, cháu không còn đủ sức để leo trèo nữa, cũng không còn răng để mà ăn táo. Cháu chỉ cần một chỗ để ngồi nghỉ, vì cháu đã quá mệt mỏi với những năm tháng vất vả đã qua.\n" +
                "\n" +
                "Cây táo nói với cậu:\n" +
                "\n" +
                "– Ôi, vậy cái gốc cây già cỗi này của ta là một nơi rất tốt cho cậu dựa vào và nghỉ ngơi. Hãy tới đây với ta.\n" +
                "\n" +
                "Chàng trai ngồi xuống gốc gây già cỗi, cây táo mừng rơi nước mắt.\n" +
                "\n" +
                "Đây chính là cậu chuyện của tất cả chúng ta. Hình ảnh cây táo trong truyện chính là hình ảnh của cha mẹ. Khi chúng ta còn nhỏ, ta được cha mẹ yêu thương che trở. Khi chúng ta lớn lên, ta bỏ cha mẹ mà đi và chỉ quay trở về khi cần sự giúp đỡ của cha mẹ. Nhưng lúc nào cũng vậy, vòng tay của cha mẹ luôn sẵn sàng ôm chúng ta vào lòng nâng đỡ hy sinh tất cả để cho ta được hạnh phúc nhất."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/335550.jpg", "Nàng công chúa ngủ trong rừng", "Ngày xưa có một ông vua và một bà hoàng hậu ngày nào cũng nói: “Ước gì mình có đứa con!” mà mãi vẫn không có. Một hôm hoàng hậu đang tắm thì có con ếch ở dưới nước nhảy lên nói:\n" +
                "\n" +
                "– Điều bà mong ước bấy lâu sẽ thành sự thực. Hết năm nay bà sẽ sinh con gái.\n" +
                "\n" +
                "Lời ếch tiên tri quả đúng thật. Hoàng hậu sinh con gái đẹp tuyệt trần.Vua thích lắm, mở hội lớn ăn mừng. Vua mời họ hàng thân thuộc, bạn bè, lại mời cả các bà mụ đến để họ tận tâm chăm sóc, thương yêu con mình.\n" +
                "\n" +
                "Trong nước có mười ba bà mụ. Nhưng vua chỉ có mười hai cái đĩa vàng để mời ăn, do đó mời thiếu một bà. Hội hè linh đình. Lúc tiệc sắp tàn, các bà mụ niệm chú mừng đứa bé những điều kỳ lạ: bà đầu chúc đức hạnh, bà thứ hai chúc sắc đẹp, bà thứ ba của cải… cứ như vậy chúc tất cả các điều có thể mơ ước được ở trần gian. Mười một bà vừa dứt lời chúc tụng thì bỗng bà mụ thứ mười ba bước vào. Bà muốn trả thù vì không được mời dự tiệc. Bà xăm xăm bước thẳng vào chẳng thèm nhìn ai, chào ai. Bà hét lên:\n" +
                "\n" +
                "– Công chúa đến năm mười lăm tuổi sẽ bị mũi quay sợi đâm phải mà chết.\n" +
                "\n" +
                "Rồi bà chẳng nói thêm nửa lời, bỏ đi. Mọi người chưa hết kinh ngạc thì bà thứ mười hai bước lên. Bà tuy chưa niệm chú chúc tụng nhưng cũng không giải được lời chú độc, mà chỉ làm nhẹ đi được thôi. Bà nói:\n" +
                "\n" +
                "– Công chúa sẽ không chết, chỉ ngủ một giấc dài trăm năm thôi.\n" +
                "\n" +
                "Vua muốn tránh cho con khỏi bị nạn ra lệnh cấm kéo sợi trong cả nước. Tất cả những lời chúc của các bà mụ đều thành sự thực: công chúa đẹp, đức hạnh, nhã nhặn, thông minh, ai thấy cũng phải yêu.\n" +
                "\n" +
                "Năm ấy, công chúa vừa đúng mười lăm tuổi. Một hôm, vua và hoàng hậu đi vắng, nàng ở nhà một mình. Nàng đi khắp cung điện để xem tất cả các buồng, thích đâu tạt vào đó. Sau cùng nàng tới một lầu cao. Nàng trèo lên chiếc thang xoáy ốc chật hẹp, tới một cửa nhỏ. Ổ khóa có cắm một chiếc chìa đã gỉ, nàng cầm chìa quay thì cửa mở tung ra. Trong buồng có một bà già ngồi trên tấm ghế nhỏ đang chăm chú kéo sợi. Nàng nói:\n" +
                "\n" +
                "– Chào bà. Bà làm gì đấy?\n" +
                "\n" +
                "Bà lão gật gù đáp:\n" +
                "\n" +
                "– Bà kéo sợi đay.\n" +
                "\n" +
                "– Cái gì nhảy nhanh như cắt thế kia hở bà?\n" +
                "\n" +
                "Nàng cầm lấy xa định kéo sợi. Vừa sờ đến thì lời chú thực hiện, nàng bị mũi quay đâm vào tay.\n" +
                "Nàng ngã ngay xuống giường và ngủ mê mệt. Tất cả cung điện đều ngủ. Vua và hoàng hậu vừa về, mới bước chân vào buồng đã nhắm mắt ngủ. Cả triều đình cũng lăn ra ngủ. Ngựa trong chuồng, chó ngoài sân, bồ câu trên mái nhà, ruồi trên tường, đều ngủ. Cả ngọn lửa đang chập chờn trên bếp cũng ngủ yên. Thịt quay cũng ngừng xèo xèo. Bác đầu bếp thấy chú phụ bếp đãng trí đang kéo tóc chú cũng buông ra ngủ. Gió lặng yên trên cây trước lâu đài, không một chiếc lá nào rung. Bụi gai mọc quanh mỗi ngày một rậm, phủ kín cả lâu đài, trong miền ấy, nhân dân truyền tụng là có Đóa Hồng xinh đẹp đương ngủ triền miên. Người ta gọi công chúa là Đóa Hồng. Thỉnh thoảng các Hoàng tử nghe kể chuyện định chui qua bụi vào lâu đài nhưng không nổi vì bụi gai như có tay, nắm chặt họ lại khiến họ bị mắc nghẽn.\n" +
                "\n" +
                "Năm tháng trôi qua đã nhiều. Một hôm lại có một Hoàng tử tới nước này. Chàng nghe một ông lão kể lại là trong tòa lâu đài sau bụi gai có nàng công chúa tên là Đóa Hồng ngủ triền miên đã được trăm năm. Vua, hoàng hậu và cả triều đình cũng đều ngủ cả. Ông lão còn bảo là theo lời tổ phụ để lại thì đã có nhiều Hoàng tử tìm cách chui qua bụi rậm nhưng bị mắc lại ở đấy. Chàng liền bảo:\n" +
                "\n" +
                "– Tôi không sợ, tôi muốn chui vào tìm nàng Đóa Hồng xinh đẹp.\n" +
                "\n" +
                "Ông lão hết sức can ngăn, chàng nhất định không nghe. Thời hạn trăm năm đã qua. Đã đến lúc Đóa Hồng tỉnh giấc. Hoàng tử đến gần bụi gai thì chỉ thấy toàn những đóa hoa to tươi\n" +
                "đẹp tự động giãn lối để chàng khỏi bị thương. Chàng đi rồi thì bụi cây khép lại. Ở sân lâu đài, chàng thấy ngựa và những con chó lốm đốm đang nằm ngủ. Chim bồ câu rũ đầu vào cánh đậu trên mái nhà. Chàng vào cung thì thấy ruồi bậu trên tường ngủ, bác đầu bếp còn giơ tay như định tóm lấy chú phụ bếp. Còn cô hầu gái thì đương ngồi làm lông con gà đen. Chàng đi vào cung điện chính thì thấy cả triều đình đều ngủ. Chàng lại tiếp tục đi. Im lặng như tờ. Có thể nghe thấy hơi thở của chàng. Sau chàng tới một tòa lầu, mở cửa vào một phòng nhỏ là nơi Đóa Hồng đang ngủ. Nàng nằm trông đẹp lộng lẫy. Chàng không rời mắt ra được, quì xuống hôn.\n" +
                "\n" +
                "Chàng vừa đụng môi thì Đóa Hồng mở mắt, nhìn chàng trìu mến. Hai người dắt nhau xuống lầu. Vua, rồi hoàng hậu và cả triều đình đều tỉnh dậy, giương mắt nhìn nhau. Ngựa ngoài sân đứng lên quẫy mình; chó săn nhảy lên ngoe nguẩy đuôi; bồ câu trên mái nhà vươn cổ ngóc đầu nhìn quanh rồi bay qua cánh đồng; ruồi bậu trên tường lại tiếp tục bò; lửa trong bếp bùng lên, chập chờn và đun thức ăn, thịt quay lại xèo xèo, bác đầu bếp tát chú phụ bếp một cái bạt tai làm hắn kêu lên, các cô hầu làm nốt lông gà.\n" +
                "\n" +
                "Lễ cưới của Hoàng tử và nàng Đóa Hồng được tổ chức linh đình. Hai vợ chồng sống suốt đời sung sướng. Nàng công chúa được Hoàng Tử đánh thức sau giấc ngủ một trăm năm. Lời nguyền độc ác của bà mụ thứ mười ba bị hóa giải, nàng xứng đáng được hưởng hạnh phúc."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/02/hoa-tuyet1.jpg", "Sự tích Hoa Tuyết", "Khi bà Chúa Tuyết sinh hạ được một cô con gái, bà phải suy nghĩ rất lâu rồi mới quyết định đặt tên con gái là Xnhedinca.\n" +
                "Xnhedinca trắng trẻo, mái tóc cùng trắng, nằm trên chiếc giường trắng, phía dưới là những tấm vải đệm bằng mây trắng. Khi Xnhedinca vừa đến tuổi trưởng thành đã có mấy chàng trai đến cầu hôn. Người đến trước nhất là Mặt Trăng, nhưng Xnhedinca không ưng vì chẳng có cái trán hói, đêm đêm không chịu ngủ mà cứ lang thang trên bầu trời, còn ban ngày thì lại giấu mặt sau những đám mây. Người thứ hai đến xin cầu hôn là Tia Nắng, nhưng chàng cũng bị Xnhedinca từ chối.\n" +
                "Chúa Ông giận lắm. Một hôm ông nghiêm khắc nói với con gái:\n" +
                "– Nếu con không tự kiếm được chồng thì cha mẹ đặt đâu, con phải ngồi đấy.\n" +
                "Chúa Ông nhắn tin cho Gió, kẻ thống lĩnh cả bầu trời xanh có đến bốn người con trai chưa đứa nào thành gia thất. Gió bè đáp chiếc xe trang hoàng lộng lẫy do những con tuấn mã phi cực nhanh tới ra mắt Chúa Ông. Xnhedinca được gả bán cho đứa con trai cả của Gió – đó là chàng Gió Bắc. Chúa bà lấy làm hạnh phúc chuẩn bị của hồi môn cho con gái, nào là chăn lông chim, gối bông tuyết mềm, những tấm vải trải giường bằng mây trắng, rồi hàng chuỗi hạt cườm vòng cổ bằng tuyết lấp lánh.\n" +
                "Khi khách mời đến đông đủ, Xnhedinca hiện ra như một nàng công chúa. Bà con họ hàng rất hài lòng được đến dự ngày vui, ai cũng khen hai bạn trẻ thật xứng đôi, phải lứa. Chỉ riêng Xnhedinca là không hài lòng chút nào. Chả là đương lúc yến tiệc, chàng Gió Bắc bỗng hét toáng lên: “Nóng quá! Nóng quá!” khi chàng khẽ chạm vào cặp môi lạnh toát của mình vào cặp môi của nàng.\n" +
                "– Con không thể yêu chàng được – Xnhedinca thở dài nói. Nàng nói nhỏ đến mức ngoài mẹ nàng ra chẳng ai có thể nghe được tiếng nàng.\n" +
                "“Không lẽ con gái yêu cảu ta lại là đứa bất hạnh”. Trái tim người mẹ bỗng run lên trước một sự tiên đoán đáng sợ.\n" +
                "Đúng lúc yến tiệc đang rôm rả thì chàng rể lên tiếng bảo em trai Gió Nam chơi một bản nhạc nhảy. Gió Nam đang ngồi ở mép một đám mây bèn rút trong vạt áo ra một ống sáo và bắt đầu thổi. Giai điệu nhẹ nhàng lan toả, cnốn hút Xnhedinca vào cuộc nhảy. Nàng lả lướt, quay người, đập đập gót giày vào nhau phát ra tiếng kêu lanh canh, trong lúc đó, chàng Gió Đông, người em chồng tinh nghịch cứ vỗ tay cười. Chỉ có chàng Gió Tây là mỗi lúc một thêm thất vọng, đau khổ rồi gục đầu vào vai cha thổn thức. Gió Cha kinh ngạc hỏi:\n" +
                "– Con trai của ta, ngày vui thế này, có sao con lại để rơi luỵ?\n" +
                "Chàng Gió Tây nức nở:\n" +
                "– Vì sao cha lại dạm hỏi nàng Xnhedinca cho anh lớn mà không phải là cho con? Vì sao nàng lại không thể là vợ của con?\n" +
                "Lúc này chàng Gió Nam mới ngước cặp mắt bồ câu của mình nhình Xnhedinca và chàng đã bắt gặp cái ánh nhìn lên của nàng. Tiếng sáo nghe càng du dương hơn khi nó vang lên chỉ để dành cho một mình Xnhedinca thôi, còn Xnhedinca thì nhảy cũng chỉ để cho chàng Gió Nam. Chuyện gì sẽ xảy ra nếu chàng Gió Bắc ác độc và đầy ghen tuông kia bắt được? Bà Chúa Tuyết vô cùng đau khổ.\n" +
                "– Con gái yêu ơi, hãy biết kiềm chế trái tim mình! – Bà Chúa khẽ van nài khi Xnhedinca quay tròn gần chỗ bà.\n" +
                "Nhưng một trái tim đang thổn thức vì tình yêu thì kiềm chế làm sao được? Chả lẽ Xnhedinca lại có thể làm được cái điều mà ngay cả những kẻ ngu ngốc lẫn những đấng anh minh đều chịu bó tay sao?\n" +
                "Có thể vì mải nói chuyện với Chúa Ông nên Gió Bắc không hay biết gì, nếu như Gió Tây không khích bác chàng bằng một tiếng cười ác độc:\n" +
                "– Xnhedinca của anh sắp nở hoa nhờ những cái nhìn cháy bỏng của thằng út nhà ta đấy.\n" +
                "Nghe nói vậy, Gió Bắc đấm mạnh xuống bàn, hét lên vì tức giận, mắng Gió Nam:\n" +
                "– Hãy cất ngay ống sao đi, nếu không ta sẽ đập vỡ đấy!\n" +
                "Tiếng sao chỉ còn lí nhí như tiếng chim rồi câm bặt. Xnhedinca lúng túng liếc nhìn cặp mắt bồ câu của Gió Nam như muốn dò hỏi: phải chăng đó chỉ là tình yêu thoáng chốc của chàng. Nàng nhớ lại cái giây phút Gió Bắc đứng phắt dậy và gầm lên:\n" +
                "– Xnhedinca, em đừng quên rằng em là của anh, còn mi, thằng em kia, đừng quên rằng này không hề là của mi! Và bây giờ, Xnhedinca, em hãy nhảy để anh đệm sáo!\n" +
                "Gió Bắc cho các ngón tay vào mồm và huýt the thé khiến mọi người ai nấy có cảm giác bị kiến bò sau lưng.\n" +
                "– Nhảy đi! Nhảy đi! – chàng hét Xnhedinca.\n" +
                "Còn nàng thì đang đắm đuối trước đôi tay giơ ra chào mời của chàng Gió Nam. Nàng toan quay đi song đôi chân nàng bị băng cứng lại rồi, và chúng đã cưỡng lại ý nàng.\n" +
                "– Hãy nhảy đi! Nàng hãy nhảy vì ta! – Gió bắc hét to đến nỗi làm chuyển cả những cột nhà bằng\n" +
                "tuyết, nhưng Xnhedinca vẫn không hề động lòng.\n" +
                "– A ha! – Gió Bắc cuồng lên, chàng rút cái roi ở thắt lưng ra đoạn vung lên. – Này, chú em Gió Nam của ta, giờ thì ta không còn thương tiếc mảnh vườn táo khu vườn hồng nhà mi nữa nghe. Nội đêm nay ta sẽ tàn phá hết những khu vườn đó bằng chính hơi thở của ta; sáng mai, mi sẽ được bước lên những cành khô khốc và chỉ biết rơi những giọt lệ cay đắng mà thôi.\n" +
                "Tình yêu đã mách bảo Xnhedinca cách cứu lấy mạng sống của người tình. Khi Gió Bắc chưa kịp gom không khí vào lồng ngực thì Xnhedinca đã thấy gương mặt của Gió Nam đen xạm đi; nàng lập tức tháo tung những chăn gối lông chim của mình ra, và thế là chỉ trong nháy mắt, những khu vườn của Gió Nam đã được phủ một lớp thảm như tuyết trắng. Những bông hồng và những trái táo không còn biết sợ hơi thở của gió lạnh nữa.\n" +
                "Gió Bắc thất vọng, tính chuyện trả thù Xnhedinca. Chàng dùng roi quất nàng túi bụi, song nàng đã khôn khéo tránh được. Gió Bắc bèn ném roi đi và lao về phía Xnhedinca.\n" +
                "– Thế là đám cưới đã tàn! – chàng Gió Bắc gầm lên – Ta sẽ đưa nàng về nhà và giấu nàng vào căn hầm tối tăm nhất. Hãy để cho chuột, bọ gặm nhấm thân xác nàng, hỡi người vợ bướng bỉnh của ta.\n" +
                "Đến đây, tìn yêu lại mách bảo Gió Nam cách cứu lấy trái tim, mà đối với nàng là quý giá hơn tất cả mọi thứ trên đời. Cắp nàng vào ngực, Gió Nam biết giấu Xnhedinca đi đâu bây giờ? Chàng đành phải đặt nàng dưới gốc cây hoa hồng và dặn nàng hãy chờ đợi chàng quay lại sau khi chàng chiến thắng người anh trong trận đấu cực kỳ khó khăn này.\n" +
                "– Trước hết hãy hôn em đa, hỡi người tình duy nhất của đời em, em sẽ chờ đợi chàng, cho dù suốt cả cuộc đời.\n" +
                "Gió Nam ôm hôn Xnhedinca một cách êm ái và hôn thật lâu cho đến khi người nàng tan ra trong vòng tay ôm của chàng, cho đến khi nàng chỉ còn là những giọt sương rơi xuống đất và tan biến đi.\n" +
                "– Nàng ở đâu? Nàng trốn đâu rồi? – Gió bắc lao vào người em trai – Ta vừa trông thấy mi ôm hôn nàng như thế nào kia mà.\n" +
                "– Ôi anh trai của em, hà cớ gì ta cứ thù hằn nhau mãi, – Gió Nam buồn rầu đáp – Bây giờ nàng nằm ở kia kìa, như thể giọt sương, như giọt nước mắt đã tan biến vào đất.\n" +
                "– Ta không tin nàng và cả mi nữa – Gió Bắc nói, nghiến răng trèo trẹo – Để nàng không bao giờ còn đứng dậy được, ta sẽ dùng băng giá đè nàng xuống.\n" +
                "Gió Nam lúc nào cũng cứ quẩn quanh bên khu vườn hồng và vườn táo của mình. Cứ vào quãng cuối Đông hoặc đầu Xuân, Xnhedinca lại thấy có chàng ở bên cạnh, nàng dùng hơi thở sưởi ấm lớp băng bề mặt rồi ngước lên nhìn sâu vào cặp mắt bồ câu của người tình.\n" +
                "Và người đời cứ mỗi khi nhìn thấy một bông hoa trắng nhỏ xíu không hiểu sao lại mừng rơn và kể cho nhau nghe như kể về một sự kiện gì trọng đại lắm:\n" +
                "– Thấy không, trong vườn, Hoa Tuyết đã nở!"))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/cartoon-horse-image_1200-660x440.jpg", "Sự tích cái yên ngựa", "Ngày xưa có một vị quan tên là Hồ Lưu rất hung ác. Năm 62 tuổi, ông ta chết. Diêm vương lật sổ ra thấy tội trạng còn quá nặng nên bắt buộc ông ta đầu thai làm con ngựa. Ông Hồ Lưu (tức là con ngựa), lớn kên bị tên nài bạc đãi, thúc đầu gối vào hông, cỡi không cần yên. Hồ Lưu buồn bã quá, nhịn đói không ăn cỏ, ba bốn ngày sau thì chết.\n" +
                "\n" +
                "Diêm vương nổi giận:\n" +
                "\n" +
                "– Thằng này trốn tội! Phải đền tội cho đủ mới được trở về đây. Tự vận như thế là ăn gian!\n" +
                "\n" +
                "Bèn cho Hồ Lưu hoá thai lần nữa, đầu thai thành con chó. Hồ Lưu tủi phận nhưng không dám tự vận như trước. Anh ta nghĩ ra một kế: “Mình cứ cắn ông chủ mình, ông chủ nổi quạu, sẽ đập mình chết”. Hồ Lưu thi hành như ý định. Chủ nhà ngỡ là chó điên nên đập chết. Diêm vương hay được, bèn sai quỷ sứ đánh vong hồn Hồ Lưu 50 hèo rồi phán:\n" +
                "\n" +
                "– Mày phải đầu thai trở lại. Tội mày chưa trả hết mà mày đòi trốn hoài. Lần này, phải đầu thai trở lại làm con rắn.\n" +
                "\n" +
                "Hồ Lưu liền bị nhốt trong ngục, bò tới bò lui. Sau rốt anh ta khoét hang vượt ngục. Biết rằng tự tử hay cắn người đều là trọng tội, anh ta bèn giả bộ bò ra ngoài, nằm giữa đường mà ngủ. Tình chờ một chiếc xe ngựa chạy qua, cán rắn đứt làm đôi.\n" +
                "\n" +
                "Diêm vương phán:\n" +
                "\n" +
                "– Bấy lâu nay mi cực khổ nhìêu quá rồi. Ta không nỡ hành tội nữa. Vậy thì mi đựơc phép đầu thai về dương thế để làm quan mà cai trị dân, lấy tên là Lưu Công.\n" +
                "\n" +
                "Lưu Công lớn lên, học hành rất giỏi, đậu thủ khoa. Ông thường răn các người tuỳ thuộc, muốn cưỡi ngựa thì phải mang yên, mang nệm. Ý của ông là khuyên răn các người bên dưới nên tử tế đối với dân, đừng hà lạm quyền hành thúc ép mà đau khổ dân lành."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/n%C3%A0ng-c%C3%B4ng-ch%C3%BAa-ch%C4%83n-ng%E1%BB%97ng-640x440.jpg", "Nàng công chúa chăn ngỗng", "Ngày xưa có một bà hoàng hậu tuổi đã cao. Đức vua chết đã lâu. Bà có một cô con gái rất xinh đẹp. Khi lớn lên, nàng được hứa hôn với một chàng Hoàng tử con vua một nước xa xôi.\n" +
                "\n" +
                "Đến ngày tổ chức lễ cưới, nàng công chúa sửa soạn đi đến nước xa lạ. Mẹ nàng gói ghém cho nàng những vật quí giá: đồ trang sức, vàng, bạc, cốc, châu ngọc, tóm lại là tất cả những gì xứng đáng làm của hồi môn cho một công chúa, vì mẹ nàng rất mực thương nàng. Mẹ nàng gửi gắm nàng cho một thị nữ có nhiệm vụ dẫn nàng đi đến chỗ ở người chồng chưa cưới. Mỗi người cưỡi một con ngựa. Ngựa công chúa cưỡi tên là Phalađa, biết nói.\n" +
                "\n" +
                "Đến lúc chia tay, bà hoàng vào trong phòng ngủ, lấy một con dao nhỏ trích ngón tay, để chảy ba giọt máu. Bà cho máu thấm xuống một cái khăn trắng nhỏ, đưa cho cô gái và dặn: “Con thân yêu, con hãy giữ gìn cẩn thận cái khăn này, nó sẽ có ích cho con trên đường đi”.\n" +
                "\n" +
                "Hai mẹ con buồn bã từ biệt nhau. Công chúa áp cái khăn lên ngực, nhảy lên yên ngựa để đi đến nơi ở của người yêu. Sau khi đã đi một tiếng, cô cảm thấy khát khô họng, bèn bảo thị nữ:\n" +
                "\n" +
                "– “Em hãy xuống ngựa, lấy cốc của ta múc nước suối kia và mang lại đây cho ta, ta khát nước lắm”.\n" +
                "\n" +
                "– “Nếu cô khát, thị nữ trả lời, thì hãy tự nhảy xuống, rồi vươn người ra trên mặt nước mà uống. Tôi không phải là đầy tớ của cô”.\n" +
                "\n" +
                "Công chúa khát lắm, bèn xuống ngựa, cúi xuống dòng nước suối để uống nước. Nàng không dám uống nước bằng cốc vàng. “Trời ơi!” nàng kêu to. Ba giọt máu bảo cô: “Nếu mẹ cô biết sự tình thế này, thì hẳn tim bà sẽ tan nát trong ngực”.\n" +
                "\n" +
                "Nhưng công chúa là người can đảm. Nàng không nói gì và lại nhảy lên ngựa. Ngựa phi được vài dặm. Trời thì nóng nực, chẳng mấy chốc nàng lại khát nước.\n" +
                "\n" +
                "Tới một con sông, nàng bảo thị nữ: “Em hãy xuống ngựa và cho ta uống nước bằng cái cốc vàng”. Cô đã quên đứt những lời độc ác của thị nữ. Nhưng thị nữ lại trả lời ngạo mạn hơn: “Nếu cô khát thì tự đi uống nước một mình, tôi không phải là đầy tớ của cô”.\n" +
                "\n" +
                "Công chúa khát quá, nhảy xuống ngựa, cúi xuống dòng nước chảy xiết, khóc và kêu lên: “Trời ơi!” Ba giọt máu liền đáp lại: “Nếu mẹ cô biết sự tình thế này, thì hẳn tim bà tan nát trong ngực”. Trong khi cô cúi xuống để uống thì cái khăn có thấm ba giọt máu, tuột khỏi ngực cô và trôi theo dòng nước mà cô không hay biết, vì lúc đó cô rất sợ hãi.\n" +
                "\n" +
                "Thị nữ thì lại trông thấy hết và nó rất vui mừng từ giờ trở đi công chúa sẽ bị nó trả thù. Từ lúc đánh mất ba giọt máu, công chúa trở nên yếu đuối, không đủ sức tự vệ nữa. Khi nàng định trèo lên con ngựa Phalađa thì thị nữ bảo: “Tôi sẽ cưỡi con Phalađa, còn cô, cô hãy cưỡi con ngựa tồi của tôi”.\n" +
                "\n" +
                "Công chúa đành làm như vậy. Tiếp đó thị nữ ra lệnh, lời lẽ gay gắt, bắt nàng phải cởi quần áo hoàng cung ra và mặc quần áo của nó vào. Cô lại phải thề với trời đất là khi đến cung điện sẽ không nói lộ ra. Nếu cô không chịu thề thì nó sẽ giết cô tại chỗ. Nhưng con Phalađa đã quan sát tất cả và ghi nhớ tất cả. Thị nữ cưỡi con Phalađa, còn công chúa thì cưỡi con ngựa tồi. Nó lại tiếp tục đi, cuối cùng đến lâu đài nhà vua. Ở đấy, mọi người rất vui mừng khi họ tới, và Hoàng tử vội chạy tới tận nơi đón họ, đỡ thị nữ xuống ngựa, vì tưởng rằng đó là vợ chưa cưới của mình. Thị nữ đi lên bậc thềm lâu đài, còn nàng công chúa thì phải đứng lại ngoài sân.\n" +
                "\n" +
                "Vua cha nhìn ra, qua cửa sổ thấy nàng duyên dáng và tuyệt đẹp. Người vào trong cung hỏi cô gái được coi là vợ chưa cưới của Hoàng tử xem cô gái đứng ngoài sân là ai. “Tâu vua cha, con đã gặp cô gái đó trên đường đi và con đưa cô ta đi cùng để đỡ lẻ loi một mình. Xin vua cha cho cô ta làm việc để cô ta khỏi phải vô công rồi nghề”. Nhưng vua cha không có việc gì giao cho cô làm cả.\n" +
                "\n" +
                "Người bảo: “Ở ngoài kia, ta có một anh chàng chăn ngỗng, hãy để cô ta giúp việc vậy”. Chàng trai tên là Cuốc. Vợ chưa cưới của Hoàng tử phải giúp anh chăn ngỗng.\n" +
                "\n" +
                "Ít lâu sau, vợ chưa cưới giả tâu với hoàng tử: “Chàng thân yêu ơi, em muốn một điều, chàng hãy làm vui lòng em”. Hoàng tử nói: “Được thôi!” “Chàng hãy cho gọi người thợ lột da đến đập chết con ngựa em đang cưỡi đến đây, vì trong khi đi đường nó làm em bực tức”.\n" +
                "\n" +
                "Thật ra thì nó sợ con ngựa kể lại cách nó đã đối xử với công chúa. Đến lúc con ngựa trung thành Phalađa phải chết thì công chúa được tin. Nàng hứa với người thợ lột da là sẽ bí mật biếu anh một đồng tiền bằng bạc nếu anh giúp nàng một việc nhỏ. Trong đô thị có một cái cổng to rất tối, hàng ngày, sớm tối nàng phải dẫn đàn ngỗng đi qua. Nàng xin người thợ lột da hãy đóng đanh treo đầu con Phalađa vào cái cổng ấy để nàng có thể luôn luôn trông thấy nó.\n" +
                "\n" +
                "Người thợ lột da hứa sẽ làm và bác đóng chặt đanh treo đầu ngựa vào dưới cái cổng tối om. Sáng sớm, khi cùng Cuốc đi qua cổng, cô bảo cái đầu: “Ôi, Phalađa, mày bị treo ở đây ư!” Cái đầu trả lời: “Ôi! Nàng công chúa của tôi, nàng qua đây ư! Nếu mẹ nàng biết nông nỗi này tim mẹ sẽ vỡ tan tành”. Lặng lẽ, cô đi khỏi đô thị, dẫn đàn ngỗng ra cánh đồng.\n" +
                "\n" +
                "Đến đồng cỏ, cô ngồi xuống và rũ tóc ra. Tóc cô óng ánh như vàng nguyên chất và Cuốc rất thích nhìn mớ tóc ấy lóe sáng. Anh muốn nhổ vài sợi tóc. Công chúa bèn nói: “Ta khóc đây, ta khóc đây! Hỡi làn gió nhẹ. Hãy cuốn cái mũ của Cuốc đi! Anh ta sẽ chạy theo cái mũ cho đến khi nào tóc ta chải và tết xong”. Tức thì gió thổi mạnh cuốn đi cái mũ của Cuốc. Anh ta chạy theo ngay. Khi anh trở về thì công chúa đã chải đầu xong và anh không nhổ được sợi tóc nào. Anh rất bực và không nói năng gì với cô nữa.\n" +
                "\n" +
                "Họ lại tiếp tục chăn ngỗng đến chiều, rồi cùng về nhà. Sáng sớm hôm sau, khi lùa ngỗng qua cổng, cô gái nói: “Ôi, Phalađa, mày bị treo ở đây ư!”\n" +
                "\n" +
                "Cái đầu trả lời: “Ôi! Nàng công chúa của tôi, nàng qua đây ư! Nếu mẹ nàng biết nông nỗi này, tim mẹ sẽ vỡ tan tành”.\n" +
                "\n" +
                "Đi ra khỏi đô thị, cô lại ngồi trên đồng cỏ và lại rũ tóc ra chải. Cuốc muốn nắm lấy mớ tóc. Cô vội vàng nói: “Ta khóc đây, ta khóc đây! Hỡi làn gió nhẹ, hãy cuốn cái mũ của Cuốc đi! Anh ta sẽ chạy theo cái mũ cho đến khi nào tóc ta chải và tết xong”. Gió nổi lên, cuốn cái mũ đi. Cuốc phải chạy theo. Khi anh trở về thì công chúa đã chải đầu xong từ lâu và anh không nắm được mớ tóc ấy. Và rồi hai người lại cùng chăn ngỗng đến chiều.\n" +
                "\n" +
                "Nhưng chiều hôm ấy, về tới nhà, Cuốc đến gặp vua cha và tâu: “Kính thưa hoàng thượng, con không thể chăn ngỗng cùng cô gái này nữa” – “Tại sao vậy?”, vua hỏi. “Suốt ngày, cô ta làm con bực mình!” – Vua cha bảo anh kể lại sự việc đã xảy ra. Cuốc nói: “Buổi sáng, chúng con dẫn đàn ngỗng qua cái cổng tối om, ở đấy có một cái đầu ngựa treo trên tường. Cô ta nói với nó: “Ôi, Phalađa, mày bị treo ở đây ư!” Cái đầu trả lời: “Ôi! Nàng công chúa của tôi, nàng qua đây ư! Nếu mẹ nàng biết nông nỗi này tim mẹ sẽ vỡ tan tành.” Và Cuốc kể các sự việc đã xảy ra ở cánh đồng chăn ngỗng và tại sao anh ta lại phải chạy theo cái mũ. Vua cha dặn anh ta ngày hôm sau cứ đi chăn ngỗng như thường lệ.\n" +
                "\n" +
                "Sáng sớm ngài thân chinh đến dưới cái cổng tối om và nghe được những câu cô gái nói với cái đầu Phalađa. Ông theo ra cánh đồng và nấp vào một bụi cây. Chính mắt ngài trông thấy anh thanh niên và cô gái lùa ngỗng thế nào và sau một lúc, cô gái ngồi xuống gỡ mớ tóc vàng lóe sáng. Rồi cô lại nói: “Ta khóc đây, ta khóc đây! Hỡi làn gió nhẹ, hãy cuốn cái mũ của Cuốc đi! Anh ta sẽ chạy theo cái mũ cho đến khi nào tóc ta chải và tết xong”. Một cơn gió thổi mạnh, cuốn cái mũ đội đầu của Cuốc đi. Anh phải chạy theo rất xa. Cô gái chăn ngỗng chải tóc và cuốn thành từng búp. Vua cha nhìn thấy tất cả. Không ai nhận ra ngài khi ngài rời khỏi đó.\n" +
                "\n" +
                "Chiều đến, cô gái về nhà, ngài cho gọi cô đến và hỏi tại sao cô lại làm như thế. “Tâu bệ hạ, con không thể nói được”, – cô trả lời. – “Con không thể kể nỗi khổ của con với bất cứ ai trên thế gian này, con đã thề như vậy để khỏi bị người ta giết”. Vua cha cô ép cô nói, nhưng ngài không biết được gì thêm bèn nói: “Nếu con không muốn nói với ta, thì con hãy kể nỗi khổ của con với cái bếp lò này”. Rồi ông bỏ đi.\n" +
                "\n" +
                "Cô đến ngồi gần cái bếp lò, than khóc, thổ lộ tâm can: “Ta ngồi đây, bị cả thế gian ruồng bỏ, dù ta là con vua. Một tên thị nữ độc ác đã áp chế ta, bắt ta đổi cho nó quần áo hoàng cung. Nó thay thế ta để làm vợ chưa cưới của người yêu ta, và ta bắt buộc phải làm công việc bình thường của người chăn ngỗng. Nếu mẹ ta biết nông nỗi này, tim bà sẽ tan nát”.\n" +
                "\n" +
                "Vua cha đứng ở phía tường bên kia gần ống thông hơi, ngài đã nghe thấy hết. Ngài trở về và gọi cô hãy rời cái lò đến gặp ngài. Người ta mang đến cho cô quần áo hoàng cung, cô mặc vào đẹp như là có phép lạ. Vua cha cho gọi con trai đến và bảo cho con biết về cô vợ chưa cưới giả mạo. Cô người yêu thật đứng trước chàng, đấy là cô gái chăn ngỗng.\n" +
                "\n" +
                "Hoàng tử thấy cô rất đẹp và phúc hậu nên lòng tràn ngập niềm vui. Một bữa tiệc được sửa soạn để mời tất cả các bạn bè thân thuộc. Hoàng tử và công chúa ngồi ở đầu bàn, trước mặt họ là con thị nữ. Nó bị choáng ngợp và không nhận ra cô chủ trang sức lộng lẫy. Khi họ đang ăn uống vui vẻ, vua cha ra một câu đố cho thị nữ. Nó phải trả lời là một người đàn bà lừa dối chủ thì sẽ bị xử tội như thế nào. Ngài kể các sự việc đã xảy ra và hỏi nó: “Như thế sẽ xứng đáng với hình phạt gì”. – “Nó xứng đáng phải đuổi đi khỏi đất nước” – “Kẻ ấy chính là mày, mày sẽ bị xử tội như mày nói”. Sau khi hình phạt được thi hành, Hoàng tử cưới nàng công chúa làm vợ và họ trị vì đất nước trong hòa bình và hạnh phúc."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/1b5-660x440.jpg", "Cô bé quàng khăn đỏ", "Ngày xửa, ngày xưa, có một cô bé thường hay quàng chiếc khăn màu đỏ, vì vậy, mọi người gọi cô là cô bé quàng khăn đỏ. Một hôm, mẹ cô bảo cô mang bánh sang biếu bà ngoại. Trước khi đi, mẹ cô dặn:\n" +
                "\n" +
                "– Con đi thì đi đường thẳng, đừng đi đường vòng qua rừng mà chó sói ăn thịt con đấy. Trên đường đi, cô thấy đường vòng qua rừng có nhiều hoa, nhiều bướm, không nghe lời mẹ dặn, cô tung tăng đi theo đường đó. Đi được một quãng thì gặp Sóc, Sóc nhắc:\n" +
                "\n" +
                "– Cô bé quàng khăn đỏ ơi, lúc nãy tôi nghe mẹ cô dặn đi đường thẳng, đừng đi đường vòng cơ mà. Sao cô lại đi đường này?\n" +
                "\n" +
                "Cô bé không trả lời Sóc. Cô cứ đi theo đường vòng qua rừng. Vừa đi, cô vừa hái hoa, bắt bướm. Vào đến cửa rừng thì cô gặp chó sói. Con chó sói rất to đến trước mặt cô. Nó cất giọng ồm ồm hỏi:\n" +
                "\n" +
                "– Này, cô bé đi đâu thế?\n" +
                "\n" +
                "Nghe chó sói hỏi, cô bé quàng khăn đỏ sợ lắm, nhưng cũng đành bạo dạn trả lời:\n" +
                "\n" +
                "– Tôi đi sang nhà bà ngoại tôi.\n" +
                "\n" +
                "Nghe cô bé nói đi sang bà ngoại, chó sói nghĩ bụng: À, thì ra nó lại còn có bà ngoại nữa, thế thì mình phải ăn thịt cả hai bà cháu. Nghĩ vậy nên chó sói lại hỏi:\n" +
                "\n" +
                "– Nhà bà ngoại cô ở đâu?\n" +
                "\n" +
                "– Ở bên kia khu rừng. Cái nhà có ống khói đấy, cứ đẩy cửa là vào được ngay.\n" +
                "\n" +
                "Nghe xong, chó sói bỏ cô bé quàng khăn đỏ ở đấy rồi chạy một mạch đến nhà bà ngoại cô bé. Nó đẩy cửa vào vồ lấy bà cụ rồi nuốt chửng ngay vào bụng. Xong xuôi, nó lên giường nằm đắp chăn giả là bà ngoại ốm.\n" +
                "\n" +
                "Lúc cô bé quàng khăn đỏ đến, cô thấy chó sói đắp chăn nằm trên giường, cô tưởng “bà ngoại” bị ốm thật, cô hỏi:\n" +
                "\n" +
                "– Bà ơi! Bà ốm đã lâu chưa?\n" +
                "\n" +
                "Sói không đáp giả vờ rên hừ… hừ…\n" +
                "\n" +
                "– Bà ơi, mẹ cháu bảo mang bánh sang biếu bà.\n" +
                "\n" +
                "– Thế à, thế thì bà cám ơn cháu và mẹ cháu. Cháu ngoan quá. Cháu lại đây với bà.\n" +
                "\n" +
                "\n" +
                "Cô bé quàng khăn đỏ chạy ngay đến cạnh giường, nhưng cô ngạc nhiên lùi lại hỏi;\n" +
                "\n" +
                "– Bà ơi! Sao hôm nay tai bà dài thế?\n" +
                "\n" +
                "– Tai bà dài để bà nghe cháu nói được rõ hơn. Chó sói đáp\n" +
                "\n" +
                "– Thế còn mắt bà, sao hôm nay mắt bà to thế?\n" +
                "\n" +
                "– Mắt bà to để bà nhìn cháu được rõ hơn.\n" +
                "\n" +
                "Chưa tin, cô bé quàng khăn đỏ lại hỏi:\n" +
                "\n" +
                "– Thế còn mồm bà, sao hôm nay mồm bà to thế?\n" +
                "\n" +
                "– Mồm bà to để bà ăn thịt cháu đấy.\n" +
                "\n" +
                "Sói nói xong liền nhảy ra khỏi giường, nuốt chửng em bé Khăn Đỏ đáng thương.\n" +
                "\n" +
                "Sói đã no nê lại nằm xuống giường ngủ ngáy o o. May sao, lúc đó bác thợ săn đi ngang thấy thế. Bác giơ súng lên định bắn. Nhưng bác chợt nghĩ ra là chắc sói đã ăn thịt bà lão, và tuy vậy vẫn còn có cơ cứu bà. Bác nghĩ không nên bắn mà nên lấy kéo rạch bụng con sói đang ngủ ra. Vừa rạch được vài mũi thì thấy chiếc khăn quàng đỏ chóe, rạch được vài mũi nữa thì cô bé nhảy ra kêu:\n" +
                "\n" +
                "– Trời ơi! Cháu sợ quá! Trong bụng sói, tối đen như mực. Bà lão cũng còn sống chui ra, thở hổn hển. Khăn đỏ vội đi nhặt đá to nhét đầy bụng sói. Sói tỉnh giấc muốn nhảy lên, nhưng đá nặng quá, nó ngã khuỵu xuống, lăn ra chết.\n" +
                "\n" +
                "Từ dạo ấy, cô bé quàng khăn đỏ không bao giờ dám làm sai lời mẹ dặn."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/09/c%C3%A1i-gi%C3%A1-c%E1%BB%A7a-s%E1%BB%B1-th%C3%B4ng-th%C3%A1i-640x440.jpg", "Cái giá của sự thông thái", "Rất lâu rồi, có một nhà vua muốn hiểu biết thật nhiều nhưng lại lười. Một ngày nọ nhà vua triệu tập tất cả những nhà thông thái của vương quốc lại và ra lệnh cho họ phải thu thập tất cả những hiểu biết và sự thông thái trên thế gian đặt vào một chỗ để ông ta có thể học chúng.\n" +
                "\n" +
                "Theo lệnh nhà vua, các nhà thông thái đều làm việc cật lực. Sau hơn một năm, họ dâng lên ngài một trăm cuốn sách chứa đựng mọi sự hiểu biết ở đời. Nhưng khi nhìn qua các chồng sách, nhà vua ngán ngẩm nói:\n" +
                "\n" +
                "– Không! Ta cần một cách dễ dàng hơn. Biết bao giờ ta mới đọc xong và nhớ được ngần này cuốn sách.\n" +
                "\n" +
                "Rồi nhà vua lệnh cho họ phải tóm lược hàng trăm cuốn sách đó vào một cuốn mà thôi. Một năm sau, các nhà thông thái quay lại với một cuốn sách duy nhất. Cuốn sách to và dày cả ngàn trang. Nhà vua nhìn thấy liền la lên:\n" +
                "\n" +
                "– Không! Cuốn sách này dày quá! Ta sẽ mất rất nhiều thời gian mới đọc hết được.\n" +
                "\n" +
                "Một lần nữa, các nhà thông thái bị buộc phải tóm lược thật súc tích cuốn sách ấy vào chỉ một trang giấy để nhà vua dễ dàng mang theo và nhớ được.\n" +
                "\n" +
                "Mọi người xôn xao và than trời: “Sao có thể làm được như vậy?”. Nhưng họ không có sự lựa chọn nào khác cả. Họ biết hoặc là mệnh lệnh phải được thi hành, hoặc là đầu họ sẽ rơi. Nhà thông thái lớn tuổi nhất họp tất cả mọi người lại để tìm ra cách giải quyết. Cuộc hội ý diễn ra trong nhiều đêm liền. Cuối cùng, họ đã hoàn thành trang giấy chứa đựng mọi sự hiểu biết trên đời.\n" +
                "\n" +
                "Được tin, nhà vua rất đỗi vui mừng. “Cuối cùng thì ta cũng sắp biết được tất cả mọi sự khôn ngoan nhất trên đời mà chỉ cần một trang giấy mà thôi!” – Nhà vua đắc chí nhủ thầm và ra lệnh dâng trang giấy lên trong thời gian sớm nhất.\n" +
                "\n" +
                "Và ngày đó đã tới. Nhà vua khấp khởi mừng thầm. Cả vương quốc đều tụ tập về quanh triều đình để được biết về điều đặc biệt đó. Nhà vua háo hức mở trang giấy chứa đựng toàn bộ sự thông thái của thế gian. Trong đó chỉ duy nhất một câu: “Không có sự thông thái nào mà không phải trả giá”."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/1371967313_cute_cartoon_girl_wallpaper-660x440.jpg", "Sự tích hoa chua me đất", "Ngày nào cũng phải ăn một thứ cỏ ba lá và gặm nhấm mãi vỏ cây hồ đào, Thỏ Côxôi chán ngấy lên rồi. Nó bèn mò vào vườn bắp cải mới trồng của một bác nông dân. Nhiều bắp cải non đã bị thỏ xơi gọn. Bỗng bác nông dân xuất hiện. Bác khoát tay nói:\n" +
                "\n" +
                "– Côxôi ơi, – bác nông dân bảo con thỏ đã ăn no bụng và lúc này đang chùi mép – Ta và mi chưa có giao kèo gì với nhau cả. Ta trồng bắp cải đâu phải cho mi. Nếu như mi cứ ăn mãi như vậy thì ta sẽ trắng tay, mùa thu lấy gì mà làm dưa?\n" +
                "\n" +
                "– Làm dưa ư? – Thỏ ngạc nhiên – Cải bắp cũng làm dưa được sao? Hẳn là phải ngon lắm nhỉ?\n" +
                "\n" +
                "– Bây giờ chưa phải thời kỳ làm dưa. Tốt nhất mi đừng có đụng tới vườn rau của ta nữa, mùa đông tới, mi hãy lại đây, ta sẽ cho ăn dưa bắp cải.\n" +
                "\n" +
                "Thỏ hứa là sẽ không phá vườn rau. Mùa hè, nói chung nó ít phải lo lắng, vì cỏ ba lá ngoài đồng rất sẵn, còn cỏ trên các cánh đồng cũng không hiếm. Nghĩ vậy, thỏ vẫy vẫy cái đuôi ngắn tũn một cách sung sướng.\n" +
                "\n" +
                "Thế rồi mùa đông tới, thỏ tìm gặp lại bác nông dân để xin bắp cải muối dưa và đã được bác chiêu đãi một bữa luý tuý. Từ đó thành lệ, ngày nào thỏ cũng được ăn dưa bắp cải. Nhưng mới tới lễ Giáng sinh, toàn bộ số bắp cải muối trong thùng đã hết nhẵn, thế là mùa đông chưa qua, mà thức ăn trong nhà đã chẳng còn gì.\n" +
                "\n" +
                "Thấm thoắt đã sang mùa xuân. Bác nông dân bảo thỏ:\n" +
                "\n" +
                "– Thỏ ơi, ruộng nhà anh rộng hơn ruộng nhà tôi, vậy nên trồng bắp cải đi.\n" +
                "\n" +
                "– Nhưng tôi không có cải giống – Thỏ buồn rầu đáp.\n" +
                "\n" +
                "– Đến Riga mà mua. Mùa xuân nào tôi chẳng mua giống ở đó.\n" +
                "\n" +
                "Bác nông dân tìm cách thoát khỏi thỏ. Thỏ kiếm đâu ra tiền để mua vé tàu? Nhưng chú thỏ này của chúng ta không đến nỗi ngốc nghếch, mặc dù đôi tai của nói ngắn hơn so với đôi tai của đồng loại. Nó hăm hở đứng ở nhà ga để chờ tàu và nó thấy bất kỳ ai đến nhà ga cũng đều bỏ tiền ra mua vé.\n" +
                "\n" +
                "– Các bác định làm gì với những chiếc vé này? – Nó hỏi.\n" +
                "\n" +
                "– Chúng tôi đến Riga – mọi người đáp.\n" +
                "\n" +
                "– Thế lên tàu không có vé, được chứ? – Thỏ hồi hộp\n" +
                "\n" +
                "– Không thể được\n" +
                "\n" +
                "Thật chả ra sao! đành phải quay về thôi, không cần đến Riga, không cần mua bắp cải giống nữa. Nó ngồi xuống bên đường và lau nước mắt. Bỗng có tiếng thét kinh hoàng vang trên đầu nó: “Chó săn đấy!” Thỏ thấy lạnh toát ở chỗ đuôi, toan trốn chạy, song nó lại đứng ngây ra ở bên cột đèn. Và cũng thật lạ thay. Không phải là chó săn mà là những ngôi nhà nhỏ di động trên các bánh xe tiến về phía nhà ga, còn mọi người thì vội vã leo lên đó.\n" +
                "\n" +
                "“Họ đến Riga đấy!” – Thỏ ngạc nhiên nghĩ.\n" +
                "\n" +
                "– Chúc lên đường may mắn! – Thỏ hét to khi tàu chuyển bánh.\n" +
                "\n" +
                "“Gượm đã, mà vì sao ta lại không đến chơi Rừng Thú nhỉ?” – Thỏ nghĩ và nhảy luôn lên xe hoả, ngồi nghiêm chỉnh như Thượng đế. “Ê, ta muốn đến tận Riga cơ, đời thỏ của ta không còn gì hơn thế”.\n" +
                "\n" +
                "Và thế là thở cảm thấy vô cùng thú vị khi được ngồi trên tàu hoả, quên luôn cả ý định xuống chơi Rừng Thú. Còn đoàn tàu thì cứ từ từ tiến về phía nhà ga.\n" +
                "\n" +
                "Tới nhà ga, Thỏ vội vã tìm quầy bán cây giống.\n" +
                "\n" +
                "– Anh bạn trẻ cần gì? – Người bán hàng hỏi một cách lịch sự.\n" +
                "\n" +
                "– Tôi cần cây bắp cải giống – Thỏ nhỏ nhẹ đáp.\n" +
                "\n" +
                "– ở đây nhiều thứ cải giống lắm. Tôi có thể giới thiệu để anh mua cải bắp, súp lơ, cà rốt. Anh bạn trẻ muốn cà rốt nhé? Mùa hè có thể ăn lá, mùa đông thì gặm lõi bắp cải được đấy.\n" +
                "\n" +
                "– Chị không có bắp cải giống nào khác nữa à? – Thỏ dè dặt hỏi.\n" +
                "\n" +
                "– Không – Người bán hàng khoát tay.\n" +
                "\n" +
                "– Tôi cần bắp cải muối dưa – Thỏ không giấu diếm nữa.\n" +
                "\n" +
                "– Anh cần bắp cải muối dưa ư? – người bán hàng thốt lên với một giọng dễ nghe – Thứ đó chúng tôi vẫn thường cho không. – Vừa nói chị ta vừa lục trong túi giấy số bắp cải còn sót đưa cho thỏ và dặn thêm – Đưa về trồng, đợi đến Lễ Giáng sinh sẽ có dưa chua ăn.\n" +
                "\n" +
                "Thỏ hí hửng trở về nhà. Nó đem trồng bắp cải ngay trên khu đất đồi ẩm ướt rồi tự ngồi canh gác để muông thú khỏi đến phá phách. Vợ thỏ cùng với lũ con suốt từ sáng đến tối ra sức tưới tắm cho bắp cải. Khi một cây cải ba lá bắt đầu cuốn, thỏ liền nhổ lên:\n" +
                "\n" +
                "– Sói sẽ xé xác ta, nếu đây không phải là bắp cải muối dưa thật sự – Thỏ vừa nói vừa thong thả nhấm chiếc lá nhỏ xíu.\n" +
                "\n" +
                "Giờ thì cả nhà thỏ không rời mắt khỏi vườn bắp cải, suốt mùa hè chúng được mặc sức thưởng thức cải muối dưa và luôn tấm tắc khen ngon.\n" +
                "\n" +
                "Thỏ ta rất dương dương tự đắc. Nó mời từng người một tới nhà ăn cải bắp muối dưa và luôn mồm kể chuyện nó đã đến Riga mà không mua vé như thế nào.\n" +
                "\n" +
                "Từ đó, cây bắp cải của thỏ được mang cái tên là Hoa Chua Me Đất còn những hành khách đi tàu không chịu mua vé, ấy là họ hàng nhà Thỏ."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/con-chim-v%C3%A0ng.jpg", "Con chim vàng", "Ngày xưa có một ông vua cho trồng một vườn hoa ở phía sau cung điện của mình để làm nơi tản bộ vui chơi. Trong vườn hoa ấy có một cây táo kết quả vàng. Khi quả táo sắp chín, vua phái người tới đếm số quả, nhưng tới sáng hôm sau thì lại thiếu đi một quả.\n" +
                "Biết được việc đó, nhà vua ra lệnh phải canh cây hàng đêm. Vua có ba hoàng tử. Hoàng tử lớn nhất phải canh buổi đầu tiên. Tới khuya hoàng tử không sao cưỡng lại được cơn buồn ngủ. Sáng hôm sau lại thiếu một quả táo. Hoàng tử thứ hai canh đêm tiếp theo, nhưng mọi chuyện cũng chẳng tốt đẹp gì hơn. Khi đồng hồ điểm mười hai giờ thì hoàng tử đã thiu thiu ngủ, sáng hôm sau lại thiếu một quả táo. Ngày thứ ba đến lượt hoàng tử út. Hoàng tử thích đi, nhưng vua lại không tin, cho rằng chàng làm sao bằng hai anh, nhưng rồi cuối cùng nhà vua cũng cho đi canh cây. Chàng nằm ngay dưới gốc cây và cố thức. Khi đồng hồ điểm mười hai tiếng thì có tiếng rào rào trong không trung. Nhìn qua ánh trăng, hoàng tử thấy một con chim lông vàng óng ánh bay tới đậu trên cây, nó mổ một quả táo. Hoàng tử giương cung bắn. Mũi tên trúng một chiếc lông cánh, lông rơi xuống. Chàng nhặt cất giữ chiếc lông chim. Sáng hôm sau hoàng tử dâng vua xem và kể lại những gì mình thấy. Vua triệu quần thần lại bàn bạc. Quần thần cho rằng chiếc lông vàng quý hơn cả một vương quốc. Vua phán:\n" +
                "– Nếu chiếc lông chim quí như vậy thì trẫm không những muốn có một chiếc, mà muốn có cả con chim!\n" +
                "Hoàng tử con cả tự cho mình là người thông minh tài trí liền lên đường đi tìm con chim đó. Đi được một quãng thì chàng thấy một con cáo ở ven rừng. Chàng giương súng tính ngắm bắn cáo. Cáo nói:\n" +
                "– Đừng có bắn tôi, tôi sẽ cho anh một lời khuyên. Anh đang đi đúng con đường tới chỗ con chim vàng. Tối nay anh sẽ tới một làng, ở đó có hai quán trọ nằm đối diện nhau. Một quán trọ thì đèn sáng trưng, người ra vào tấp nập. Đừng có vào quán đó mà vào quán đối diện, dù nhìn vẻ bề ngoài nó không hấp dẫn lắm.\n" +
                "Hoàng tử nghĩ bụng:\n" +
                "– Một con vật hay giỡn cợt thì làm sao có thể cho một lời khuyên nghiêm túc được!\n" +
                "Thế là chàng bấm cò, chàng bắn trượt. Cáo cong đuôi chạy thẳng vào rừng. Chàng lại tiếp tục lên đường và tới được làng khi màn đêm đang buông xuống. Hai quán trọ nằm đối diện nhau. Một quán thì ca hát, nhảy múa tưng bừng, quán kia thì có vẻ tiêu điều. Hoàng tử nghĩ:\n" +
                "– Nếu ta bỏ qua quán trọ tốt mà vào ở trong quán trọ tồi tàn thì ta quả là một tên ngu ngốc!\n" +
                "Vì vậy anh ta bước vào quán trọ đang náo nhiệt để thỏa sức ăn chơi mà quên mất việc đi tìm con chim vàng cùng những lời khuyên của cha anh ta.\n" +
                "Thời gian trôi qua mà chẳng thấy người con cả quay trở về nên người con thứ hai lên đường để tìm con chim vàng. Cũng như người anh cả, anh ta cũng gặp con cáo, nó khuyên anh với những ý tốt, nhưng anh ta chẳng thèm để ý. Anh tới chỗ có hai quán trọ. Người anh cả đang đứng bên cửa sổ của quán trọ có tiếng ồn vang ra nhìn thấy em thì gọi vào. Anh bước vào trong quán trọ ấy để ăn uống vui chơi cho thỏa thích.\n" +
                "Lại một thời gian trôi qua, hoàng tử út xin được thử sức mình, nhưng nhà vua không cho. Nhà vua nói:\n" +
                "– Chỉ mất công vô ích. Con làm sao mà bì được với hai người anh, nên không hy vọng tìm được con chim vàng. Khi gặp trở ngại khó khăn con lại không biết đường xoay sở. Con không đủ tài trí để làm việc đó.\n" +
                "Người con út cứ nài nỉ không để cho vua cha được yên thân, nên cuối cùng nhà vua cũng bằng lòng cho đi. Hoàng tử gặp một con cáo ở ven rừng, nó xin chàng tha chết và nói cho chàng biết những lời khuyên tốt. Hoàng tử út là người tốt bụng. Chàng nói:\n" +
                "– Cáo thân yêu, cứ yên tâm, ta không hại mi đâu!\n" +
                "Cáo nói:\n" +
                "– Anh sẽ không phải hối hận vì điều đó. Anh hãy cưỡi đuôi tôi mà đi cho nhanh tới đó.\n" +
                "Hoàng tử vừa ngồi lên đuôi cáo, cáo liền chạy vượt qua các bụi gai, đá tảng, gió thổi dựng đứng lông cáo lên. Khi cả hai tới một làng kia, hoàng tử bước xuống. Theo lời khuyên của cáo, hoàng tử vào nhà trọ tồi tàn và ngủ bình yên qua đêm ở trong nhà trọ đó. Sáng hôm sau, hoàng tử ra cánh đồng thì gặp cáo, nó nói:\n" +
                "– Giờ tôi nói anh biết mình phải làm gì. Anh cứ thẳng đường mà đi thì sẽ tới một lâu đài có tốp lính đang nằm ngủ say và ngáy. Đừng để ý tới chuyện đó, anh cứ đi thẳng vào trong lâu đài, đi qua nhiều phòng, rồi tới một căn phòng ở trong có treo lồng chim. Trong lồng có con chim vàng. Cạnh đó có một cái lồng bằng vàng trang trí rất đẹp, nhưng là lồng không. Anh cần nhớ, không được bắt con chim vàng ở trong lồng cho sang lồng bằng vàng. Làm như vậy anh sẽ gặp nguy hiểm đấy.\n" +
                "Xong sau đó, hoàng tử ngồi lên đuôi cáo, cáo liền chạy vượt qua các bụi gai, đá tảng, gió thổi dựng đứng lông cáo. Khi cả hai tới lâu đài, mọi việc đúng như lời cáo nói. Hoàng tử tới gian phòng có chiếc lồng gỗ nhốt con chim vàng, cạnh đó là một chiếc lồng bằng vàng. Táo vàng ở khắp nơi trong phòng. Chàng nghĩ: “Nếu cứ để con chim vàng ở trong cái chuồng tầm thường xấu xí thì thật vô lý.” Chàng mở cửa lồng, bắt chim thả vào trong chiếc lồng vàng. Lập tức con chim vàng kêu inh ỏi lên. Binh lính thức dậy, xông lại bắt chàng, đem giam vào trong ngục. Sáng hôm sau, hoàng tử bị điệu ra tòa án. Chàng nhận hết mọi việc nên bị án tử hình. Nhưng vua nước đó nói rằng có thể tha thứ cho chàng với điều kiện, nếu chàng đem cho nhà vua một con ngựa vàng phi nhanh hơn gió. Nhà vua sẽ thưởng cho chàng con chim vàng.\n" +
                "Hoàng tử buồn thở dài lên đường, vì biết tìm ở đâu ra con ngựa vàng bây giờ? Đúng lúc đó chàng gặp lại anh bạn cáo khi trước đang ngồi bên vệ đường. Cáo nói:\n" +
                "– Anh thấy không! Anh không nghe lời tôi nên mới như vậy. Hãy dũng cảm nhé! Tôi sẽ giúp anh tìm ra con ngựa vàng. Anh cứ thẳng đường mà đi sẽ tới một lâu đài. Trong chuồng ngựa của lâu đài có một con ngựa vàng. Đám chăn ngựa nằm ngay trước cửa chuồng, nhưng chúng ngủ say và ngáy. Anh có thể im lặng dắt con ngựa vàng ra. Nhưng anh phải chú ý một điều: chỉ đặt chiếc yên ngựa bằng gỗ và da lên lưng ngựa, nếu lấy chiếc yên ngựa vàng treo cạnh đó thì anh sẽ gặp nguy hiểm đấy.\n" +
                "Đuôi cái trải ra, hoàng tử ngồi lên, cáo liền chạy vượt qua các bụi gai, đá tảng, gió thổi dựng đứng lông cáo lên. Khi cả hai tới nơi thì mọi chuyện giống như lời cáo nói. Hoàng tử vào chuồng có con ngựa vàng, đang định đặt chiếc yên cũ lên lưng ngựa thì chàng nghĩ:\n" +
                "– Thật là tủi hổ thay nếu ngựa vàng không có yên đẹp.\n" +
                "Chàng vừa mới đặt yên lên ngựa thì con ngựa hí vang lên. Những người trông ngựa tỉnh giấc, xông lại bắt chàng đem giam vào trong ngục. Sáng hôm sau, hoàng tử bị điệu ra trước tòa án và bị án tử hình. Nhưng nhà vua sẽ miễn tội tử hình và cho anh con ngựa vàng với điều kiện, anh phải đưa được công chúa xinh đẹp ra khỏi cung điện vàng tới đây.\n" +
                "Hoàng tử lên đường, lòng trĩu nặng lo âu. May thay chàng gặp lại anh bạn cáo trung thành. Cáo nói:\n" +
                "– Tôi vốn muốn anh chịu một số khổ sở, nhưng tôi lại rất thương anh nên sẵn lòng giúp anh khi khó khăn. Con đường ấy đi thẳng tới cung điện vàng. Khoảng chập tối anh sẽ tới nơi. Đêm khuya yên tĩnh thế nào công chúa sẽ vào buồng tắm để tắm. Đợi khi công chúa bước vào nhà tắm thì hãy bước tới hôn nàng. Nàng sẽ đi theo anh. Anh có thể dẫn nàng đi nhưng không cho nàng đến chào từ biệt bố mẹ, vì như vậy anh sẽ gặp nguy hiểm.\n" +
                "Đuôi cáo trải dài ra, hoàng tử ngồi lên đuôi. Cáo liền chạy xuyên rừng vượt núi, gió thổi dựng đứng lông cáo lên. Khi chàng tới cung điện vàng thì mọi việc đúng như lời cáo nói. Hoàng tử đợi đến nửa đêm, khi cả cung điện yên tĩnh trong giấc ngủ, công chúa xinh đẹp đi vào bồn tắm, hoàng tử tới ôm hôn nàng. Nàng nói, nàng sẽ vui vẻ theo chàng, nhưng cầu xin chàng tới chào từ biệt cha mẹ trước khi đi. Thoạt đầu chàng cự tuyệt, nàng khóc van, rồi quỳ xuống dưới chân nàng cầu xin, cuối cùng chàng cũng bằng lòng. Công chúa vừa tới giường vua và hoàng hậu thì cả hoàng cung tỉnh dậy. Hoàng tử liền bị bắt giam vào ngục. Sáng hôm sau vua bảo hoàng tử út:\n" +
                "– Ngươi đáng tội chết. Nhưng nếu trong vòng tám ngày ngươi có thể di chuyển ngọn núi che mất tầm mắt nhìn từ cửa sổ. Nếu làm được thì ta thưởng bằng cách gả con gái cho ngươi.\n" +
                "Hoàng tử bắt tay ngay vào làm, chàng đào, xúc liên tục. Nhưng sau bảy ngày chàng mới chỉ làm được một ít trông chả đáng là bao. Hoàng tử buồn rầu chán nản đâm ra mất hết hy vọng. Tối thứ bảy cáo đến và nói:\n" +
                "– Anh làm không được bao nhiêu, để tôi làm thay cho. Anh đi nằm nghỉ đi.\n" +
                "Sáng hôm sau, khi tỉnh giấc, hoàng tử nhìn qua cửa sổ thì thấy ngọn núi đã biến mất. Hoàng tử hết sức vui mừng, voi lại báo nhà vua rằng mình đã làm xong công việc và xin nhà vua, dù muốn hay không, giữ đúng lời hứa, gả công chúa cho chàng.\n" +
                "Hoàng tử và công chúa cùng nhau đi, không bao lâu sau cáo trung thành cũng nhập đoàn. Cáo nói:\n" +
                "– Anh có được điều mong ước, nhưng con ngựa vàng lại thuộc về công chúa.\n" +
                "Hoàng tử hỏi:\n" +
                "– Thế phải làm gì bây giờ?\n" +
                "Cáo đáp:\n" +
                "– Điều đó tôi xin nói anh rõ. Anh hãy đưa thiếu nữ xinh đẹp kia tới nhà vua cử anh tới cung điện vàng. Đó là một điều vui mừng khôn tả. Họ sẽ sẵn sàng dẫn tới trước mặt anh con ngựa vàng. Hãy nhảy ngay lên ngựa, rồi bắt tay chào mọi người và đưa tay bắt chào công chúa. Nhân lúc bắt tay thì kéo luôn công chúa lên ngựa và phóng đi, con ngựa ấy phi nhanh hơn gió.\n" +
                "Tất cả mọi việc đều mỹ mãn. Hoàng tử và công chúa xinh đẹp cưỡi ngựa vàng mà đi. Cáo cũng chạy cùng với họ. Cáo nói:\n" +
                "– Giờ tôi sẽ giúp anh đoạt được chim vàng. Khi anh tới gần cung điện có con chim vàng thì hãy cho công chúa xuống ngựa, đứng đợi ở ngoài cùng với tôi. Rồi anh cưỡi ngựa vào trong cung điện. Người trong cung điện mừng vui đón anh và lấy con chim vàng ra đưa cho anh. Cầm lồng chim trong tay rồi thì anh quay ngay ngựa phóng ra ngoài để đón công chúa.\n" +
                "Dự định đã hoàn thành. Trước khi hoàng tử trở về nhà cùng công chúa và con chim vàng, cáo nói:\n" +
                "– Giờ đã đến lúc anh đền đáp công tôi.\n" +
                "– Thế cáo muốn gì nào? – Hoàng tử hỏi.\n" +
                "Cáo đáp:\n" +
                "– Khi nào tới khu rừng thì anh hãy bắn tôi chết, rồi chặt đầu và chân.\n" +
                "Hoàng tử nói:\n" +
                "– Phải chăng đó là một cách cám ơn! Ta không thể làm việc đó với cáo.\n" +
                "– Nếu anh không muốn làm thì thôi. Giờ chúng ta chia tay nhau. Tôi cho anh hai lời khuyên: đừng có bỏ tiền chuộc kẻ phạm tội bị treo cổ, không ngồi ở bờ giếng. – Nói xong, cáo chạy thẳng vào rừng.\n" +
                "Hoàng tử nghĩ:\n" +
                "– Thật là một con vật kỳ lạ. Có đời nhà ai lại bỏ tiền chuộc kẻ phạm tội bị treo cổ. Mình cũng chưa bao giờ lại muốn ngồi bên giếng.\n" +
                "Chàng cùng thiếu nữ xinh đẹp lên đường. Trên đường đi họ tới một làng, nơi hai người anh của chàng dừng chân. Trong làng mọi người đang xì xào bàn tán. Chàng hỏi thì biết sắp có hai người sẽ bị treo cổ. Khi tới gần chàng mới biết đó là chính hai người anh của mình. Họ đã làm mọi việc lừa gạt xấu xa, rồi tiêu xài hết. Chàng dò hỏi, liệu có cách gì cứu được hai người đó không. Đám đông bảo:\n" +
                "– Nếu anh đem tiền chuộc tội cho họ, nhưng bỏ tiền cứu những con người xấu xa để làm gì?\n" +
                "Hoàng tử út đưa tiền chuộc mà chẳng cần suy nghĩ. Hai người anh được phóng thích. Tất cả mọi người cùng nhau lên đường.\n" +
                "Họ tới ven rừng, nơi khi xưa lần đầu tiên họ gặp Cáo. Nắng như thiêu như đốt, nhưng trong rừng lại mát mẻ dễ chịu. Hai người anh nói:\n" +
                "– Ta hãy nghỉ chân ngồi bên giếng ăn uống chút đi.\n" +
                "Hoàng tử quên mất lời dặn của cáo. Chàng không nghĩ tới điều gian ác có thể xảy ra, và ngồi bên bờ giếng. Hai người anh lao tới xô chàng rơi xuống giếng. Hai người anh mang theo con chim vàng, ngựa vàng và dẫn công chúa về giao nộp cho vua cha. Họ nói:\n" +
                "– Chúng con không những chỉ mang chim vàng, mà còn mang về cả ngựa vàng và công chúa ở lâu đài vàng về. Đó là những thứ chúng con đoạt được.\n" +
                "Nhà vua hết sức vui mừng, nhưng ngựa không ăn cỏ, chim không hót, còn công chúa thì ngồi khóc.\n" +
                "Hoàng tử út rơi xuống giếng, nhưng giếng cạn chỉ còn bùn nên chàng không bị sao cả. Chỉ có là chàng không sao lên khỏi giếng được. Đúng lúc khó khăn thì con cáo lại tới, nó nhảy xuống và trách chàng không lưu ý lời khuyên của nó. Cáo nói:\n" +
                "– Tôi không thể để anh như thế này. Tôi sẽ giúp anh lên khỏi giếng.\n" +
                "Nó bảo anh nắm chặt đuôi nó, rồi nó kéo anh lên khỏi giếng. Con cáo nói:\n" +
                "– Anh vẫn chưa thoát nạn đâu. Hai người anh không biết là anh đã chết hay chưa nên phái người canh phòng cánh rừng. Nếu họ bắt gặp anh họ sẽ giết ngay.\n" +
                "Khi đó có một ông già nghèo ngồi bên đường. Hoàng tử đổi quần áo cho ông già. Với quần áo cải trang, hoàng tử út về được tới hoàng cung. Chẳng ai nhận ra chàng, nhưng chim bắt đầu hót, ngựa lại ăn cỏ và thiếu nữ xinh đẹp không khóc nữa.\n" +
                "Nhà vua ngạc nhiên hỏi:\n" +
                "– Thế này nghĩa là thế nào?\n" +
                "Công chúa trả lời:\n" +
                "– Con cũng không biết việc đó. Trước con rất buồn, nhưng giờ thì con thấy vui vẻ. Con có linh cảm là người chồng chưa cưới của con đã về rồi.\n" +
                "Công chúa kể hết đầu đuôi câu chuyện cho nhà vua nghe, cho dù những người anh khác dọa sẽ giết nếu nàng nói lộ mọi chuyện. Nhà vua ra lệnh trong hoàng cung phải tới trình diện. Hoàng tử út quần áo tả tơi trông như một người đàn ông nghèo cũng tới, nhưng công chúa nhận ra ngay, chạy lại ôm hôn. Hai người anh bụng dạ xấu xa bị bắt giữ và bị hành hình. Hoàng tử út cùng công chúa kết hôn với nhau và được thừa kế ngai vàng.\n" +
                "Nhưng còn con cáo đáng thương thì sao? Sau đó rất lâu, có lần hoàng tử lại đi vào rừng. Chàng gặp con cáo, cáo nói:\n" +
                "– Chàng đã có những gì chàng mong muốn, nhưng nỗi đau khổ của tôi thì chưa kết thúc. Việc giải thoát tôi nằm trong quyền của chàng.\n" +
                "Cáo năn nỉ chàng, dù chàng có bắn chết nó, chặt đầu hay tháo móng nó. Hoàng tử giải xóa lời bùa yểm cáo. Cáo lại biến thành người. Đó chẳng phải là ai khác, mà là người anh của công chúa xinh đẹp. Từ đó trở đi họ sống suốt đời trong no đủ và hạnh phúc."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/roi_lion_03-660x440.jpg", "Sự tích con sư tử", "Thuở xưa, có một hoàng tử mới mới lên ngôi hoàng đế. Ngay lập tức chàng muốn đi học phép thuật để củng cố đất nước. Chàng đi tìm một ông thầy bùa chú rất nổi tiếng về phép thuật để học.\n" +
                "\n" +
                "Hoàng hậu rất buồn vì ý định của hoàng đế vì nàng sợ sự chia ly, vả lại trên đường đi có rất nhiều nguy hiểm, khó khăn. Nhưng chàng đã quyết và một ngày kia lên đường cùng với bốn người tuỳ tùng.\n" +
                "\n" +
                "Đường đi rất khó khăn, vì phải qua những sa mạc rộng lớn và đi vào những vùng rừng sâu đầy thú dữ… nhưng vì họ quá khao khát phép thuật, quyền hành sau này, cho nên những khó khăn chẳng cản được họ.\n" +
                "\n" +
                "Ba tháng cực khổ, đói và khát, hoàng đế và bạn hữu chàng đến chỗ của thầy tu. Vị thầy nầy cảm động vì sự dũng cảm của họ nên chấp nhận cho họ học nghề. Nhưng ông ra một điều kiện: họ phải hứa xử trí một cách đạo đức, không bao giờ giết sinh vật nào cả. Nếu tay họ chỉ một lần vấy máu thôi, thì tất cả phép thuật sẽ biến mất đi. Hoàng đế đồng ý.\n" +
                "\n" +
                "Sau khi học những phép thuật, họ vui mừng, lên đường trở về cung điện. Nhưng đi một tháng sau, họ lạc trong một khu rừng dày đặc. Họ không nhận ra những đường xưa nữa, và thấy tất cả vật xung quanh họ đều lạ lùng. Lúc đó, hoàng hôn giăng bủa và đêm khuya bỗng nhiên ôm trùm cả phong cảnh rừng tối om. Những vòm lá ngàn cây che mịt mù cả trời đen thui, không cho thấy những ngôi sao nào để mà nhắm hướng. Xung quanh họ bắt đầu vang lên hàng trăm thứ tiếng của thú rừng.\n" +
                "\n" +
                "Hoàng đế và các bạn hữu chàng bắt đầu sợ và bàn với nhau dùng phép thuật để biến thành một con thú vật rất mạnh bạo, to lớn, dữ tợn, có thể tự bảo vệ, và làm khiếp sợ những con thú khác. Vì thế, hoàng đế bắt đầu biến thành đầu một con vật, bờm tóc, như vương miện… Ông đại tướng làm theo ngay và biến thành thân người của con động vật ấy… bốn người tùy tùng kia thì biến thành bốn chân… còn lại ông thầy địa, do dự một lúc, rồi biến thành cái đuôi. Con vật ấy có dáng đi hùng dũng như một vị vua nên các con thú rất sợ và không tấn công nó.\n" +
                "\n" +
                "Hoàng đế và mấy bạn bè ở như vậy suốt cả đêm dài. Nhưng lúc gần sáng, thì có một con nai non đi qua gần đó. Con sư tử rất đói vì cả ngày chưa ăn, bỗng chìa cánh tay ra, bắt con nai bằng vuốt nhọn, và hai tay giữ mạnh, cắn cổ nai và xé thịt ăn ngon lành…\n" +
                "\n" +
                "Mõm nó còn đỏ máu lúc mặt trời dần dần thức dậy. Nó muốn biến lại thành người để tiếp tục đi về cung điện. Nhưng đột nhiên nó nhớ lại là nó đã dùng phép thuật để giết một con thú vật rồi. Lúc đó nó mới biết là nó sẽ không bao giờ trở thành người lại được nữa, và luôn luôn phải sống làm kiếp con sư tử…"))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/n%C3%A0ng-c%C3%B4ng-ch%C3%BAa-b%C3%A1n-than.jpg", "Nàng công chúa bán than", "Ngày xưa có một ông vua sinh được ba nàng công chúa. Ba nàng đều xinh đẹp như nhau, nhưng tính tình lại rất khác nhau. Hai công chúa lớn chỉ sống ỷ lại. Cả hai đều lấy được chồng con nhà quan, giàu có. Sẵn có vàng bạc của cải, ngày ngày hai nàng chỉ ngồi ăn chơi. Công việc nhà cửa đều phó thác cho người làm, người ở. Còn công chúa Ba thì nghĩ và làm khác hai chị. Nàng không sống dựa vào giàu có mà trái lại rất siêng năng làm việc và nhất định không chịu lấy chồng con nhà giàu. Một hôm, vì không nhận lời con trai quan tể tướng nên công chúa Ba bị vua cha đuổi ra khỏi cung. Nhà vua sai người trao cho nàng một con ngựa mù và nói: – Con đã không muốn sống giàu có thì hãy đi ra khỏi nhà này. Ta muốn xem con làm giàu cách nào bằng hai bàn tay kia và cấm không được trở lại cung điện chừng nào chưa có nhiều tiền bạc của cải hơn hai chị gái. Công chúa Ba không chút buồn rầu, nàng vỗ về con ngựa mù và nói: – Sau này ta sẽ trở nên giàu có và chữa cho ngựa khỏi mù. Nói rồi nàng nhảy lên lưng ngựa, lặng lẽ lên đường. Con ngựa tuy mù cả hai mắt nhưng đi rất đều chân. Đến lúc xẩm tối, ngựa dừng lại trước một túp lều nho nhỏ ven đường mòn bên một cánh rừng. Công chúa xuống ngựa và bước vào lều. Nàng hỏi ra mới biết đây là nhà của một bà già goá chồng. Bà cụ đã ngoài sáu mươi tuổi, có một người con trai vừa tròn ba mươi, chuyên làm nghề đốt than. Vì vậy người ta quen gọi chàng là chàng Đốt Than.\n" +
                "\n" +
                "Sau một hồi chuyện trò thăm hỏi, công chúa tự xưng tên và hoàn cảnh của mình và nàng có ý xin ở lại làm dâu bà cụ. Nghe nói vậy bà cụ sợ hãi chắp tay vái lạy công chúa và hết lời từ chối. Chàng Đốt Than cũng không dám nhận lời. Chàng mời công chúa nghỉ lại một đêm rồi sáng sớm mai công chúa định đến đâu chàng dẫn đi đến đó. Công chúa Ba hết sức thành thực xin ở lại làm dâu bà cụ và làm vợ chàng Đốt Than. Bà cụ không còn cách nào từ chối, đành phải nhận lời. Sau bữa cơn rau bình thường, công chúa hỏi han mọi việc làm ăn và mọi sinh hoạt sớm tối ở trong nhà. Ba mẹ con thân mật trò chuyện mãi tới khuya.\n" +
                "\n" +
                "Sáng hôm sau, hai mẹ con bà cụ lại mỗi người mỗi việc như thường lệ. Bà cụ dậy sớm nấu cơm cho con trai ăn trước khi đi làm. Chàng Đốt Than cũng dậy rất sớm quẩy sẵn hai gánh nước cho mẹ. Công chúa cũng bắt tay vào công việc. Nàng dậy sớm hơn mọi hôm ở trong cung điện để dọn dẹp nhà cửa, quét tước sân ngõ, thả ngựa đi ăn cỏ. Sau bữa cơm sáng, chàng Đốt Than lại đeo dao, quẩy sọt vào rừng. Công chúa Ba ngỏ ý muốn đi theo nhưng bà cụ bảo nàng ở lại cùng cuốc vườn để kịp trồng ngô đúng ngày đúng vụ. Nàng làm việc suốt từ sáng đến chiều nên rất mệt. Đến cuối buổi nàng còn tranh thủ cắt thêm một gánh cỏ cho ngựa ăn đêm. Chiều tối, chàng Đốt Than quẩy một gánh than về. Công chúa ra tận ngõ đón chồng.\n" +
                "\n" +
                "Từ khi có vợ, chàng không phải đi chợ bán than như mọi khi nữa. Việc bán than đã có vợ giúp nên chàng có nhiều thì giờ vào rừng và đốt ngày càng được nhiều than hơn.\n" +
                "\n" +
                "Công chúa Ba đã quen đần với công việc. Sau mỗi buổi đi chợ về, nàng lại vác cuốc ra làm vườn. Một hôm, nàng cuốc phải một vật rất cứng màu vàng, to bằng quả trứng, nhặt lên xem thì đó là một cục vàng, thấy con dâu nhặt hòn đá cho vào túi bà cụ phì cười cho là người cung các muốn chơi đá làm cảnh và cũng không hỏi nàng. Sáng hôm sau công chúa lại cuốc được một cục vàng giống như hôm trước, nàng lại nhặt bỏ vào túi rồi đem cất vào đầu giường nằm. Ngày ngày nàng vẫn cùng mẹ chồng cuốc đất rồi tiếp tục cùng bà cụ gieo trồng. Chàng Đốt Than vẫn vào rừng làm than và quẩy về mỗi ngày một gánh nặng.\n" +
                "\n" +
                "Tuy bận việc suốt ngày nhưng công chúa không lúc nào quên con ngựa. Hôm nào nàng cũng dành thì giờ cắt thêm cỏ, hái thêm lá rừng cho ngựa ăn đêm. Một hôm dắt ngựa đi uống nước nàng gặp một đạo sĩ. Thấy con ngựa béo đẹp nhưng lại mù, đạo sĩ đứng lại hỏi chuyện. Công chúa ngỏ ý muốn chữa mắt cho ngựa. Đạo sĩ mách, muốn chữa cho ngựa khỏi mù thì phải lấy lá mản ở trên đỉnh núi Tiên cho ăn và lấy nước giếng phun ở trên đỉnh núi Tiên cho uống trong ba tháng liền. Công chúa cảm ơn đạo sĩ. Rồi từ đấy, chiều nào, sau khi làm vườn xong nàng cũng nhanh chân leo lên đỉnh núi Tiên hái lá mản và múc nước thần về cho ngựa. Nàng kiên trì làm công việc này trong suốt ba tháng ròng. Quả nhiên con ngựa đã khỏi mù.\n" +
                "\n" +
                "Một hôm, nàng ngỏ ý muốn theo chồng vào rừng đốt than nhưng chồng không ưng vì sợ vợ không leo được lên dốc. Chờ chồng đi khỏi, nàng lén theo sau. Tới nơi, công chúa hỏi chồng cách đốn cây chặt cành rồi nàng bắt tay vào công việc. Công việc chặt cây rồi cũng quen dần. Chẳng bao lâu những khúc cây chặt xếp đống chật xung quanh lò than. Công chúa bàn với chồng đào thêm một hai cái lò nữa.\n" +
                "\n" +
                "Sáng hôm sau, vừa coi lò, chàng Đốt Than vừa cùng vợ đào thêm cái lò thứ hai. Đang đào, chợt công chúa thấy hai cục vàng, rồi bới lại được thêm hai, ba cục nữa. Nàng kêu lên sung sướng. Sau đó hai vợ chồng còn tìm thêm được rất nhiều vàng nữa. Công chúa dặn chồng phải giữ kín chuyện và tìm cách chuyển vàng dần về nhà. Từ hôm ấy, chiều nào hai vợ chồng cũng gánh về một gánh than và cho ngựa thồ thêm một gánh. Trong thồ và gánh than nào cũng có mươi, mười lăm cục vàng. Suốt ba tháng trời, hai vợ chồng nàng đã chuyển hết hang vàng về nhà, chôn giấu cẩn thận. Vườn ngô do hai bàn tay nàng và bà mẹ vun trồng đã tới vụ bẻ. Nàng phải cùng chồng dựng thêm lều chứa ngô thu hái về. Từ đấy, trong nhà đã có đủ ngô ăn quanh năm và có vàng chi dùng.\n" +
                "\n" +
                "Thấy trong nhà đã có vàng gấp năm gấp mười kho vàng của vua cha, công chúa bàn với chồng và mẹ dựng nhà tậu trâu, mua ruộng. Nàng bảo chồng vào cung đo nhà của nhà vua để làm một cái nhà y như thế. Chàng Đốt Than theo lời vợ dặn vào cung đo chiều dài, chiều rộng, chiều cao của cung vua. Nhà vua thấy vậy liền quát hỏi chàng Đốt Than. Chàng không chút sợ hãi đáp: – Tôi là người đốt than, chồng của nàng công chúa Ba, là con rể của nhà vua. Theo lời công chúa, tôi vào đây đo đạc cung vua để về dựng một cái nhà to cao như vậy. Nghe xong nhà vua giận lắm, lớn tiếng quát tháo và sai lính đuổi chàng Đốt Than. Hai công chúa lớn cũng ra sân xỉa xói, xỉ vả mắng nhiếc chàng thậm tệ. Chàng Đốt Than không nói không rằng, bình thản đi ra cổng thành. Về đến nhà, chàng kể lại cho vợ nghe câu chuyện vừa xảy ra ở trong cung điện. Công chúa an ủi chồng: – Sau này ta sẽ làm vua cha và hai chị biết. Bây giờ chàng hãy chịu khó ít lâu.\n" +
                "\n" +
                "Chàng Đốt Than vào thành thuê một đoàn thợ về xây nhà. Đoàn thợ làm ngày làm đêm, chỉ trong vòng hai tháng, tòa nhà đã dựng xong. Ngày về nhà mới, nàng bảo chồng sang mời vua cha và hoàng hậu sang chơi. Lần này vua không quát như trước nhưng vua mỉa mai bảo chàng Đốt Than về làm kiệu bằng vàng và võng vàng sang đón thì vua và hoàng hậu mới đi. Công chúa Ba cho thợ đúc ngay một cái kiệu vàng và một cái võng vàng sang đón vua và hoàng hậu.\n" +
                "\n" +
                "Thấy vậy nhà vua lấy làm lạ lắm. Tuy vua không ưa gì nàng công chúa ngang ngạnh, khó bảo nhưng cũng muốn đến tận nơi, xem công chúa làm ăn như thế nào. Vua cùng hoàng hậu và hai công chúa lớn sang bên công chúa Ba.\n" +
                "\n" +
                "Bốn người đến nhà công chúa Ba giữa lúc trong nhà đang đông nghịt những khách đến chúc mừng nhà mới. Ngắm nhìn toà nhà đồ sộ, cột, kèo, xà đều chạm trổ rồng phượng công phu, lại sơn son thiếp vàng sáng chói, nhà vua càng ngạc nhiên. Hai công chúa chị ngẩn người, hết ngắm nhà cửa lại nhìn mâm bàn rồi cùng nhau gật gù thầm khen em gái mãi. Cùng lúc ấy, con ngựa trong tàu hý vang. Chàng Đốt Than dắt con ngựa ra sân. Con ngựa ngẩng cao đầu, vểnh đôi tai, đập bốn vó thình thịch, hý vang như có ý chào mừng nhà vua, hoàng hậu và hai công chúa chị. Nhìn con ngựa tốt, khoẻ mạnh, hai mắt lành lặn và sáng ngời, nhà vua vô cùng cảm động, đến bên ôm lấy cổ ngựa vỗ về.\n" +
                "\n" +
                "Sau ba ngày ăn uống linh đình mừng ngôi nhà mới, nhà Vua cùng hoàng hậu và hai công chúa chị ở lại chơi thêm vài ngày. Người rào cũng hỏi han đủ điều. Nghe công chúa Ba kể đầu đuôi mọi công việc làm ăn trong những tháng năm qua, nhà vua hết lời khen ngợi. Biết hai công chúa chị ngồi ăn núi lở, vốn liếng đã cạn nhiều, công chúa Ba tặng mỗi chị vài chục cục vàng. Nàng tha thiết khẩn khoản mời hoàng hậu ở lại với nàng cho vui. Từ đó vợ chồng nàng cùng sống với hai bà mẹ những ngày tháng yên ấm, hạnh phúc."))
        listStoryCTTG.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/07/su-tich-chuot-chu-640x440.jpg", "Sự tích chuột chù", "Ngày xưa, xưa ơi là xưa, lúc các cô tiên còn hay xuống trần gian dạo chơi, chuột chù vốn là vật nuôi làm cảnh của một cô tiên. Lông nó lúc ấy trắng và thơm mùi hoa lan vì suốt ngày nó chỉ biết ăn hoa và củ lang mà thôi.\n" +
                "\n" +
                "Thế rồi một hôm chuột chù theo cô tiên xuống trần gian chơi. Chợ đông người quá, các hàng ăn thì lại rất thơm ngon. Chuột chù ngạc nhiên, say mê dí mũi vào ngửi và kêu lên ầm ĩ: “Thích, thích, thích”. Nó cứ sy mê mà không để ý đến cô tiên, dần dần nó tuột lại phía sau mà không hay biết.\n" +
                "\n" +
                "Khi trời sụp tối, chợ đã tan, nó mới biết mình bị lạc. Nó ngơ ngác tìm cô tiên rồi sợ phát khóc khi thấy một bầy mèo đi tới. Nó vội vàng bỏ chạy, dũi cả đất bùn nơi cống rãnh lên người để ẩn nấp. Càng lúc nó càng chui sâu xuống đất, đào thành cái hang để trốn trong đó.\n" +
                "\n" +
                "Mấy ngày sau, đói quá, nó mới mon men bò ra chợ để hy vọng gặp lại chủ của mình. Mấy ngày vùi trong bùn đất nên nó đi đến đâu, mọi người bịt mũi dạt ra đến đấy. Ngay cả cô tiên, chủ của nó thấy vậy cũng bay lên cao, không nhận ra nó nữa. Lông nó trở nên đen thui, mùi hôi thật kinh khủng, khác hẳn ngày xưa. Thế là các cô tiên đi mất, từ đó chuột chù ở lại trần gian bơ vơ, phải tự tìm thức ăn và bị mọi người xua đuổi."))
    }

    private fun addListStoryCTVN() {
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/03/beo-cai.jpg", "Bà chúa Bèo", "Ngày xửa ngày xưa ở một làng nọ có một cô bé hiền lành, chịu thương chịu khó. Một ngày cô ngồi ở bờ ruộng lặng nhìn những cây lúa nghẹn đòng ở ruộng nhà.\n" +
                "\n" +
                "Cô thương cho lúa và lo cho gia đình mình. Năm nay mất mùa thì lại bữa cơm bữa cháo!\n" +
                "\n" +
                "Cô nhìn cánh đồng làng rộng thẳng cánh cò bay. Ðất bạc màu, lúa ốm yếu, xanh một màu vàng vọt. Cô thương cho lúa và lo cho làng xóm. Năm nay mất mùa thì lại có người chết đói!\n" +
                "\n" +
                "Cô ôm mặt khóc. Bỗng Bụt hiện ra sáng lòa, hỏi:\n" +
                "\n" +
                "– Tại sao con khóc?\n" +
                "\n" +
                "Cô bé vừa mếu máo vừa thưa:\n" +
                "\n" +
                "– Con khóc vì con thương cây lúa nghẹn đòng.\n" +
                "\n" +
                "– Nhưng nước mắt của con có làm cho cây lúa trổ bông, sây hạt được đâu?\n" +
                "\n" +
                "Nghe Bụt nói thế, cô bé càng khóc to hơn. Bụt lại hỏi:\n" +
                "\n" +
                "– Con có muốn cứu lúa không?\n" +
                "\n" +
                "– Dạ, có.\n" +
                "\n" +
                "– Muốn cứu lúa, thì con phải đưa cho ta một vật gì con quý nhất.\n" +
                "\n" +
                "Cô bé nhìn áo mình thì áo nâu vá, sờ vào túi thì túi nhẵn không, nhòm vào giỏ thì giỏ chỉ có mấy con cua vừa mới bắt được. Sực nhớ đến đôi hoa tai bằng ngọc quý, cô vội gỡ ra, rồi hai tay dâng lên Bụt:\n" +
                "\n" +
                "– Thưa Bụt, con chỉ có đôi bông tai hoa dâu, mẹ con trước khi chết đã trao lại. Mẹ con dặn rằng: “Bông hoa tai ngọc này là của quý của dòng họ ta đấy”.\n" +
                "\n" +
                "Nói đến đây, cô bé ngừng lại. Bụt giục nói tiếp. Cô bé nhìn đôi hoa tai lóng lánh:\n" +
                "\n" +
                "– Mẹ con còn bảo: “Dòng họ có lời nguyền hễ ai được đeo hoa tai mà làm mất hoặc đem bán đi, thì người đó suốt đời sẽ bị dòng họ xa lánh, hắt hủi, suốt đời sẽ sống một cuộc sống lẻ loi, buồn tủi”.\n" +
                "\n" +
                "– Con đưa cho ta vật quý, con không sợ bị trừng phạt sao?\n" +
                "\n" +
                "Nhìn ruộng lúa nhà mình, nhìn cánh đồng làng, cô bé mạnh dạn thưa:\n" +
                "\n" +
                "– Ðể cứu lúa, con xin chịu trừng phạt.\n" +
                "\n" +
                "Cô bé quỳ xuống, hai tay dâng đôi hoa tai lên cho Bụt. Bụt nâng cô bé dậy, chỉ vào một đám ruộng nước, bảo:\n" +
                "\n" +
                "– Con hãy ném đôi hoa tai bằng ngọc quý này xuống ruộng kia!\n" +
                "\n" +
                "Cô bé làm ngay theo lời Bụt. Lạ chưa! Bông hoa tai sáng rực lên một mầu xanh rồi chìm xuống nước. Sau đó nổi lên một cây bèo hình hoa dâu, giống hệt hoa tai của cô bé.\n" +
                "\n" +
                "Bụt bảo:\n" +
                "\n" +
                "– Con hãy nhân cây bèo lên hàng triệu triệu cây mà bón cho lúa. Lúa sẽ xanh, hết nghẹn đòng, sây hạt, nặng bông. Con xuống ruộng, đụng vào cây bèo đi! Khi nào con làm cho cánh đồng làng này xanh tốt, dòng họ sẽ rút lời nguyền cho con.\n" +
                "\n" +
                "Dứt lời, Bụt biến mất. Cô bé xuống ruộng, đụng vào cây bèo xanh mượt. Hễ đụng vào một cây hóa thành hai, đụng vào hai cây, hóa thành bốn, đụng vào bốn cây, hóa thành tám. Thoạt đầu, cô lấy một ngón tay đụng vào bèo, dần dần lấy cả năm ngón tay rồi cả bàn tay mà nhân bèo. Cô mải mê làm đến chiều tối, bèo đã xanh kín cả ruộng. Hôm sau, cô lại đem một ít bèo sang ruộng bên cạnh, và cứ thế nhân lên.\n" +
                "\n" +
                "Ruộng nào có bèo hoa dâu, thì lúa xanh tốt, mập khỏe hẳn lên. Dân làng thấy thế, ai cũng mừng rỡ và cùng cô bé ra sức nhân bèo. Chẳng bao lâu, cả cánh đồng mênh mông được phủ một lớp bèo hoa dâu xanh mượt.\n" +
                "\n" +
                "Mùa năm ấy, lúa chín vàng trĩu hạt. Dân làng chung quanh thấy bón bèo hoa dâu lúa tốt, đến mua giống. Bèo hoa dâu dần dần lan rộng ra nhiều làng, nhiều huyện.\n" +
                "\n" +
                "Một hôm, bố nhìn hai tai cô bé, hỏi:\n" +
                "\n" +
                "– Ðôi hoa tai ngọc của con đâu rồi?\n" +
                "\n" +
                "Cô bé cúi đầu, ngập ngừng, rồi kể hết cho bố nghe câu chuyện cô ngồi Khóc thương lúa và gặp Bụt.\n" +
                "\n" +
                "Bố cảm động, ôm con vào lòng, nói:\n" +
                "\n" +
                "– Bụt nói đúng. Dòng họ, dân làng nhờ con mà được ấm no, dòng họ sẽ bỏ lời nguyền, và thương con, yêu con mãi mãi. Ngày nay, không phải chỉ có một đôi hoa tai làm đẹp cho một người mà có hàng triệu triệu hoa tai làm cho mọi người ấm no.\n" +
                "\n" +
                "Người ta kể lại rằng: sau khi cô chết, để tỏ lòng nhớ ơn cô, dân làng La Vân, tỉnh Thái Bình lập đền thờ và gọi cô là: “Bà Chúa Bèo“."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/08/Chang_coc_lay_vo_tien.jpg", "Chàng cóc", "Ngày xưa, trong một bản vắng, có hai vợ chồng nọ đã sống qua nhiều mùa nương mà chưa có con nối dòng. Họ buồn rầu như cỏ tranh già ngày nắng. Ngày ngày, người vợ thắp hương cầu khấn mong trời thương cảnh nghèo đơn chiếc ban cho một đứa con. Quả nhiên, ít lâu sau, người vợ có thai. Hai vợ chồng mừng lắm. Họ mong ngày mong đêm đứa con sớm ra đời. Nhưng chẳng may người chồng lại bị ốm rồi chết, mắt chưa được nhìn con. Người vợ rất buồn nhưng cứ nghĩ đến đứa con sắp ra đời, lòng lại nguôi nguôi.\n" +
                "\n" +
                "Mười ba lần trăng lặn rồi mười ba lần trăng mọc, đứa bé trong bụng mới tròn tháng. Không ngờ, sau một cơn đau bụng dữ dội người vợ hóa lại đẻ ra một con Cóc xấu xí. Người vợ sợ lắm nhưng không nỡ bỏ đứa con của mình. Ngày ngày bà lên rừng đào củ mài để nuôi Cóc, mong cho Cóc chóng lớn. Ngày qua tháng lại, cóc lớn dần và trở thành một chàng Cóc cường tráng. Rồi mẹ Cóc cũng lại qua đời. Từ đó Cóc phải tự mình làm lụng nuôi thân.\n" +
                "\n" +
                "Hồi ấy ở gần nhà Cóc có tên Khoàng Tý. Nhà Khoàng Tý có ba cô con gái đã đến tuổi lấy chồng. Đã bao nhiêu lần, Khoàng Tý mở hội để kén chọn con rể. Nhiều chàng trai đẹp đến để thi tài. Nhiều con nhà giàu mang trâu, ngựa đến để hỏi nhưng chưa ai làm Khoàng Tý ưng bụng. Lần ấy chàng Cóc tìm đến xin để làm con rể Khoàng Tý. Vừa thấy Cóc, Khoàng Tý đã giận dữ hét lên:\n" +
                "\n" +
                "– Con Cóc xấu xí kia, ai cho mày đến hỏi con gái ta! Có cút ngay đi không?\n" +
                "\n" +
                "Cóc vẫn bình tĩnh nói rõ ý định của mình. Khoàng Tý giận lắm, nhưng vẫn ra điều kiện:\n" +
                "\n" +
                "– Nếu mày bắn một mũi tên xuyên chín con chim mang về đây thì tao sẽ gả con gái cho.\n" +
                "\n" +
                "Chàng Cóc nhận lời, rồi mang cung tên đi, vào rừng săn chim. Hôm ấy trời nổi gió dữ dội. Lá to lá nhỏ rơi ào ào, cây đổ ngổn ngang, nhiều thú vật bị chết. Đến một gốc cây to cạnh con suối lớn, chàng Cóc thấy chín con chim bị gió bão quật chết từ lúc nào. Chàng liền nhặt lấy xâu vào một mũi tên rồi đem về dâng lên Khoàng Tý. Khoàng Tý phục chàng Cóc lắm. Nó lại ra thêm một điều kiện:\n" +
                "\n" +
                "– Lần này mày phải kiếm liền một lúc chín gánh củi về đây. Được vậy ta sẽ gả con gái cho. Nếu không tao sẽ đánh cho mày một trận.\n" +
                "\n" +
                "Khoàng Tý yên trí rằng Cóc nhỏ bé, yếu ớt thế chắc chẳng mang được chín gánh củi về cùng một lúc. Lúc ấy nó sẽ đánh cho Cóc đến chết.\n" +
                "\n" +
                "Hiểu được lòng dạ Khoàng Tý, nhưng chàng Cóc chẳng chút ngần ngại. Sáng sớm hôm sau, khi ông mặt trời chưa ngủ dậy, chàng đã sắp sẵn quang gánh, giả vờ đi vào rừng lượm củi. Một láy sau, chàng Cóc trở về nói với ba cô gái:\n" +
                "\n" +
                "– Tôi vào rừng kiếm củi chẳng may đâm phải cái gai ở đầu ngón chân cái. Đau quá tôi phải về đây nhờ ba cô nhổ giúp. Tôi nhớ ơn nhiều lắm.\n" +
                "\n" +
                "Nghe vậy, hai cô chị bĩu môi, nhổ nước bọt vào lưng Cóc rồi bỏ đi. Chỉ có cô em út là chẳng nói chẳng rằng, lặng lẽ đến khêu gai cho chàng Cóc. Cô đã khêu lâu lắm mà gai chẳng ra. Lúc bấy giờ Cóc mới bảo rằng:\n" +
                "\n" +
                "– Cô tốt bụng lắm nhưng khêu thế không được đâu! Phải cầm búa bửa mạnh thì gái mới chịu ra.\n" +
                "\n" +
                "Cô út nghe nói vậy lấy làm ngạc nhiên lắm. Nàng sợ Cóc đau nên không giám. Nàng đành phải nói cho cha biết. Mới nghe nói Khoàng Tý cũng ngạc nhiên chẳng kém gì cô con gái út. Nhưng chỉ một lúc sau Khoàng Tý lại thấy vui trong bụng. Hắn nghĩ rằng: thế thì Cóc sẽ phải chết. Hắn liền gọi người làm mang cho hắn một cái búa thật to, to nhất trong nhà. Nhìn thấy vua mang búa hằm hằm đi đến, Cóc đã biết ý ác của nhà vu. Khoàng Tý đến nơi, chẳng nói chẳng rằng cứ thế giơ búa nhằm vào đầu Cóc mà bổ thật mạnh. Chàng Cóc nhanh nhẹn lánh sang một bên và thưa:\n" +
                "\n" +
                "– Không! Tôi nhờ Khoàng Tý bổ vào ngón chân cái chứ có phải bổ bào đầu tôi đâu?\n" +
                "\n" +
                "Lần thứ hai rồi lần thứ ba, Khoàng Tý đều nhằm vào đầu Cóc mà bổ. Nhưng cả ba lần Cóc đều tránh được. Thất lạ, Khoàng Tý thầm nghĩ: “Hay ta bổ vào ngón chân cái của nó xem sao”. Khoàng Tý lền bổ mạnh vào ngón chân cái của chàng Cóc. Bổ xong, mệt quá, mồ hôi Khoàng Tý đầm đìa, mắt hoa lên. Hắn phải ngồi phịch xuống đất, nhắm mắt lại để thở. Khi mở được mắt ra thì Khoàng Tý thấy trước mặt mình chín gánh củi to và khô. Chàng Cóc bảo Khoàng Tý:\n" +
                "\n" +
                "– Đấy tôi đã mang về chín gánh củi rồi, Khoàng Tý gả con gái cho tôi đi.\n" +
                "\n" +
                "Lần này thì Khoàng Tý không thề chối cãi được nữa. Hắn đành phải gọi ba đứa con gái của mình đến và hỏi:\n" +
                "\n" +
                "– Đứa nào muốn làm vợ Cóc?\n" +
                "\n" +
                "Hai cô chị thi nhau cười giễu Cóc. Hết chê chàng da xù xì, lung gù lại chê là mùi hôi thối. Chúng không thèm trả lời, nhổ nước bọt vào lưng cóc rồi bỏ đi. Cô em út thì chẳng nói chẳng rằng cứ ngồi im lặng. Thấy vậy, Khoàng Tý bực lắm, hỏi:\n" +
                "\n" +
                "– Thế nào? Mày muốn lấy Cóc à?\n" +
                "\n" +
                "Cô gái lặng lẽ gật đầu. Cuối cùng Khoàng Tý đành phải ưng thuận cho con gái út lấy chàng Cóc xấu xí. Lúc tiễn hai vợ chồng Cóc, Khoàng Tý gọi con gái lại gần và bảo:\n" +
                "\n" +
                "– Ta sẽ đưa cho con một cái chày đá và một con ngựa, đến giữa đường, con phải ném chết cóc rồi đánh ngựa quay trờ về. Phải nhớ lời ta dặn đấy.\n" +
                "\n" +
                "Trên đường về nhà, Cóc dắt ngựa nhảy đi trước còn vợ Cóc cưỡi ngựa theo sau. Đi được một quãng xa, vợ Cóc xuống ngựa và nói với chồng:\n" +
                "\n" +
                "– Cha em không ưng bụng cho em sống cùng chàng đâu. Bụng cha em ác lắm, khác với bụng em nhiều, nhưng chàng đừng buồn, em không làm khác ý muốn của mình đâu. Nói hết câu, cô gái ném cái chày đá xuống vực rồi xuống ngựa cùng đi bộ với Cóc về nhà. Hai vợ chồng sống trong một túp lều tranh lụp xụp, rách nát. Hàng ngày, Cóc vẫn một mình phát nương làm rẫy. Vợ Cóc thương chồng lắm. Một lần nàng theo chồng đi ra nương. Đến nơi, nàng nhìn mãi mà không thấy chồng đâu, chỉ thấy một chàng trai khỏe, đẹp đang mải mê làm nương. Người vợ mải nhìn chàng trai, bàn chân vô tình đâm phải cành lá khô dưới đất. Thấy động, chàng trai lập tức chạy trốn vào một bụi cây gần đấy. Vợ Cóc lạ quá liền rượt theo, thì chẳng thấy chàng trai đâu mà chỉ thấy một con Cóc ngồi chồm chỗm dưới gốc cây mục. Vợ ra làm nương tiếp. Vừa làm, nàng vừa nghĩ; không biết chàng trai kia là ai mà lại đến nương làm hộ nhà mình.\n" +
                "\n" +
                "Ngày qua tháng lại đã đến ngày hội lớn ở trong vùng. Trai gái trong bẳn mặc những bộ váy áo thật đẹp, thật sặc sỡ để đi dự hội. Thấy mình xấu xí, Cóc không muốn đi chơi với vợ. Chàng dục vợ đi trước còn mình đi sau. Vợ Cóc đi rồi, ở nhà , Cóc liền lột vỏ biến thành một chàng trai trẻ đẹp, rồi theo đường tắt đi đến hội. Lũ làng ai cũng trầm trồ, đổ mắt nhìn về phía chàng. Khi thấy chàng đánh quay tài giỏi quá mọi người dồn đến xem chật vòng trong vòng ngoài. Con gái thì muốn được tung còn với chàng, con trai thì muốn được đọ quay với chàng. Ở trong cuộc vui mà vợ Cóc buồn lắm. Nàng chờ mãi chẳng thấy chồng đến. Nàng định bỏ về nhà, nhưng lúc đi qua đám đông nàng ghé nhìn vào chỗ người đang chơi quay thì bỗng nhận ra chàng trai phát nương ngày nào. Nàng đến gần chàng trai định hỏi chuyện thì chàng bỏ chạy về hướng nhà Cóc. Lũ làng đổ xô chạy theo sau. Mọi người vào nhà chẳng thấy chàng trai nữa, chỉ thấy một con Cóc nằm thở phì dưới gầm giường.\n" +
                "\n" +
                "Một lần khác trong vùng lại có hội. Cóc lại giục vợ đi trước. Còn mình đi sau. Lần này vợ Cóc đi đến nửa đường thì quay về nhà. Quả nhiên nàng nhìn thấy một tấm da Cóc ở dưới gầm giường. Chẳng chút chần chừ, nàng liền chạy lại cầm lấy tấm da ném vào lửa. Lúc ấy ở đám hội đang vui, tự nhiên chàng Cóc thấy người bỗng nóng rực lên, biết có chuyện xảy ra chàng bèn chạy ngay về nhà. Vừa vào đến cửa chàng đã ngửi thấy mùi khét, bèn lấy que khều đống lửa thì thây tấm da đã cháy hết. Từ đó Cóc mãi mãi hóa thành người và vợ chồng Cóc sống bên nhau đầm ấm.\n" +
                "\n" +
                "Từ ngày mất vỏ, chàng Cóc làm lụng thật vất vả. Mọi việc chàng đều phải nhờ vào hai bàn tay. Lúa trên nương của hai vợ chồng Cóc không tốt như trước nữa. Gạo trong nhà của hai vợ chồng Cóc mau hết hơn. Họ phải đi đào củ mài ở trên rừng để ăn. Một hôm chàng Cóc nói với vợ:\n" +
                "\n" +
                "– Vợ chồng mình khổ nhiều quá rồi. Bây giờ tôi không muốn nàng phải ăn củ mài ở trên rừng mãi, phải mặc áo rách mãi. Nàng ở nhà, tôi sẽ đi buôn một chuyến xa. Chỉ một lần trăng lên tôi sẽ trở về thôi!\n" +
                "\n" +
                "Thế rồi sáng hôm sau chàng Cóc từ biệt người vợ xinh đẹp ra đi, trong tay chỉ có vài đồng bạc nén. Chàng phải đi xa, xa lắm. Trên đường chàng gặp một Xê sư. Xê sư biết Cóc là người tài giỏi tốt bụng nên muốn giúp chàng đạt được ý muốn. Xê sư hỏi:\n" +
                "\n" +
                "– Chàng trai đi đây vậy?\n" +
                "\n" +
                "Chàng Cóc lễ phép cúi đầu chào rồi đáp:\n" +
                "\n" +
                "– Nhà con nghèo, con phải đi buôn một chuyến xa!\n" +
                "\n" +
                "Xê sư lại nói:\n" +
                "\n" +
                "– Thế thì con hãy đi theo ta!\n" +
                "\n" +
                "Trên đường đi, hai người gặp một dòng sông đoạn giữa trong còn ở đầu dòng và cuối dòng lại đục ngầu. Chàng Cóc lạ lắm, bèn hỏi Xê sư:\n" +
                "\n" +
                "– Tại sao lại có con sông lạ như vậy?\n" +
                "\n" +
                "Xê sư chậm rãi trả lời:\n" +
                "\n" +
                "– À phải! Làm gì có con sông lạ ấy được. Nước phải trong từ trên nguồn xuống chứ có bao giờ chỉ trong ở giữa quãng đâu.\n" +
                "\n" +
                "Hai người lại tiếp tục đi. Một lúc sau họ gặp một con chim chỉ có một chân. Thấy lạ chàng Cóc hỏi, thì Xê sư trả lời:\n" +
                "\n" +
                "– Con chim có một chân thì không thể đi được. Cũng như người ta không thể một chân mà đi lại dễ dàng.\n" +
                "\n" +
                "Chàng Cóc thấy Xê sư nói có lý thì phục lắm. Từ đó hễ trên đường gặp cái gì lạn chàng đều nhờ Xê sư bảo cho.\n" +
                "\n" +
                "Hai người đã qua bao nhiêu con sông, bao nhiêu ngọn núi. Một hôm nọ đến một bản nọ. Ở đầu bản họ thấy một cây gạo ra hoa đỏ chói trông rất đẹp mắt. Nhưng chẳng hiểu sao thân nó lại xù xì những gai. Chẳng kìm được tính tò mò, chăng Cóc lại nhờ Xê sư giải đáp giúp. Xê sư nói:\n" +
                "\n" +
                "– À có gì đâu! Cái cây đó giống như một con người tốt bụng. Bề ngoài trông xấu xí nhưng trong bụng lại không giấu con dao độc.\n" +
                "\n" +
                "Đi với chàng Cóc thêm nhiều con sông, thêm nhiều con suối nữa thì Xê sư nói với chàng:\n" +
                "\n" +
                "– Hỡi chàng trai tốt bụng! Bây giờ ta không thể cùng đi với con được nữa. Con hãy ghi vào trong đầu những điều ta đã nói với con ở dọc đường. Nó sẽ giúp con nhiều đấy.\n" +
                "\n" +
                "Nói xong Xê sư đi về một ngả, còn chàng Cóc cứ theo ngọn núi trước mắt mà đi. Chàng đi qua bản đầu tiên thì thấy một đám người đang định làm thịt con chó. Mắt nó ươn ướt như muốn nói với chàng một điều gì. Chàng Cóc thương hại con chó sắp bị làm thịt bèn bỏ một đồng bạc nén ra để mua. Con chó thoát chết mừng lắm. Nó ngoe ngẩy cái đuôi tỏ ý cám ơn chàng. Người và chó cùng đi. Đến một bản khác chàng Cóc lại thấy một con mèo xám bị nhốt vào giỏ sắp đêm thả xuống sông. Nghe tiếng kêu thảm thiết của con vật, chàng Cóc không nỡ để người ta giết nó. Chàng lại bỏ một đồng bạc nén để mua con mèo. Chó, mèo cùng chàng Cóc đi đến một cánh rừng nọ thì thấy rất nhiều người xúm quanh một con trăn lớn. Họ sắp giết chăn. Con trăn sợ lắm. Nó đang ra sức giãy giụa để mong thoát chết. Không ngần ngại chàng Cóc lại dốc cả số tiền còn lại ở trong túi để mua con trăn. Thế là số tiền mang theo không còn một xu. Chàng Cóc vui vẻ cung những con vật vừa mua được quay về nhà.\n" +
                "\n" +
                "Lại nói đến Khoàng Tý. Từ khi chia tay với con gái út, hắn tưởng con nghe theo mình giết Cóc rồi quay về. Hắn chờ đến năm lần chăng chết, rồi năm lần trăng sống vẫn chưa thấy con về. Khoàng Tý buồn rầu bèn sang nhà Cóc xưm sao. Đến nơi hắn chỉ thấy vợ Cóc ở nhà một mình, liền bắt con gái về để để gả cho con trai xú cà. Vợ Cóc khẩn khoản van nài nhưng nhà vua vẫn trợn mắt quả:\n" +
                "\n" +
                "– Bụng tao không ưng cho mày lấy thằng Cóc xấu xí ấy đâu. Mày phải lấy con xú cà thôi. Con xú cà nó có nhiều trâu, nhiều ngựa, nhiều bạc nén. Sao mày không thích giàu mà lại thích nghèo.\n" +
                "\n" +
                "Cô gái lại phân trần với vua cha:\n" +
                "\n" +
                "– Cha ơi! Cha nhầm rồi! Chồng con không phải là Cóc đâu. Chồng con là người mà.\n" +
                "\n" +
                "Nghe vậy nhà vua lại nổi cơn thịnh nộ:\n" +
                "\n" +
                "– Mày không nói lọt tai tao đâu! Bụng tao đã ưng cho mày lấy con xú cà thì mày phải nghe! Đừng nói trái lòng tao!\n" +
                "\n" +
                "Vợ Cóc khóc nhiều lắm. Nước mắt nàng chảy đã ướt hết một cái áo rồi hai cái áo, mà Khoàng Tý vẫn không chịu nghe. Tên xú cà bụng rất muốn có con gái làm vợ cho con nên nó cho mổ nhiều lợn, nhiều gà, lấy nhiều rượu, nhiều thuốc mời những kẻ giàu ở quanh vùng về ăn lễ. Nó muốn lễ cưới con nó với cô gái xinh đẹp con Khoàng Tý phải to nhất trong vùng. Chúng đang ăn uống linh đình thì đột nhiên có tiếng đập cửa thình thình. Cửa bật mở, chàng Cóc lừng lững bước vào trong nhà. Chúng vừa ngạc nhiên vừa tức nhưng vẫn phải mời chàng Cóc ăn cơm. Khi mời rượu khách, chủ nhà rót quanh một lượt riêng chàng Cóc thì nó bỏ qua. Chàng Cóc giận lắm, nhớ đến lời Xê sư dặn trên đường, chàng nói:\n" +
                "\n" +
                "– Nước đục phải đục từ trên nguồn xuống, có bao giờ chỉ đục quãng giữa đâu?\n" +
                "\n" +
                "Chẳng biết nói thế nào, bọn chúng phải rót rượu mời chàng. Lúc cầm đũa để gắp thức ăn, chàng Cóc chỉ thấy một chiếc. Chàng cố ghìm lòng nói to:\n" +
                "\n" +
                "– Chim chỉ có một chân thì làm sao đi được, người cũng thế? Sao chỉ cho ta một chiếc đũa để ăn.\n" +
                "\n" +
                "Lại một lần nữa chúng chịu thua chàng. Vừa lúc ấy vợ chàng Cóc từ trong nhà bước ra. Đầu nàng đội chiếc khăn thêu nhiều màu sặc sỡ, người nàng mặc bộ quần áo mới rất đẹp. Trông nàng như một bông hoa mới nở. Thấy vậy chàng Cóc cất tiếng hỏi:\n" +
                "\n" +
                "– Nàng ở nhà có chuyện gì không hay vậy?\n" +
                "\n" +
                "Vợ Cóc vừa khóc vừa kể hết đầu đuôi sự việc cho chồng mình nghe. Bấy giờ chàng Cóc mới hiểu tất cả bụng dạ cú cáo của Khoàng Tý. Chàng tìm lời an ủi vợ:\n" +
                "\n" +
                "– Thôi! Nàng đừng khóc nữa. Tôi đã mua chó và mèo về rồi. Nàng mang chúng vào nhà đi. Tôi phải ra đầu làng dắt con trăn về đã.\n" +
                "\n" +
                "Khi chàng Cóc đi tới nơi buộc trăn lúc sáng thì lạ quá, nhìn quanh chẳng thấy trăn đâu cả, chỉ có một cô gái đẹp đang nở miệng cười. Chàng Cóc hỏi:\n" +
                "\n" +
                "– Hỡi cô gái đẹp ơi! Cô có thấy con trăn của tôi buộc ở đây không?\n" +
                "\n" +
                "Cô gái mỉn cười đáp:\n" +
                "\n" +
                "– Con trăn của chàng chính là em đây!\n" +
                "\n" +
                "Chàng Cóc rất ngạc nhiên. Chàng mở mắt to nhìn cô gái đẹp. Thấy vậy, cô gái nói thêm:\n" +
                "\n" +
                "– Em là con gái thứ sáu, con gái út của Be dòng đấy. Hôm nọ trời đẹp em lên trần chơi chẳng may gặp đoàn đi săn, họ bắt em định thịt. Hôm ấy nếu không được chàng cứu thì em không nói được nữa rồi! Em biết ơn chàng lắm. Bây giờ chàng xuống chơi nhà em đi, đường dễ đi thôi!\n" +
                "\n" +
                "Chàng Cóc rất thương vợ. Chàng muốn ở nhà với vợ nhưng lại muốn biết nhà của Be dòng đẹp như thế nào nên chàng ưng thuận đi theo. Đến một hồ nước rộng, trong xanh, cô gái xinh đẹp chỉ tay xuống mặt nước và bảo:\n" +
                "\n" +
                "– Nhà cha em ở dưới này! Giờ chàng nhắm mắt lại và cầm chặt lấy thắt lưng em. Khi nào em bảo mở mắt thì chàng mới được mở.\n" +
                "\n" +
                "Cô gái còn dặn thêm:\n" +
                "\n" +
                "– Xuống đó, khi về thế nào cha mẹ em cụng tạ ơn chàng đã cứu sống em. Chàng chớ có lấy vàng bạc mà hãy xin chiếc đuôi cá bằng vàng treo ở giữa nhà ấy. Nó sẽ giúp chàng ước gì được nấy.\n" +
                "\n" +
                "Chàng Cóc làm theo lời dặn của cô gái. Chàng nhắm mắt lại và nắm chặt lấy thắt lưng cô gái. Khi mở mắt ra chàng thấy mình đang ở trong một ngôi nhà lớn có nhiều lợn gà, vàng bạc. Cô gái kể đầu đuôi câu chuyện cho cha mình nghe. Be dòng niềm nở đón tiếp chàng. Be dòng dọn cho chàng ăn những thức ăn ngon nhất nơi thủy cung. Rồi cô gái lại dẫn chàng đi xem những cảnh đẹp. Sống được ít ngày, chang Cóc thấy nhớ vợ và xin Be dòng trở lại cõi trần. Be dòng biết không thể giữa chàng ở lại thủy cung, liền bảo chàng:\n" +
                "\n" +
                "– Hỡi chàng trai tốt bụng, chúng tôi không biết lấy gì đền ơn lòng tốt đã cứu con ta, chàng muốn gì ta sẽ tạ ơn!\n" +
                "\n" +
                "Chàng Cóc nhìn quanh nhà Be dòng, rồi thưa:\n" +
                "\n" +
                "– Tôi chỉ muốn xin chiếc đuôi cá vàng kia.\n" +
                "\n" +
                "Be dòng bằng lòng, lấy đuôi cá vàng trao cho chàng Cóc, rồi cả nhà cùng ra tiễn chàng lên bờ, chúc chàng hạnh phúc, muốn gì được nấy.\n" +
                "\n" +
                "Chàng Cóc nhắm mắt lại và nhờ cô gái xinh đẹp đưa lên bờ. Về đến nhà, theo lời dặn của cô gái, chàng Cóc tự tay đóng một cái bàn xinh xắn. Đóng xong, chàng gọi vợ đến và quét xuôi đuôi cá ba lần lên mặt bàn. Một mâm cơm ngon, đầy rượu thịt hiện ra. Hai vợ chồng cùng ăn uống vui vẻ. Sau đó chàng lại qué ba lần lên mặt bàn. Lập tức một tòa nhà bằng vàng óng ánh, cùng không biết bao nhiêu trâu, bò, lơn, gà hiện ra. Từ đấy cuộc sống của hai vợ chồng Cóc trở nên sung sướng, hạnh phúc.\n" +
                "\n" +
                "Còn Khoàng Tý, khi tan bữa tiệc cưới ít hôm, có người vào báo có chuyện lạ là vợ chàng Cóc vẫn không chịu về làm vợ con nhà xú cà. Không những thế chàng Cóc lại vừa mới xây xong một tòa nhà bằng vàng rất đẹp. Khoàng Tý lúc đầy không tin, đến tận nơi xem thì quả đúng như vậy. Hắn trở về và đem những điều mắt thấy tai nghe thuật lại cho vợ và hai cô con gái cả. Chúng không tin. Vợ Khoàng Tý bèn tới nơi để xem thử. Đến nhà con gái, mụ thấy hai vợ chồng chàng Cóc béo khỏe, xinh đẹp, sống rất sung sướng trong một tòa nhà lộng lẫy bằng vàng. Vợ chồng Cóc ra tận cổng đón mụ. Ở nhà vợ chồng Cóc, mụ vợ Khoàng Tý được ăn những thúc ngon lạ bấy nay chưa hề thấy. Rồi mụ lại còn được thấy những của cải quí của con gái. Máu tham nổi lên che hết đầu hết mặt. Mụ gạn hỏi vợ chồng Cóc.\n" +
                "\n" +
                "– Sao các con lại kiếm được những của hiếm này?\n" +
                "\n" +
                "Chàng Cóc thật bụng kể lại mọi chuyện chuyện cho mụ nghe. Khi đã biết được nhiều bí ẩn, vợ Khoàng Tý vội vã ra về. Mụ đi nhanh như gió thổi, như có con ma đuổi sau lưng. Vừa về đến nhà, mụ liền gọi chồng đến nhỏ to thuật lại mọi chuyện. Khoàng Tý nghĩ vợ mình nói dối nên lại sai hai con gái đến nhà vợ chồng Cóc. Hai cô chị trở về đều nói đúng như lời mụ. Khoàng Tý vẫn chưa tin. Hắn muốn tự mình đến nơi xem hư thực lần nữa. Ngay sáng hôm sau, hắn vội vã đến nhà vợ chồng con gái út. Hắn trở về nhà vừa lúc hai cô con gái cả của hắn vừa chết. Chẳng là, hai cô chị thấy chồng em mình giàu quá, đẹp quá liền tìm cách giết em gái để cướp chồng. Nhưng cô cả lại sợ cô thứ hai tranh mất nên tìm cách hại em. Hôm đó chúng dủ nhau đi tắm, thấy em sơ ý, cô cả liền đẩy em xuống sông, rồi chạy vào rừng định tìm hái lá ngón về giết em út. Nhưng vừa vào đến rừng chưa kịp hái thì đã bị một con rắn độc bò đến cắn chết tươi.\n" +
                "\n" +
                "Lòng vợ chồng Khoàng Tý rất buồn vì một lúc mất hai đứa con. Nhưng bụng nó vẫn không muốn bỏ chiếc đuôi cá bằng vàng của vợ chồng Cóc. Khoàng Tý mở kho lấy vàng rồi truyền lệnh cho thợ đánh ngày đêm bằng một chiếc đuôi cá y như chiếc đuôi cá thần của chàng Cóc. Đuôi cá được làm xong, Khoàng Tý hí hửng mang sang nhà chàng Cóc. Cũng như lần trước hai vợ chồng Cóc đón tiếp cha thật chu tất. Họ không thể ngờ được mưu gian của Khoàng Tý. Lừa lúc vợ chồng Cóc đi ngủ Khoàng Tý bèn đánh tráo đuôi cá thần. Sáng hôm sau hắn giả vờ buồn bã chào vợ chồng Cóc rồi ra về. Từ ngày cướp được đuôi cá vàng, Khoàng Tý đã giàu càng giàu thêm. Suốt ngày Khoàng Tý ăn uống no say, hết ở nhà vàng này lại sang ở nhà vàng khác. Hắn bắt đuôi cá làm việc liên tục, làm ra bao nhiêu của cải cho hắn.\n" +
                "\n" +
                "Còn vợ chồng chàng Cóc từ khi mất đuôi cá thần thì trở lại nghèo đói như xưa. Họ làm việc suốt ngày mà bụng vẫn không đủ no, áo mặc vẫn bị rách. Một hom chàng Cóc bàn với vợ:\n" +
                "\n" +
                "– Mình nhịn đói lâu rồi, trong nhà lại chẳng còn cái gì bán được. Hay ta mang chó, mèo đi đổi lấy gạo ăn vậy.\n" +
                "\n" +
                "Nghe thấy chủ bàn thế, chó và mèo buồn lắm. Chúng không muốn xa hai vợ chồng người chủ tốt bụng nên năn nỉ xin chàng Cóc cho được sống và hứa đi lấy đuôi cá vàng thần về cho chàng.\n" +
                "\n" +
                "Hai con rủ nhau đi. Chúng chạy suốt ngày suốt đêm không nghỉ. Tới nhà Khoàng Tý, mèo bảo chó:\n" +
                "\n" +
                "– Anh chó ơi! Anh ở đây rình bắt lấy con chuột chúa nhé! Tôi sẽ vào xua nó ra. Khoảng Tý để đuôi cá thần trong hòm, ta phải bắt chuột cắn thủng hòm mới lấy được.\n" +
                "\n" +
                "Chó gật đầu đồng ý. Nó nấp một chỗ kín để rình. Chỉ sau một lần nguẩy đuôi, chó đã thấy đàn chuột nhốn nháo chạy quàng chạy xiên ra ngoài. Chó nhảy xổ tới ngoạm lấy con chuột chúa. Mèo nhanh chân lẹ làng nhảy đến túm lấy chú chuột đang run lẩy bẩy mà bảo:\n" +
                "\n" +
                "– Mày muốn sống thì hãy đi gọi cả họ nhà mày đến đây để vào khoét bằng được cái hòm quí trong buồng Khoàng Tý.\n" +
                "\n" +
                "Chuột run sợ nhận lời. Chỉ một lát sau bao nhiêu chuột to, chuột nhỏ, chuột đực, chuột cái kéo về lúc nhúc trước mặt chó và mèo. Mèo bảo con chuột chúa:\n" +
                "\n" +
                "– Chúng mày hãy vào cắn thủng hòm của Khoàng Tý rồi lấy chiếc đuôi cá bằng vàng ra đây cho tao thì sẽ được tha chết!\n" +
                "\n" +
                "Chuột chúa vội vã vâng lời và nhảy đi trước. Theo sau nó là những chú chuột cường cháng nhanh chân nhất. Lúc ấy, Khoàng Tý đang cùng vợ ăn cơm trong nhà nghe thấy tiếng chuột cắn liền bảo vợ:\n" +
                "\n" +
                "– Bà vào đuổi chuột đi kẻo nó cắn thủng chiếc hòm đựng đuôi cá vàng mất.\n" +
                "\n" +
                "Ngay lúc đó mèo đứng ở góc nhà kêu lớn “meo meo!” làm cho vợ Khoàng Tý yên lòng bảo chồng:\n" +
                "\n" +
                "– Sợ gì, đã có mèo rồi!\n" +
                "\n" +
                "Chuột thay nhau hì hục khoét hòm. Chẳng mấy chốc hòm thủng, họ hàng nhà chuột khéo léo lôi đuôi cá vàng ra ngoài. Mèo ngoạm ngay lấy đuôi cá thần, tha chết cho họ hàng nhà chuột rồi nhẹ nhàng chạy ra cửa sau ra đường.\n" +
                "\n" +
                "Giữa lúc hai vợ chồng chàng Cóc đang than thở về người cha độc ác và thân phận nghèo đói của mình thì nghe thấy tiếng chó sủa ngoài bìa rừng. Biết là mèo và chó đã trở về, chàng Cóc vội ra đón. Mèo mừng rỡ trao đuôi cá thần cho chủ. Chàng Cóc cám ơn hai con vật tốt bụng rồi lấy đuôi cá vàng ra quét đi quét lại vài lần trên mặt bàn. Lập tức bao nhiêu thức ăn ngon hiện ra, rồi cả nhà cao cửa rộng, trâu ngựa béo khỏe cũng hiện ra. Từ đó hai vợ chồng chàng Cóc lại sống một cuộc sống no đủ sung sướng bên cạnh chó và mèo.\n" +
                "\n" +
                "Còn vợ chồng Khoàng Tý sáng ra thấy đói định mở hòm lấy đuôi cá vàng thì chẳng thấy đâu. Chúng tiếc ngẩn tiếc ngơ đến đứt ruột mà chết."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/09/anh-hoc-tro-va-ba-con-quy-01-640x440.jpeg", "Anh học trò và ba con quỷ", "Ngày xửa ngày xưa, ở một vùng nọ có đôi vợ chồng nhà một phú hộ tuổi cũng đã khá cao mãi mới sinh được một mụn con gái. Vì khó sinh và gia đình cũng chỉ có mỗi một đứa con nên hai vợ chồng phú hộ hết mực cưng chiều.\n" +
                "\n" +
                "Cô gái đến tuổi con gái thì dung nhan đẹp đẽ, ít ai sánh bằng, vợ chồng phú hộ lại càng nâng niu cô như vàng như ngọc. Họ bỏ rất nhiều tiền ra xây riêng cho cô con gái một ngôi lầu để ở, khi lầu được xây xong, hai vợ chông phú hộ lại thuê người đi khắp nơi tìm những loại hoa thơm nhất để trung xung quanh khu vườn để con gái thưởng ngoạn.\n" +
                "\n" +
                "Vào thời gian ấy, trong khi rừng sâu gần đó có xuất hiện ba con cáo sống đã mấy trăm năm nên hóa thành quỷ, chúng có rất nhiều phép biến hóa và thường xuyên có thói hại con người. Khi chúng nghe được tin phú ông đang cho người đi tìm các loại hoa thơm để trồng cho khu vườn trong chiếc lầu mới xây của cô con gái xinh đẹp, chúng đã bèn tính kế hại cô con gái của phú ông.\n" +
                "\n" +
                "Chúng cùng nhau sử dụng phép thuật hóa thành một loại hoa rất lạ và đặc biệt. Bông hoa có 3 cánh, một cách mầu đỏ, một cánh mầu xanh và cánh còn lại mầu trắng. Một người tiều phu lên rừng kiếm củi thấy loại hoa đẹp chưa từng thấy bao giờ bèn đánh về bán cho vợ chồng Phú hộ lấy chút tiền. Khi tiều phu đưa cho vợ chồng phú hộ xem, họ ưng ngay và quyết định mua chúng để đem về chồng ở vườn.\n" +
                "\n" +
                "Tuy nhìn những bông hoa ba màu này rất đẹp nhưng cô con gái phú hộ lại không thích, thế là mưu kế của ba con quỷ bất thành. Lâu ngày, hoa dần dần tàn và héo, lũ quỷ cũng sắp sửa bỏ đi nơi khác. Giữa lúc ấy, người làm của phú hộ đang tìm kiếm một khúc gỗ để đẽo thành then cửa chốt ở cửa buồng của cô gái. Ba con quỷ liền biến thành một khúc gỗ đẹp, thấy thớ gỗ đẹp người làm không ngần ngại chọn để đẽo.\n" +
                "\n" +
                "Vậy là mưu kế hãm hại của lũ quỹ cũng đã thành công một phần. Sau đó mấy hôm, một đêm khi cô con gái phú hộ đang ngủ say thì một con quỷ từ chiếc then cửa chui ra, trèo lên giường để sinh sự với cô. Cô gái chống cự rất quyết liệt và kêu la inh ỏi. Biết là không xong, con quỷ hớp lấy hồn của cô gái rồi lại biến vào chiếc then cửa.\n" +
                "\n" +
                "Khi vợ chồng và người làm của gia đình phú hộ chạy vào phòng cô con gái xem thì thấy cô đang nằm thiêm thiếp trên giường và giống như người đã chết, ngực cô vẫn thoi thóp đập nhưng lay mãi mà cô vẫn không tỉnh lại.\n" +
                "\n" +
                "Tưởng con gái mình bị bênh nặng, vợ chồng phú hộ cho người đi mời thầy lang đến chữa trị cho cô con gái nhưng thầy chưa kịp tới thì đến buổi tối ngày hôm sau, khi phú hộ đang ngồi bên cạnh giường con một mình để chăm sóc thì con quỷ thứ hai trong chiếc then cửa chui ra và hớp luôn hồn của ông. Tối hôm sau nữa thì con quỷ thứ ba đã hớp hồn một người làm trong nhà.\n" +
                "\n" +
                "Bà vợ của phú hộ kinh hãi vội cho người đi mời một thầy phủ thủy giỏi nhất làng đến để trừ tà ma quỷ dữ. Thầy phù thủy lập đàn làm phép liên tục trong 3 ngày 3 đêm liền thì phú hộ và người hầu tỉnh lại. Chỉ còn cô con gái bị con quỷ đầu đàn nhập vào nó quyết không chịu buông tha. Thầy phù thủy đã giở hết phép thuật nhưng con quỷ hình như chả hề hấn gì, cuối cùng thầy cũng đành phải bất lực cáo từ vì phép thuật đã hết mà cô gái vẫn lịm đi trên giường, mơ mơ tỉnh tỉnh. Từ đó người ta kháo nhau rằng ngôi nhà đó có quỷ nên bặt không một ai dám tới gần.\n" +
                "\n" +
                "Một ngày nọ, có một chàng trai tuấn tú lên Long đang trên đường đi thi hội, tới đây thì lỡ độ đường, trời cũng đã bắt đầu sẩm tối. Thấy có ngôi nhà đẹp, anh ghé vào xin nghỉ nhờ một đêm. Thấy có người xin ngủ nhờ, hai vợ chồng phú ông kể lại cho Long câu chuyện mà gia đình ông đang gặp phải, kể xong phú ông nói:\n" +
                "\n" +
                "– Chuyện là như vậy đó, tôi sợ anh ở lại đây bị lũ quỷ quấy nhiễu, chi bằng anh tìm nhà khác mà ở tạm không kẻo lại rước họa vào thân.\n" +
                "\n" +
                "Long nói với vợ chồng phú ông rằng:\n" +
                "\n" +
                "– Tôi là người đọc sách thánh hiền, không có yêu tinh ma quỷ nào dám trêu ghẹo. Ông bà cứ yên tâm cho tôi nghỉ nhờ đêm nay, biết đâu tôi lại đánh đuổi được lũ ma quỷ trừ nạn cho gia đình.\n" +
                "\n" +
                "Vợ chồng phú ông thấy anh chàng nói vậy nên đành đồng ý. Sau khi dùng xong bữa cơm chiều, Long khoan thai bước lên phòng. Anh chỉ xin phú ông cho mượn một ngọn đèn để đọc sách đêm và một con dao sắc đề phòng lũ quỷ tới hăm dọa. Màn đêm buông xuống, Long thắp đèn ngồi trước án thư đọc, con dao anh luôn để bên cạnh mình. Trời dần về khuya, canh 3 đã đến một con quỷ từ then cửa buồng cô gái chui ra biến thành một cô gái vô cùng xinh đẹp và quyến rũ. Long vẫn điềm nhiên ngồi đọc sách, không thèm để ý. Biết không dùng được cách này, nó biến lại vào trong then cửa. Lần tiếp theo, con quỷ thứ hai chui ra tiến tới Long với vẻ ngoài kinh dị và hung tợn, áo trắng xóa, tóc xõa ra, đôi mắt đỏ lòm, lưỡi thè ra dài ngoẵng. Nó chạm vào người Long nhưng anh vẫn mặc kệ thi gan với nó, biết không dọa được Long nó lại trở lại chui vào then cửa. Đến lần thứ ba, lần này là con quỷ đầu đàn đang nhập vào cô gái bước vào hù dọa. Thấy bóng chàng học trò, nó chỉ kịp thét lên vài tiếng rồi bỏ chạy:\n" +
                "\n" +
                "– Có bậc quý nhân, chúng mày chạy mau!\n" +
                "\n" +
                "Lần này, Long cầm con dao chạy tới nhanh như cắt chém nó một nhát, con quỷ đứt lìa một chân. Long chạy theo con quỷ đầu đàn tới cửa buồng cô gái thì thấy cả 3 con chui vào chiếc then cửa để lẩn trốn. Anh cầm chân con quỷ lên xem thì hóa ra nó là chân cáo. Vì bị một nhát chém đau đớn, con quỷ đầu đàn phải thả hồn cô gái ra, cô gái dần dần tỉnh lại. Long tới gần hỏi chuyện, biết anh chàng học trò là người cứu mình cô cúi đầu chào và cảm ơn anh. Long dìu cô gái tới gặp vợ chồng phú hộ, mang chiếc chân quỷ cho mọi người xem, ai nấy cũng đều thán phục anh học trò tài giỏi.\n" +
                "Sáng hôm sau, Long lại lên đường lên kinh ứng thí. Vợ chồng phú hộ có tặng cho anh rất nhiều vàng bạc nhưng anh không nhận một món nào, anh chỉ xin họ cái then cửa buồng cô con gái rồi dắt vào lưng mang theo. Đi được nửa ngày đường, anh thấy 3 con quỷ từ chiếc then hiện ra quỳ lạy trước mặt xin anh tha tội bỏ lại chiếc then cửa. Long cười và nói:\n" +
                "\n" +
                "Không thể được! Giờ chúng mày có phép thuật tài cáng gì thì cứ giở hết ra cho tao xem, sau đó tao sẽ cho chúng mày vào lửa.\n" +
                "\n" +
                "Ba con quỷ quỳ lạy khẩn khoản:\n" +
                "\n" +
                "– Xin ngài hãy tha cho chúng tôi, chúng tôi có rất nhiều vật quý dâng lên ngài, chỉ xin ngài tha mạng.\n" +
                "\n" +
                "Long đáp:\n" +
                "\n" +
                "– Vậy chúng mày hãy đưa hết cả ra đây, nếu không thì đừng có trách tao vô tình.\n" +
                "\n" +
                "Con quỷ thứ nhất lấy ra một cái mặt trời đựng trong túi đưa cho Long và nói:\n" +
                "\n" +
                "– Nếu đêm xuống, hễ cứ rút mặt trời ra khỏi túi thì trời sẽ sáng như ban ngày, đút nói lại vào túi thì trời sẽ tối như cũ.\n" +
                "\n" +
                "Con thứ hai lấy ra một cái mặt trăng đưa cho Long và nói:\n" +
                "\n" +
                "– Có mặt trăng này, hễ cứ đêm đến mà lôi nó ra thì không cần phải dùng tới đèn đuốc.\n" +
                "\n" +
                "Còn con quỷ thứ ba tặng cho Long một con ngựa mỗi ngày nó có thể chạy tới cả ngàn dặm mà không mệt. Long vui mừng nhận 3 món quà của 3 con quỷ và vứt chiếc then cửa vào một bụi rậm bên vệ đường.\n" +
                "\n" +
                "Sau đó Long nhảy lên lưng ngựa và hô:\n" +
                "\n" +
                "– Ngựa hãy cho ta tới kinh đô\n" +
                "\n" +
                "Lập tức, con ngựa hí lên một tiếng phi nhanh như tên bay chân không chạm mặt đất. Chỉ một lát sau, nó đã đưa anh tới cổng của hoàng thành. Long tìm một ngôi nhà trọ chuẩn bị mọi thứ để chuẩn bị cho kì thi còn vài ngày nữa là diễn ra.\n" +
                "\n" +
                "Ba ngày sau, cuộc thi bắt đầu, Long làm bài thi rất tốt cho nên vừa thi xong buổi sáng, anh nhớ tới vợ mình. Sẵn có con ngựa quý chạy nhanh như gió, anh nhảy lên lưng bảo nó chở anh về quê nhà. Ngựa phóng nước đại, chỉ chập tối anh đã tới nơi. Anh khẽ gọi cửa vợ, người vợ vừa chợp mắt tỉnh dậy rất kinh ngạc khi thấy chồng minh vừa đi thi được mấy ngày nay đã quay trở về. Long không muốn đánh thức cha mẹ dậy nên dặn vợ giấu kín chuyện này, hai vợ chồng cả đêm trò chuyện to nhỏ rồi trời hửng sáng Long lại lên ngựa trở về kinh thi.\n" +
                "\n" +
                "Mặc dù đêm ấy, hai vợ chồng đã trò chuyện rất nhỏ nhưng tiếng rì rầm vẫn làm thức tỉnh cha mẹ Long ở buồng kế bên. Hai ông bà không hề biết là con trai mình về mà chỉ nghĩ chắc con dâu mình có nhân tình phản bội con trai. Cho nên sáng hôm sau khi tỉnh dậy, lúc ấy Long đã phi ngựa trở về kinh, hai ông bà vào buồng gặn hỏi con dâu.\n" +
                "\n" +
                "Vợ Long nghe lời chồng bảo giữ kín chuyện nhưng sau biết không giữ được nữa nên đành phải nói hết toàn bộ chuyện đêm qua cho bố mẹ chồng nghe, cùng với việc chồng mình diệt trừ quỷ và được chúng tặng 3 vật quý để xin tha mạng. Nhưng hai ông bà sao lại có thể tin một câu chuyện lạ lùng và khó tin đến thế nên họ mắng trách cô con dâu một cách thậm tệ, đổ cho cô là phản bội chồng mình. Vợ của Long vì không thể minh oan cho mình được nên cô chỉ biết ngồi ôm mặt khóc nức nở. May hôm đó chiều Long lại phi ngựa về, được tận mắt thấy con trai mình trở về với con ngựa thần, hai ông bà mới tin cô con dâu nói thật. Long kể lại chuyện cho bố mẹ cùng nghe:\n" +
                "\n" +
                "– Sáng hôm nay, khi cha mẹ chưa thức dậy thì con vội lên ngựa vào kinh, vừa vào đến kinh thì cũng là lúc loa trường thi bắt đầu xứng tên những người thi đậu. Khi con nghe thấy tên mình, con mừng quá vội tới nhà trọ thu xếp hành lý, trả tiền trọ và phi ngựa thẳng về nhà. Ba ngày nữa con lại phải lên kinh để còn dự buổi yến tiệc cho nhà vua chiêu đãi các ông nghè ở điện thiên quang.\n" +
                "\n" +
                "Nghe thấy con kể con ngựa thần có thể ngày chạy cả ngàn dặm, người cha ngỏ ý muốn được cưỡi thử một lần. Long hỏi cha:\n" +
                "\n" +
                "– Cha muốn đi chơi đâu xa?\n" +
                "\n" +
                "Người cha đáp:\n" +
                "\n" +
                "– Cha muốn được vào tận Đồng Nai, Gia Định chơi một chuyến\n" +
                "\n" +
                "Long nói:\n" +
                "\n" +
                "– Được cha\n" +
                "\n" +
                "Sáng hôm sau, cơm nước xong xuôi, ông già nai nịt chỉnh tề bước ra sân. Long cầm chiếc dây cương trao cho cha mình. Ông vừa hô một tiếng “Gia Định”, lập tức con ngựa phi như gió phóng đi vùn vụt. Cho tới tận lúc mặt trời bắt đầu khuất núi, nó lại phóng như tên bay đưa ông trở về tới tận giữa sân nhà. Ông mở tay nải lấy quà ông mua ở Gia Định cho mọi người ăn thử, rồi kể những chuyện tai nghe mắt thấy ở vùng đất ông vừa du ngoạn.\n" +
                "\n" +
                "Mẹ Long thấy chồng ca ngợi ngựa thần đi nhanh, bà cũng ngỏ ý muốn được đi chơi Gia Định một chuyến cho biết. Sáng hôm sau, Long dắt ngựa ra sân rồi đỡ mẹ ngồi lên yên. Nhưng ngựa chưa kịp bước đi thì nó đã ngã khụy xuống đất hất mẹ Long ngã lăn xuống sân, từ trong con ngựa, một làn khói trắng bay ra cuộn lên trời cao. Mọi người chạy lại thì con ngựa đã chết. Thì ra mẹ Long đã cưỡi ngựa không đúng thời điểm, bà cưỡi đúng lúc bà bị kinh nên ngựa thần hoảng sợ bỏ lốt ngựa bay về trời.\n" +
                "\n" +
                "Mất đi ngựa quý, Long còn đang có nguy cơ đứng trước một tội “khi quân” vì chỉ còn một ngày nữa là đại tiệc nhà vua mở sẽ diễn ra, đường từ nhà lên kinh cũng phải mất hai ngày trời nếu cưỡi ngựa. Không còn cách nào khác, Long lập tức lên kinh với một con ngựa thường mà không kịp từ biệt vợ con.\n" +
                "\n" +
                "Con ngựa phi tới tối mịt mà vẫn chưa đi được nửa đường. Nằm nghỉ tại một quán trọ ven đường, Long rất lo lắng. Chợt anh nhớ tới túi mặt trời mà con quỷ thứ nhất tặng, anh liền nghĩ ra một diệu kế. Ngày hôm sau, Long lại cho ngựa phi nước đại tới kinh thành, nhưng cứ hễ khi mặt trời sắp khuất núi là anh liền lôi mặt trời trong túi ra treo trước đầu ngựa. Một điều kì lạ đã sảy ra từ trước chưa từng có, đâu đâu cũng không thấy tắt ánh mặt trời. Cho tới khi con ngựa đưa Long tới trước điện thiên quang, Long mới cất mặt trời của mình vào túi, khi ấy trời lại tối sẩm chuyển sang đêm.\n" +
                "\n" +
                "Long buộc ngựa vào cột rồi nhanh chân bước vào điện, nhưng cũng đã quá trễ. Mọi người ngồi đợi mãi không thấy đêm buông xuống, thức ăn thì đã nguội cả, sau cùng nhà vua lệnh cho mọi người cứ 4 người một mâm bắt đầu tiệc. Khi Long bước vào thì bữa tiệc cũng đã gần tàn, biết việc đến trễ có thể khiến mình tội rơi đầu nên anh cỡi mũ “phủ phục” trước sân điện, anh lấy lý do mãi không thấy trời tối để mong vua giảm nhẹ tội. Nhà vua tha tội cho anh nhưng để anh biết lỗi của mình, vua đã của nhiệm anh về làm tri huyện cho một huyện mà đã có rất nhiều vụ án ma không thể lý giải. Mặc dù anh nghe được rất nhiều lời đồn ra đồn vào rằng hễ cứ ai được bổ nhiệm tới vùng này làm tri huyện là y như rằng sẽ bị ma quỷ hành hạ đến chết nhưng anh vẫn ung dung nhận chỉ của vua.\n" +
                "\n" +
                "Theo phong tục tập quán ở vùng này thì hễ mỗi khi có quan mới để bổ nhiệm là nhân dần trong huyện đều phải mang lễ vật tới để chào vị quan mới. Cho nên những ngày đầu mới về nhận chức tri phủ, dân làng rồng rắn nhau mang lễ vật tới đầy cả công đường. Long vui vẻ tiếp chuyện dân làng nhưng anh nhất quyết từ chối không nhận mọi lễ vật. Anh dặn dò kín đáo quân lính rằng cứ mỗi khi toán dân nào ra về thì bám theo họ để biết rõ tung tích. Đến ngày thứ 3, một trong những người lính mà Long phái âm thầm đi theo gót chân hai người dân đội một mâm lễ trở về. Người lính này theo mãi, theo mãi, bóng chiều đã ngả mà vẫn không thấy họ tới nơi. Cho tới khi ánh mặt trời tắt hẳn mới thấy họ tiến sát tới một chiếc giếng hoang bên cạnh đường. Đột nhiên họ đội cả mâm lễ xuống dưới giếng rồi biến mất trước sự kinh hãi của người lính. Anh ta vội chạy trở về để báo lại tình hình cho quan tri huyện biết."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/tichchu1-660x440.jpg", "Cậu bé Tích Chu", "Ngày xưa, có một bạn tên là Tích Chu. Bố mẹ Tích Chu mất sớm, Tích Chu ở với bà.\n" +
                "\n" +
                "Hàng ngày bà phải làm việc quần quật kiếm tiền nuôi Tích Chu, có thức gì ngon bà cũng dành cho Tích Chu. Ban đêm, khi Tích Chu ngủ thì bà thức quạt. Thấy bà thương Tích Chu, có người bảo:\n" +
                "\n" +
                "– Bà ơi! Lòng bà thương Tích Chu cao hơn trời, rộng hơn biển. Lớn lên, Tích Chu sẽ không khi nào quên ơn bà.\n" +
                "\n" +
                "Thế nhưng lớn lên, Tích Chu lại chẳng thương bà. Bà thì suốt ngày làm việc vất vả, còn Tích Chu suốt ngày rong chơi. Vì làm việc vất vả, ăn uống lại kham khổ nên bà bị ốm. Bà lên cơn sốt nhưng chẳng ai trông nom. Tích Chu mãi rong chơi với bạn bè, chẳng nghĩ gì đến bà đang ốm. Một buổi trưa, trời nóng nực, cơn sốt lên cao, bà khát nước quá liền gọi:\n" +
                "\n" +
                "– Tích Chu ơi, cho bà ngụm nước. Bà khát khô cổ rồi!\n" +
                "\n" +
                "Bà gọi một lần, hai lần…rồi ba lần nhưng vẫn không thấy Tích Chu đáp lại. Mãi sau Tích Chu thấy đói mới chạy về nhà kiếm cái ăn. Tích Chu ngạc nhiên hết sức thấy bà biến thành chim và vỗ cánh bay lên trời. Tích Chu hoảng quá kêu lên:\n" +
                "\n" +
                "– Bà ơi! Bà đi đâu? Bà ở lại với cháu. Cháu sẽ mang nước cho bà, bà ơi!\n" +
                "\n" +
                "– Cúc cu … cu! Cúc … cu cu! Chậm mất rồi cháu ạ, bà khát quá không thể chịu nổi phải hóa thành chim để bay đi kiếm nước. Bà đi đây, bà không về nữa đâu!\n" +
                "\n" +
                "Nói rồi chim vỗ cánh bay đi. Tích Chu hoảng quá chạy theo bà, cứ nhằm theo hướng chim bay mà chạy. Cuối cùng Tích Chu gặp chim đang uống nước ở một dòng suối mát. Tích Chu gọi:\n" +
                "\n" +
                "– Bà ơi! Bà trở về với cháu đi. Cháu sẽ đi lấy nước cho bà, cháu sẽ giúp đỡ bà, cháu sẽ không làm bà buồn nữa!\n" +
                "\n" +
                "– Cúc …cu…cu, muộn quá rồi cháu ơi! Bà không trở lại được nữa đâu!\n" +
                "\n" +
                "Nghe chim nói, Tích Chu òa khóc, Tích Chu thương bà và hối hận. Giữa lúc đó, có một bà tiên hiện ra, bà bảo Tích Chu:\n" +
                "\n" +
                "– Nếu cháu muốn bà trở lại thành người thì cháu phải đi lấy nước suối Tiên cho bà cháu uống. Đường lên suối Tiên xa lắm, cháu có đi được không?\n" +
                "\n" +
                "Nghe bà Tiên nói, Tích Chu mừng rỡ vô cùng, vội vàng hỏi đường đến suối Tiên, rồi chẳng một phút chần chừ, Tích Chu hăng hái đi ngay.\n" +
                "\n" +
                "Trải qua nhiều ngày đêm lặn lội trên đường, vượt qua rất nhiều nguy hiểm, cuối cùng Tích Chu đã lấy được nước suối mang về cho bà uống. Được uống nước suối Tiên, bà Tích Chu trở lại thành người và về ở với Tích Chu.\n" +
                "\n" +
                "Từ đấy, Tích Chu hết lòng yêu thương chăm sóc bà."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/01/201408151358480003928_su_tich_ong_binh_voi_web-449x440.jpg", "Sự tích ông bình vôi", "Ngày xưa, có một người con gái con một nhà giàu có. Cô rất đẹp nhưng cũng rất kiêu. Cô đã từng làm cho các bạn gái xa lánh mình. Cô làm cho các chàng trai ghét cô vô hạn. Cũng vì thế đến tuổi lấy chồng, cô gái vẫn chưa có đám nào vừa ý. Chàng trai nào cũng bị cô sổ toẹt, vì cao chê ngỏng, thấp chê lùn, lớn chê béo trục béo tròn, gầy chê xương sống xương sườn bày ra.\n" +
                "\n" +
                "Nhưng rồi cô cũng lấy được chồng. Chồng cô yêu vợ nhưng lại bực mình vì thói ghen của vợ. Cô ghen chồng làm cho xóm giềng luôn cau mặt vì những lời qua tiếng lại của họ. Cuối cùng hai người không vừa ý nhau và ly dị. Buồn bực vì duyên phận, cô bỏ đi tu.\n" +
                "\n" +
                "Cô xuất gia ở một ngôi chùa cổ trên núi suốt hai mươi năm. Những con chim, con thú rừng hầu như quen thuộc bóng dáng của người sư nữ. Hai mươi năm qua, cô vẫn chưa đắc đạo. Cô thắc mắc, vì tự cho mình thông kinh kệ hơn người và chịu đủ mọi sự khổ hạnh của nhà chiền. Một ngày kia cô quyết định sang Tây trúc một phen để tìm cho ra lẽ. Đường sang Tây-trúc thiên nguy vạn hiểm nhưng cô quyết định đi cho bằng được.\n" +
                "\n" +
                "Một hôm, sau khi vượt qua một trái núi, sư nữ tìm vào một ngôi nhà hẻo lánh dọc đường để nghỉ chân. Hai mẹ con chủ nhân tuy người rừng núi quê mùa nhưng vốn là kẻ ăn chay niệm Phật, nên thấy khách là nhà tu hành thì tiếp đãi rất hậu. Khi được nghe kể công trình tu luyện của sư nữ họ càng cung kính, coi như bậc thầy. Và khi biết rõ ý định của sư nữ thì họ cũng xin phép bỏ nhà bỏ cửa đi theo thầy để mong được đắc dạo. Nghe họ câu khẩn, sư nữ cười: – Hai mẹ con nhà này cũng muốn thành Phật ư? Được, cứ đi theo ta!. Nhưng bụng nàng bảo dạ: – “Chuông khánh còn chẳng ăn ai, nữa là mảnh chĩnh vứt ngoài bờ tre”.\n" +
                "\n" +
                "Từ hôm đó nhà sư có thêm hai người bạn đồng hành. Chân bớt mỏi, đường bớt dài, họ đi chả mấy chốc đã tới đất Thánh. Từ trước đến sau, hai mẹ con nhà nọ vẫn cung kính, coi sư nữ như thầy. Còn sư nữ đối với họ không được như trước: – Không biết chừng họ được thành Phật trước ta. Họ sẽ hơn ta… Bọn này mà đắc đạo, thật là một điều nhục cho Thiền môn.\n" +
                "\n" +
                "Nói chuyện đức Phật khi vừa nghe tin có người tìm đường đến Tây-trúc cầu đạo, vội hóa thân đi theo dõi. Từ đầu đến cuối, đức Phật vẫn không bỏ sót một lời nói, một cử chỉ nào của sư nữ. Khi họ sắp qua một con sông rộng, đức Phật hóa phép hiện ra ở bên kia bờ một tòa cổ tự, trước cửa có một cây bồ đề rất lớn, để chờ họ.\n" +
                "\n" +
                "Muốn cho hai mẹ con khỏi lẽo đẽo theo mình đến đất Thánh, nên khi qua sông sư nữ giả cách ngạc nhiên, chỉ ngôi chùa và ngôi đền mà bảo rằng:\n" +
                "\n" +
                "– Kìa, chúng ta đã tới Tây trúc. Chóng thật! Chính là cây bồ đề của đức Thế Tôn tu luyện ngày xưa. Thôi! Hai mẹ con cứ việc trèo lên một cành cao niệm kinh rồi buông tay rơi xuống là tức khắc thành Phật!.\n" +
                "\n" +
                "Tin tưởng ở lời nói của bậc thầy, hai mẹ con mừng rỡ làm theo không chút ngần ngại. Nhưng khi họ buông tay cho người rơi xuống thì đức Phật đã đón họ đưa lên trời. Có bốn vị La hán mang tòa sen đến rước đi. Tay hai mẹ con vẫy vẫy như có ý gọi người bạn đồng hành.\n" +
                "\n" +
                "– “Đúng là họ thành Phật rồi!. Sư nữ vừa kinh ngạc vừa mừng, vội trèo lên cây để làm như họ và để mong được như họ. Nhưng đức Phật đã có ý trừng phạt người đàn bà kiêu ngạo và độc ác ấy một cách đích đáng, nên đã để cho cái xác rơi phịch xuống đất, tan xương vỡ sọ. Và sau đó đức Phật lại bắt con người khốn nạn ấy hóa thành bình vôi. Tại sao lại cho hóa thành bình vôi? Có người bảo chính là đức Phật muốn bắt những kẻ trong lòng bất nhân, nhưng lại đeo bộ dạng từ bi, phải để cho người đời luôn luôn móc ruột.\n" +
                "\n" +
                "Một truyện khác nhiều tính chất phật thoại cũng nói về sự tích ông bình vôi:\n" +
                "\n" +
                "Có một anh ăn trộm từng sống bao nhiêu năm với nghề. Hắn ta không vợ con gia sản, chỉ độc có một túp lều bên cạnh đường cái. Một hôm, có cặp vợ chồng người ăn mày qua đó xin trú chân. Hắn cho họ ở lại và sau đó hắn thấy chồng bảo vợ: – “Hôm nay không xin được tí gì cả. Gần đây có một nương khoai, chờ đến tối tôi sẽ đào trộm về ăn”. Vợ can chồng: – “Thôi đi ông! Chỉ vì kiếp trước chúng ta ăn ở thất đức nên mới như thế này. Có lẽ nào phạm thêm vào cho nặng tội kiếp sau. Tôi thà chết không ăn trộm!”.\n" +
                "\n" +
                "Người ăn trộm nghe chuyện bỗng dưng hối hận. Cuối cùng hắn giao tất cả nhà cửa cho hai vợ chồng người ăn mày rồi bỏ di. Hắn tìm đến một ngôi chùa trên núi cao xin hòa thượng cho cạo đầu tu hành. Người ta giao cho hắn công việc nấu ăn: một bữa phải nấu từ tinh sương và một bữa từ chiều. Phận sự của hắn là giữ lửa không được để tắt, vì một lần tắt lửa thì lại phải xuống núi xin về, cách xa hàng bao nhiêu dặm.\n" +
                "\n" +
                "Từ lúc nhận việc nhà chùa, hắn tỏ ra chu đáo lạ thường, chưa có bữa nào để lửa tắt. Một sư bác trên chùa ghét chú tiểu mới, bèn chờ một hôm tiểu ta ngủ say, tưới tắt lửa nhấm ở bếp.\n" +
                "\n" +
                "Gần sáng, chú tiểu dậy thấy không còn lửa, nghĩ đến phận sự, vội vã ba chân bốn cẳng vượt mấy khu rừng tìm xuống làng xin lửa. Giữa đường hắn gặp một con cọp già đòi ăn thịt. – “Tôi vui lòng để ngài xơi thịt – hắn nói – nhưng hãy cho tôi chạy xuống làng xin lửa cho nhà chùa, rồi tôi sẽ tới nộp mạng”.\n" +
                "\n" +
                "Cọp bằng lòng để cho đi. Khi đưa được lửa về, hắn kể sự tình và xin phép hòa thượng cho đi nộp mình cho cọp. Đến nơi, cọp bảo: – “Tao già rồi, răng đã rụng hết mà xương của mày cứng khó nhai. Vậy mày hãy trèo lên cây kia buông mình rơi xuống cho gẫy xương, tao mới ăn được”. Hắn vâng lời cọp, nhưng khi buông tay thì đức Phật đã đón sẵn rước lên trời, độ cho thành Phật, tức là Phật Nhiên Đăng.\n" +
                "\n" +
                "Vị sư bác kia thấy chú tiểu chỉ bằng vài hành động đơn giản mà được  thành chính quả thì cũng muốn được như thế. Hắn bèn xin phép hòa thượng cho mình ra đương việc nấu ăn và giữ lửa. Thế rồi một hôm hắn cũng giả tảng để cho lửa tắt, rồi cũng chạy xuống núi xin lửa. Và hắn cũng gặp cọp, cũng khất cọp xin đưa lửa về cho nhà chùa dùng rồi sau đó sẽ xin nộp mình. Nhưng đức Phật vốn hiểu rõ những việc làm của hắn xuất phát từ tấm lòng không thực, nên khi hắn trèo lên cây và buông tay, thì Phật lập tức bắt hắn hoá thành bình vôi.\n" +
                "\n" +
                "Một dị bản của truyện trên cũng là một phật thoại, là Sự tích cái ống nhổ.\n" +
                "\n" +
                "Ở đây cũng có hai nhân vật chính là chú tiểu và sư bác. Chú tiểu mới đi tu nhưng rất chăm chỉ, biết lo lắng làm tròn chức trách. Thấy lửa ở đống nhấm tắt (kỳ thực là do sư bác ghen tỵ phun nước cho tắt), tiểu không nề hiểm nguy chạy xuống núi vào lúc mờ sáng để có lửa về kịp nấu ăn cho nhà chùa. Phật hiện ra với trạng mạo một ông già khuyên can chú tiểu đừng đi, nhưng thấy chú cương quyết đi, bèn bảo chú trèo lên cây buông tay xuống, sẽ có kẻ đưa đi an toàn. Quả nhiên chú tiểu buông tay rơi đúng trên lưng một con muông; nó đưa chú xuống làng, rồi sau khi xin được lửa lại đưa về vô sự.\n" +
                "\n" +
                "Sư bác vốn không phải là chân tu, nhưng thấy chú tiểu gặp Phật, cũng muốn được như vậy, bèn cũng xin ra làm công việc nấu ăn và giữ lửa, sau đó hắn đã để tắt lửa và cũng được gặp Phật. Nhưng khi buông tay thì Phật đã bắt hắn hoá thành cái ống nhổ, miệng luôn luôn há ra cho người ta khạc nhổ vào, để tỏ lòng khinh bỉ."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/09/su-tich-hoa-%C4%91%E1%BA%A1i.jpg", "Sự tích hoa đại", "Từ thuở xa xưa, có hai mẹ con sống rất nghèo, hằng ngày phải đi làm mướn để kiếm bữa ăn tạm qua ngày. Cậu bé chỉ mới lên mười, dù rất thương mẹ nhưng em đành phải xa mẹ đi ở cho một lão nhà giàu chuyên nghề mổ lợn.\n" +
                "\n" +
                "Ngày ngày, lão đồ tể bắt em lên rừng hái củi để đun nước giết lợn, cạo lông. Những ngày đầu lên rừng, em còn phải đi theo các bác đốt than để khỏi phải lạc đường, rồi sau đó em tự đi một mình. Cứ vài ngày một lần, em đi đường vòng xa hơn để ghé qua nhà thăm mẹ cho đỡ nhớ. Nhân tiện, em để cho mẹ một mớ củi và một ít sim rừng, ổi rừng.\n" +
                "\n" +
                "Một hôm, em đang chặt củi ở bên sườn núi thì bỗng thấy một con hươu con bị sa xuống hố. Chú hươu con lo lắng và kêu lên một cách tuyệt vọng. Chú cứ mở to đôi mắt, ngẩng đầu lên nhìn quanh như đợi mẹ mình đến cứu. Chú bé cũng nhìn quanh tìm kiếm xem có hươu mẹ ở đâu đây không, nhưng chỉ thấy cây rừng và tiếng gió thổi xào xạt. Em liền lần xuống hố ẵm chú hươu con lên. Thấy có người, lúc đầu chú hươu con sợ sệt né tránh, nhưng chỉ một lúc, chú để yên cho cậu bé vuốt ve. Cậu bứt một ít cỏ non cho hươu con ăn, rồi lại bẻ một miếng cơm từ nắm cơm – bữa trưa ít ỏi của mình chấm muối bón thử cho hươu ăn. Hươu con chưa quen ăn cơm, nhưng hình như rất thích vị mằn mặn của muối. Cậu bé rất muốn đem hươu con về nhà mẹ nuôi nhưng sợ lão chủ biết. Còn nếu đem về nhà lão đồ tể, chắc chắn lão sẽ thịt hươu con mất, bởi lão vẫn thường nói với mọi người rằng lão rất thèm thịt hươu. Cậu có ý trông đợi hươu mẹ trở lại để giao hươu con vì không ai là không muốn sống với mẹ. Cậu nhủ thầm với con hươu mà như là nói với chính mình vậy.\n" +
                "\n" +
                "Trời đã xế chiều nhưng vẫn không thấy hươu mẹ đâu cả, cậu bé đành tìm một cái hang nhỏ, cho hươu con vào đó và lấy đá chặn kín lại.\n" +
                "\n" +
                "– Ngày mai ta sẽ lên với hươu con! Hươu con đừng lo, cứ ngủ cho ngon nhé! – Cậu bé nói.\n" +
                "\n" +
                "Hôm sau, cậu bé lại lên rừng. Em thở phào mừng rỡ khi thấy hươu con vẫn còn đó. Gặp lại em, hươu con tỏ vẻ mừng rỡ, cứ lấy mũi ngửi ngửi vào tay em.\n" +
                "\n" +
                "– À! Mày muốn ăn cơm với muối chứ gì? – Cậu bé bẻ một miếng cơm chấm vào muối rồi bón cho hươu con, sau đó đi hái cỏ non cho nó. Trong lúc chặt củi, em cho hươu con đứng bên cạnh. Có hươu con, em chặt củi không biết mệt một chút nào cả. Từ đó, cậu bé và hươu con trở thành đôi bạn thân, ngày nào cũng gặp nhau, chỉ có đêm là cả hai đành phải tạm xa nhau. Thương hươu con không có mẹ nên quấn quít với mình, nhiều đêm em nằm mơ gặp hươu con và đùa giỡn với nó. Một đêm nọ, lão đồ tể thức dậy ra sân xem trời gần sáng chưa để giết lợn. Bỗng hắn nghe ở dưới bếp tiếng cậu bé đang nằm nói mê rất rõ như đang thức:\n" +
                "\n" +
                "– Hươu à, hươu ăn chóng lớn, hươu mọc đôi sừng thật cao, thật đẹp nhé!\n" +
                "\n" +
                "Lần ấy lão không để ý mấy, nhưng sau đó lão nghe bọn người làm mách là cậu bé cứ thường nói mê như thế. Lão đồ tể cau mày nghĩ bụng:\n" +
                "\n" +
                "– Biết đâu thằng bé gặp hươu thật!\n" +
                "\n" +
                "Thế là lão sai người nhà lén theo cậu lên rừng. Hắn chứng kiến cảnh em cùng chú hươu con gặp nhau và quấn quýt bên nhau suốt ngày nên liền về mách với lão chủ. Lão chủ liền nói:\n" +
                "\n" +
                "– Đúng vậy thì ngày mai tao sẽ đi xem, chúng mày theo tao bắt cho kỳ được con hươu đem về.\n" +
                "\n" +
                "Hôm sau, cậu bé lại lên rừng và mong gặp hươu con biết bao. Chỉ trong một thời gian ngắn, hươu con đã to lớn trông thấy và ngày càng tỏ ra khôn ngoan hơn. Hình như cậu bé nói gì, nghĩ gì, hươu con đều hiểu được cả và ngoan ngoãn làm theo. Nhưng hôm đó, khi em vừa đón hươu con từ trong hang ra, chưa kịp cho ăn, thì lão đồ tể cùng hai tên người làm ập tới chỗ hươu đứng. Cậu bé đành quát to:\n" +
                "\n" +
                "– Chạy đi hươu ơi! Chạy đi!\n" +
                "\n" +
                "Thấy hươu còn chần chừ, cậu bé bèn phát vào cổ nó một cái thật mạnh và quát:\n" +
                "\n" +
                "– Chạy nhanh đi!\n" +
                "\n" +
                "Hươu con hiểu ý phóng như bay vào rừng. Lão đồ tể và hai tên người làm đuổi theo nhưng không kịp. Hươu con đã phóng mất dạng khiến bọn họ không biết đâu mà tìm. Lão đồ tể giận lắm, quay lại đánh cậu bé một trận. Trong cơn điên tiết, lão lấy một hòn đá nện vào lưng cậu. Không may hòn đá đánh trúng vào đầu khiến cậu bé ngã lăn ra nằm không động đậy. Lão đồ tể bỏ mặc em giữa rừng, cùng hai tên người làm trở về nhà. Hươu con chạy rất xa, lên đỉnh đồi nhìn xuống. Thấy lão đồ tể độc ác cùng hai tên người làm đã về thật rồi, hươu con chạy xuống với người bạn thân thiết của mình. Hươu con hà hơi ấm vào lưng và ngực của cậu bé. Một lúc sau, cậu bé tỉnh dậy. Thấy hươu con, cậu mừng quá, ôm lấy cổ hươu mà khóc.\n" +
                "\n" +
                "– Không có hươu thì ta chết mất rồi!\n" +
                "\n" +
                "Thế là người và hươu kéo nhau đi sang khu rừng khác, tránh ngày mai lão đồ tể có thể đưa người và chó lên lùng sục. Phải đi nhanh thật xa nơi này. Nghĩ vậy, dù trời đã tối và đau đớn khắp người, nhưng cậu bé và hươu con vẫn nương vào nhau mà đi nhanh. Vết thương trên đầu đau nhức nhưng muốn cứu hươu và cứu mình, cậu bé cố bước đi. Đến những lúc mệt quá, cậu lại ngồi bệt xuống cỏ nghỉ ngơi. Lúc đó, hươu con lại quấn quýt bên cạnh như vỗ về, an ủi và lại hà hơi ấm vào lưng và ngực cho cậu. Hôm sau, lão đồ tể đưa người và chó lên thật. Nhưng lùng sục mãi, lão vẫn không tìm thấy hươu và cậu bé đâu cả nên đành hậm hực trở về. Cậu bé ở với hươu mấy ngày liền trong khu rừng sâu và tự tìm lá để chữa vết thương. Cả người và hươu cố kiếm quả rừng, cỏ rừng để ăn tạm. Nhưng được mấy ngày nhớ mẹ quá, cậu bé nói với hươu con rằng:\n" +
                "\n" +
                "– Hươu ơi, ta nhớ mẹ quá. Ta muốn về thăm nhà một bữa rồi sẽ trở lên ngay với hươu.\n" +
                "\n" +
                "Hươu con như hiểu ý của cậu bé. Nó mở to đôi mắt nhìn người chủ nhỏ và rơm rớm nước như đang khóc, rồi gật đầu liền mấy cái. Hươu con đưa người chủ nhỏ ra tận bìa rừng, sau đó đứng trên một hòn đá to nhìn theo cho đến khi dáng nhỏ nhắn của cậu bé khuất hẳn.\n" +
                "\n" +
                "Cậu bé về gặp mẹ và biết được cách đây vài hôm, lão đồ tể có sai người đến dò hỏi cậu có trốn về không. Mẹ cậu không hề hay biết cậu đã bị lão đánh suýt chết. Cậu bé về lần này đúng vào dịp người chú chèo thuyền thuê cũng ghé về thăm nhà. Nghe cậu kể chuyện, người chú liền nói:\n" +
                "\n" +
                "– Đã vậy thì cháu nên đi theo chú. Chú sẽ giúp cháu ăn học nên người.\n" +
                "\n" +
                "Nhưng cậu bé lo lắng nói:\n" +
                "\n" +
                "– Nhưng còn hươu con thì sao?\n" +
                "\n" +
                "– Hươu con ở trong rừng thì cháu cần lo gì?\n" +
                "\n" +
                "– Cháu đã hẹn với hươu con là sẽ trở lại với nó mà!\n" +
                "\n" +
                "– Hươu làm sao hiểu được lời người nói?\n" +
                "\n" +
                "– Chú ơi, nó hiểu được đấy! Nó tiễn cháu đi và còn khóc nữa kia mà!\n" +
                "\n" +
                "– Thì cháu cứ theo chú ăn học. Ngày sau khôn lớn trở về, lúc đó cháu gặp lại hươu con vẫn không muộn mà.\n" +
                "\n" +
                "– Liệu hươu con có chờ cháu không?\n" +
                "\n" +
                "– Có chứ! Nó khôn vậy thì nó sẽ biết chờ.\n" +
                "\n" +
                "– Cháu chỉ thương nó sống một mình như thế thì sẽ buồn lắm!\n" +
                "\n" +
                "– Cháu đừng lo! Rồi nó sẽ tìm bầy đàn của nó để sống mà.\n" +
                "\n" +
                "– Nhưng như thế nó có quên cháu không?\n" +
                "\n" +
                "– Nó thương cháu nhiều như thế thì chắc sẽ không quên cháu đâu.\n" +
                "\n" +
                "Không biết làm gì hơn, cậu bé đành nghe theo lời dỗ dành của chú và mẹ. Ngay tối hôm đó, người chú ra đi cho kịp ngày hẹn với chủ thuyền. Và cũng đêm đó, cậu bé ngồi ở đầu mũi thuyền nhìn về hướng núi cao và nói vọng lên “Hươu con ơi! Hươu chờ ta nhé! Ta sẽ về, và sẽ đưa hươu xuống dưới này sống với mẹ con ta”.\n" +
                "\n" +
                "Lòng cậu bé muốn vậy, nhưng cuộc đời đâu phải muốn gì được nấy. Cậu bé đi với chú mình, và được ông gửi cho đi học ở một ông đồ nghèo nhưng rất thương người. Và trong một chuyến đi xa, thuyền của chú cậu bé bị đắm và ông mãi mãi không trở về nữa. Cậu bé được ông đồ nuôi dạy, nhưng từ đó phải ở luôn với ông. Đường về quê mẹ xa quá, cậu càng nhớ thương mẹ gấp bội. Sau đó vài năm, cậu nghe tin mẹ mình đã mất. Hết thương mẹ, cậu lại nhớ đến hươu. Chú hươu con ngày nào không biết bây giờ đã lớn và đã nhập đàn sống với đồng loại chưa? Chú hươu con còn nhớ mình hay đã quên rồi?\n" +
                "\n" +
                "Nhưng con hươu không quên. Nó vẫn nhớ người bạn, người chủ nhỏ của mình. Hằng ngày nó vẫn đến nơi chia tay với cậu bé để ngóng trông người bạn đã từng hứa sẽ trở lại với mình, nhưng chẳng thấy bóng dáng đâu cả. Nhiều năm trôi qua, hươu lớn lên, sừng bắt đầu mọc. Đôi sừng ngày càng to lớn, nhưng chú hươu vẫn hiền lành như xưa. Hươu vẫn luôn mong chờ người bạn cũ của mình. Nhưng đời hươu không dài bằng đời người được.\n" +
                "\n" +
                "Bây giờ hươu đã trở thành con hươu đầu đàn. Một hôm, hươu bỗng gặp một đoàn người đốt than. Hươu muốn đến gần nhưng rất ngại họ. Chờ cho đến khi mọi người về hết, hươu mới rời đàn, một mình đến gần chỗ họ đã ngồi trước đó. Trông thấy một ít muối rơi vãi dưới đất, hươu nếm vị mằn mặn của muối mà bỗng nhớ người bạn của mình khôn tả xiết. Thế là, nó để bầy đàn lại cho một con hươu khác dẫn đầu, rồi một mình tìm đến chốn cũ, nơi có cái hang năm xưa hươu đã sống ở đó hằng ngày và chờ cậu bé. Cái hang vẫn như xưa và nó sống quanh quẩn ở đó. Bấy giờ cỏ mọc quanh miệng hang um tùm và hươu mỗi ngày một già đi. Đến một ngày nọ, mặt trời sắp lặn, hươu già nằm xuống, giấu mình trong bụi rậm ở ngay bên cạnh hang và chết. Lúc này, người bạn của hươu đang ở một nơi rất xa và đã có vợ con. Một hôm, thấy người đi bán sừng hươu, anh bỗng nhớ lại chuyện cũ và kể cho vợ con nghe. Anh nhắc lại câu nói năm xưa mỗi khi cho hươu ăn:\n" +
                "\n" +
                "– Hươu à, hươu ăn chóng lớn, hươu mọc đôi sừng thật cao, thật đẹp nhé!\n" +
                "\n" +
                "Đứa con lập tức đòi bố đưa về thăm quê, viếng mộ bà và lên rừng tìm xem chú hươu còn không? Thương con, nhớ mẹ và nhớ hươu, anh liền thu xếp đưa vợ con về quê. Về đến làng xưa, hỏi ra mới biết lão đồ tể độc ác một hôm dẫn chó lên rừng đi săn đã bị rắn độc cắn chết. Sau khi thăm mộ mẹ xong, anh liền đưa con lên rừng. Thỉnh thoảng cơn gió rừng thổi thoang thoảng đem lại mùi hương vừa gần gũi, vừa xa xôi như chào đón như dẫn đường anh. Theo mùi hương, hai bố con đến ngay cái hang ngày xưa mà anh đã giấu chú hươu con. Cả hai bố con chợt sửng sốt và đứng im lặng mãi với cảnh tượng trước mắt. Bên cạnh miệng hang mọc lên một loài cây lạ và đang nở đầy hoa. Mùi hương của nó thật đậm đà. Nhìn kỹ thì cành cây rất giống sừng hươu. Lúc đó, có mấy người đốt than đi ngang. Họ kể rằng, trước đây ngay tại chỗ cây hoa đang nở, có một con hươu già từ đâu không biết, đến ở đó rồi nằm chết luôn. Sau đó, ở gần miệng hang bỗng mọc lên loài cây này, lá to giống tai hươu và cành giống sừng hươu. Người bố nghe nói, liền đoán ngay đấy là chú hươu con ngày xưa. Thì ra chú vẫn nhớ tới người bạn nhỏ của mình và vẫn chờ đợi mình. Lòng đầy ân hận, anh liền nói:\n" +
                "\n" +
                "– Hươu ơi, ta muốn về với hươu nhưng nào có được. Dù sao bây giờ ta cũng đã gặp lại nhau.\n" +
                "\n" +
                "Hai bố con cùng khấn xin hươu cho mình mang giống cây lạ về quê trồng, và để luôn nhớ tới hươu. Ngày nay, loài cây trổ hoa có cành giống như sừng hươu ấy được gọi là cây hoa Đại. Có người bảo, chữ Đại là từ chữ Đợi, chờ đợi mà có."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/cay-tre-tram-dot-660x440.jpg", "Cây tre trăm đốt", "Ngày xưa, có một ông già nhà quê có một cô gái đẹp. Trong nhà phải thuê một đầy tớ trai, ông ta muốn lợi dụng nó làm việc khỏi trả tiền, mới bảo nó rằng: “Mày chịu khó làm ăn với tao rồi tao gả con gái cho”. Người ở mừng lắm, ra sức làm lụng tới khuya không nề hà mệt nhọc. Nó giúp việc được ba năm, nhà ông ta mỗi ngày một giàu có.\n" +
                "\n" +
                "Ông nhà giàu không còn nghĩ đến lời hứa cũ nữa, đem con gái gả cho con một nhà phú hộ khác ở trong làng.\n" +
                "\n" +
                "Sáng hôm sắp đưa dâu, ông chủ gọi đứa ở lên lừa nó một lần nữa, bảo rằng: “Bây giờ mày lên rừng tìm cho ra một cây tre có trăm đốt đem về đây làm đũa ăn cưới, thì tao cho mày lấy con gái tao ngay”.\n" +
                "\n" +
                "Đứa ở tưởng thật, vác dao đi rừng. Nó kiếm khắp nơi, hết rừng này qua rừng nọ, không tìm đâu thấy có cây tre đủ trăm đốt. Buồn khổ quá, nó ngồi một chỗ ôm mặt khóc. Bỗng thấy có một ông lão râu tóc bạc phơ, tay cầm gậy trúc hiện ra bảo nó: “Tại sao con khóc, hãy nói ta nghe, ta sẽ giúp cho”. Nó bèn đem đầu đuôi câu chuyện ông phú hộ hứa gả con gái cho mà kể lại. Ông lão nghe xong, mới bảo rằng: “Con đi chặt đếm đủ trăm cái đốt tre rồi đem lại đây ta bảo”.\n" +
                "\n" +
                "Nó làm theo y lời dặn, ông dạy nó đọc: “Khắc nhập, khắc nhập” (vào ngay, vào ngay) đủ ba lần, thì một trăm khúc tre tự nhiên dính lại với nhau thành một cây trẻ đủ một trăm đốt. Nó mừng quá, định vác về, nhưng cây tre dài quá, vướng không đi được. Ông lão bảo nó đọc: “Khắc xuất, khắc xuất” (ra ngay, ra ngay) đúng ba lần thì cây tre trăm đốt lại rời ra ngay từng khúc.\n" +
                "\n" +
                "Nó bèn bó cả lại mà gánh về nhà. Đến nơi thấy hai họ đang ăn uống vui vẻ, sắp đến lúc rước dâu, nó mới hay là ông chủ đã lừa nó đem gả con gái cho người ta rồi. Nó không nói gì, đợi lúc nhà trai đốt pháo cưới, bèn đem một trăm khúc tre xếp dài dưới đất, rồi lẩm bẩm đọc: “Khắc nhập, khắc nhập” cho liền lại thành một cây tre trăm đốt, đoạn gọi ông chủ đến bảo là đã tìm ra được, và đòi gả con gái cho nó. Ông chủ lấy làm lạ cầm cây tre lên xem, nó đọc luôn: “Khắc nhập, khắc nhập”, thì ông ta bị dính liền ngay vào cây tre, không làm sao gỡ ra được. Ông thông gia thấy vậy chạy đến, định gỡ cho, nó lại đọc luôn: “Khắc nhập, khắc nhập”, thì cả ông cũng bị dính theo luôn, không lôi ra được nữa.\n" +
                "\n" +
                "Hai họ thấy thế không còn ai dám lại gần nó nữa. Còn hai ông kia không còn biết làm thế nào đành van lạy xin nó thả ra cho. Ông chủ hứa gả con gái cho nó, ông thông gia xin về nhà ngay, nó để cho cả hai thề một hồi rồi nó mới đọc: “Khắc xuất, khắc xuất” thì hai ông rời ngay cây tre, và cây tre cũng rời ra trăm khúc.\n" +
                "\n" +
                "Mọi người đều lấy làm khiếp phục đứa ở, ông chủ vội gả con gái cho nó, và từ đó không còn dám khinh thường nó nữa."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/thay-lang-bat-dac-di-660x440.jpg", "Thày lang bất đắc dĩ", "Ở làng kia có một người nung đất làm chén đĩa tên là Tâm, sống với mẹ già. Trong làng cũng có cô Thắm khá xinh đẹp, nên một thanh niên trong làng ve vãn cô, chọc ghẹo cô, đòi lấy cô làm vợ. Một hôm chàng ghẹo cô ngay ngoài đường, Tâm thấy thế, cầm đá ném vào bụi rậm gây tiếng động để giải thoát cô Thắm. Người thanh niên quyền thế kia để bụng trả thù.\n" +
                "\n" +
                "Một hôm có tiếng loa gọi “ai có tài chữa bệnh, mời đến dinh quan tuần phủ chữa bệnh cho vợ ông”. Người thanh niên kia gài bẫy cho lính đến bắt người nung đất về chữa bệnh. Dù hết sức từ chối, lính cứ lôi anh ta đi. Vào dinh anh ta chối không biết chữa nên bị quan tuần đánh đòn, đau quá anh ta phải liều. Anh ta vào phòng bệnh nhân, biết là bị hóc xương cá. Anh ta vén quần lộ chỗ vừa bị đánh bầm tím , kêu xuýt xoa, người nhà và bệnh nhân cười rũ. Anh ta xin muối xát vào mông cho tan chỗ bầm, xót quá, anh ta la lối, bệnh nhân cười tới ho sặc sụa, cục xương hóc bật rớt ra. Anh ta bất đắc dĩ nhận tiếng khen và phần thưởng.\n" +
                "\n" +
                "Quan tuần phủ lại giới thiệu thầy thuốc bất đắc dĩ này cung vua, chữa bệnh cho công Chúa. Công Chúa không rõ mắc bệnh gì mà không nói. Vua phán: “Nếu làm cho công Chúa nói được 3 câu sẽ được trọng thưởng và được lấy nàng”.\n" +
                "\n" +
                "Vào cung vua, anh ta lấy gạo vo sạch, rồi bắc lên bếp trên kiềng 2 chân nên nồi cứ đổ hoài, công Chúa đi qua, thấy gai mắt, công Chúa nói: “Anh kia sao ngu quá vậy, thêm một chân nữa đi”. Anh chàng nghe theo, nồi không đổ nữa. Anh chàng lấy viên đá cuội đánh vào nhau để lấy lửa nhưng không để mồi, công Chúa thấy ngứa mắt lại nói câu thứ hai:”Đặt bùi nhùi vào đi”. Lần thứ 3 công Chúa lại nói:”đặt một cây đũa vào đi, người gì ngu chịu không nổi”. Vua rất vui mừng thấy công Chúa đã nói.\n" +
                "\n" +
                "Nhưng Vua thấy thầy lang nghèo quá nên tính rút lời không gả công Chúa cho anh ta. Sau cùng anh ta vâng lời đi chữa bệnh cho dân làng nếu không sẽ bị vua chém đầu.\n" +
                "\n" +
                "Tới đình làng, anh ta bảo những ai không phải bệnh nan y thì ra về. Người ta ra về rất đông. Anh ta nói:”Cần một người bị bệnh nặng nhất để thiêu sống”. Không ai chịu ra, mọi người từ chối ra về, không ai muốn chết.\n" +
                "\n" +
                "Vua khen, nên đã gả công Chúa cho anh ta, nhưng anh ta xin phép từ chối để về làng lấy cô Thắm.\n" +
                "\n" +
                "Lúc ấy, anh thanh niên quyền thế lại tới ve vãn cô, đang lúc đó Tâm về, hô lính đến giải cứu. Chàng này xấu hổ chạy mất dạng. Thế là Tâm và cô Thắm đẹp đôi."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/09/c%E1%BB%91-gh%C3%A9p-640x440.jpg", "Cố Ghép", "Ngày xưa, ở dưới chân núi Hồng-lĩnh về phía Đông nam, có một xóm nhỏ gồm mấy gia đình đánh cá. Họ luôn sống giữa những tiếng gầm thét của sóng biển. Nhưng không may, một ngày kia, một trận bão lớn đã cuốn đi khá nhiều nhân mạng cùng thuyền mảng và lưới chài xuống thuỷ phủ. Những người sống sót hết đường sinh nhai, đành rủ nhau ngày ngày lên núi kiếm củi đem về bán ở chợ. Đó là nghề ít vốn nhất nhưng lại là nghề mệt nhọc nhất đối với họ, vì sườn núi phía họ ở mọc dựng đứng như bức tường, muốn leo núi với gánh củi trên vai không thể không đi đường vòng ngoắt ngoéo qua bao nhiêu thôn xóm khác. Thành ra, rừng thì gần nhưng đường thì lại quá xa. Cho nên mọi người ước làm sao có một con đường từ xóm thẳng lên núi để đi được nhanh chóng.\n" +
                "\n" +
                "Bấy giờ trong xóm có một ông lão nhà nghèo sống với vợ con trong một túp lều. Người ta gọi ông là cố Đương, là vì hễ gặp việc gì khó khăn, bất kì việc của ai, ông đều ra đương lấy và quyết làm kì được. Thấy việc trèo núi phải đi đường vòng rất xa, cố Đương cho là việc vô lý hết sức. Thường những lúc rảnh rỗi, ông vẫn một mình lần mò bám đá leo cây để tìm con đường đi kiếm củi gần nhất.\n" +
                "\n" +
                "Nhưng mỗi khi đứng trước sườn núi cheo leo ông vẫn bực mình, nghĩ bụng: -“Nếu không ghép đá thành bậc thang thì đừng có hòng vượt lên khỏi mấy cái dốc này!”. Ông đem ý ấy hỏi vợ. Vợ ông cho là việc rồ dại. Ông hỏi thử một vài người làng, họ đều lắc đầu bảo:\n" +
                "\n" +
                "– Không được đâu cố Đương ạ! Chúng ta còn phải lo miếng ăn hàng ngày đã chứ!\n" +
                "\n" +
                "Cố Đương trầm ngâm bảo họ:\n" +
                "\n" +
                "– Cứ mỗi lần phải đi “năm xóm cây đa, ba xóm cây thị” để vào nơi lấy củi, tôi lại muốn lộn tiết lên được!\n" +
                "\n" +
                "Năm tuần trăng trôi qua. Nghề kiếm củi đã trở nên nghề chính của mấy gia đình đánh cá thất bại kia. Họ đã yên tâm với nghề nghiệp mới. Chỉ trừ có cố Đương là chưa thật yên tâm. Một hôm cố bảo vợ:\n" +
                "\n" +
                "– Từ ngày mai trở đi, bà gắng đi kiếm củi một mình. Còn tôi, tôi sẽ tìm cách trổ một con đường mới lên núi. Ngày nào tôi làm xong, hai vợ chồng mình tha hồ đi củi.\n" +
                "\n" +
                "Người vợ vốn biết tính chồng hễ nói là làm, nhưng lần này thì bà hết sức can ngăn:\n" +
                "\n" +
                "– Ông đừng có địch với vua, đừng có đua với trời. Già kề miệng lỗ rồi chứ còn trẻ trai gì nữa đâu!\n" +
                "\n" +
                "Nhưng cố Đương an ủi:\n" +
                "\n" +
                "– Bà đừng lo! Biển kia rất rộng người ta cũng vượt được. Dãy Giăng-màn rất cao người ta cũng trèo qua. Bạt núi này thành đường thực ra không khó. Một mình tôi cũng làm được. Bà hãy chịu khó ít lâu. Mai kia ta sẽ đi đốn củi gấp đôi gấp ba hôm nay, lúc ấy cả xóm chúng ta sẽ sung sướng.\n" +
                "\n" +
                "– Ông định ghép bao lâu thì xong?\n" +
                "\n" +
                "– Không nói trước được. Một năm chưa xong thì hai, hai năm chưa xong thì bốn. Nếu tôi chết đi mà vẫn chưa làm xong thì sẽ có người khác tiếp tục…\n" +
                "\n" +
                "Thế là từ hôm đó, cố Đương ngày ngày mang một mo cơm lên núi. Ông bạt đất. Ông nhổ cây. Ông khiêng đá. Và ông ghép đá thành con đường tam cấp hướng thẳng lên núi. Công việc biết bao nặng nề! Nhưng quả không có gì cản được cái chí con chim hồng chim hộc. Ông càng làm càng khoẻ, càng nhọc càng hăng. Cứ thế trong năm sáu tuần trăng, ông vẫn sớm đi tối về như không biết mỏi là gì. Người vợ không nhịn được nữa, một hôm kêu lên:\n" +
                "\n" +
                "– Tội gì để cho mình ông đầu tắt mặt tối, cả nhà ông nheo nhóc rách rưới như thế. Ốc mang mình ốc chưa nổi lại còn mang cả cọc! Đường làm thành thì ai cũng đi, đâu có riêng mình ông. Thôi! Từ nay ông đi đâu thì đi, đừng có về nhà này làm gì nữa.\n" +
                "\n" +
                "Nghe nói thế, cố Đương lựa lời dỗ dành vợ. Nhưng người đàn bà cố tình làm cho chồng nản chí. Bà ta nhất định không nuôi báo cô ông nữa.\n" +
                "\n" +
                "Từ đấy ông thôi không về nhà, dựng một túp lều ngay bên chỗ mình làm việc. Hễ ghép được đến đâu ông lại dời lều đến đó. Thấy ông đói, những con vượn mang hoa quả đến cho ông. Thấy ông đuối sức, những con bò rừng, những con nai ghé sừng nạy những tảng đá giúp ông. Rồi những con chim thay nhau ca hát suốt ngày để cho ông quên mệt. Về sau có mấy người trong xóm cũng tình nguyện đến làm với ông. Thấy thế, cố Đương như tăng thêm sức mạnh, càng miệt mài với công việc.\n" +
                "\n" +
                "Cứ như thế, sau năm lần sim có quả, cố Đương đã mở được một con đường truông ngắn nhất từ xóm mình thông lên những đỉnh cao trên dãy Hồng-lĩnh. Ông đã ghép đá thành tam cấp của ba dốc núi khó đi nhất. Dân xóm lên núi xuống núi rất tiện và từ đó họ có thể trong một ngày kiếm được mấy lần củi.\n" +
                "\n" +
                "Ngày nay, ở phía Nam Hồng-lĩnh, chỗ giáp giới hai huyện Nghi-xuân và Can-lộc có một cái truông gọi là truông Vắn[1] hoặc gọi là truông Ghép. Cái tên cố Đương người ta quen gọi là cố Ghép."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/09/nguy%E1%BB%85n-khoa-%C4%91%C4%83ng-640x440.jpg", "Nguyễn Khoa Đăng", "Ngày xưa, có nội tán Nguyễn Khoa Đăng là người có tài xử đoán. Khi còn làm một chức quan nhỏ, ông đến trị nhậm hạt nào thường được mọi người mến phục, không chỉ vì tài xét xử mà còn vì lòng tốt của ông lúc nào cũng lo trừ hại cho dân.\n" +
                "Có lần, ông đến nhậm chức ở một huyện, một hôm có người dân làng kia bị kẻ thù oán, đêm đến lẻn ra đồng phá hết cả một ruộng dưa. Đau xót cho công lao vun trồng, dưa sắp được ăn chỉ trong một đêm bị héo rụng hết cả, người ấy bèn đến kêu khóc với ông, xin ông minh xét. Ông Đăng theo ngay người ấy về tận ruộng dưa khám nghiệm. Tất cả dấu vết đều chứng tỏ kẻ gian đã dùng một cái thuổng xắn đứt ngọn dưa và dùng cán giẫm nát hầu hết các gốc dưa. Nhưng hắn rất khôn ngoan, bao nhiêu dấu chân, hắn đều cố ý xóa sạch. Ông hỏi người trồng dưa:\n" +
                "\n" +
                "– Anh có ngờ ai thù oán mình không?\n" +
                "\n" +
                "Người ấy kể cho quan nghe tên mấy người ở xóm, lập tức ông sai chức dịch đi thu hồi tất cả các thuổng trong xóm lại, thuổng của nhà nào đều có ghi tên nhà ấy vào cán. Đoạn, ông khám từng cán thuổng một, nhặt riêng mấy cái khả nghi ra một nơi. Rồi ông sai người thè lưỡi liếm trên mấy cái cán thuổng đó. Quả nhiên có một cái, người ta nhận thấy có vị đắng. Ông sai lấy một gốc dưa đập giập vắt nước ra nếm thử thì chất đắng của dưa cùng với chất đắng trên cán thuổng là một. Ông nhìn lại tên ghi ở thuổng thì đúng là thuổng của một trong số mấy người mà nguyên cáo ngờ là có thù oán với mình.\n" +
                "\n" +
                "Lập tức ông sai lính bắt người kia giải đến. trước tang chứng và lý lẽ đanh thép của quan, hắn không còn chối vào đâu được, đành cúi đầu nhận tội. Ông bắt hắn phải đền hoa lợi ruộng dưa cho người kia và phạt thêm gấp hai lần để hắn chừa cái thói hại ngầm kẻ khác.\n" +
                "\n" +
                "Một hôm khác, có một anh hàng dầu, gánh một gánh ra chợ bán. Trong khi đang bận đong dầu, có kẻ đã thừa dịp thò tay vào bị lấy trộm tiền. Đến khi anh hàng dầu biết thì tên ăn cắp đã chạy đi nơi khác. Anh ta nhớ tới một người mù hồi nãy quanh quẩn bên gánh của mình, đuổi mấy cũng không đi, đoán chắc là kẻ cắp, bèn gửi gánh hàng cho người quen rồi đi tìm người mù lúc nãy. Nhưng khi gặp, người mù hết sức chối cãi, rằng mình mù thì còn biết tiền của để ở đâu mà lấy. Hai bên xô xát, tuần bắt giải quan.\n" +
                "\n" +
                "Khi họ dắt nhau đến công đường, ông Đăng bắt hai bên khai rõ sự tình. Người mù khăng khăng từ chối không nhận. Ông Đăng hỏi:\n" +
                "\n" +
                "– Anh có tiền giắt đi theo đấy không?\n" +
                "\n" +
                "Trả lời:\n" +
                "\n" +
                "– Có, nhưng đây là tiền tôi mang đi chợ, không phải của nó.\n" +
                "\n" +
                "– Được cứ đưa ra đây, của ai rồi sẽ biết.\n" +
                "\n" +
                "Khi người mù móc tiền ra, ông Đăng sai người múc đến một chậu nước, rồi bỏ tất cả số tiền vào chậu. Một chốc tự nhiên thấy trên mặt nước có váng dầu nổi lên. Nghe quan sai bưng chậu nước cho mọi người chứng kiến, người mù hết đường chối, đành chịu tội ngay.\n" +
                "\n" +
                "Nhưng quan còn nói thêm:\n" +
                "\n" +
                "– Khoan đã, chưa hết đâu. Tội ăn cắp mới là một. Nếu mày mù tịt thì làm sao biết được tiền người hàng dầu bỏ trong bị, cất trong thúng khảo mà lấy được! Đúng là mày giả mù. Lính đâu. Bắt nó nọc ra đánh cho rõ đau, kỳ bao giờ nó mở hai mắt ra hãy thôi.\n" +
                "\n" +
                "Người mù trước còn chối lấy chối để, nhưng chỉ qua ba roi là hắn mở ngay hai mắt nhận tội, đúng như lời quan truyền bảo[1].\n" +
                "\n" +
                "Một hôm khác, có một người lái buôn giấy đến trình quan rằng mình nghỉ trọ ở làng Hồ-xá bị trộm lấy mất cả một gánh giấy. Ông Đăng hỏi rõ nguồn cơn, sai người do thám mấy ngày liền không có kết quả, bèn thân hành đến làng Hồ-xá nghĩ cách cứu xét. Đến nơi, ông cho triệu dân chúng sở tại và mấy làng xung quanh lại và bảo:\n" +
                "\n" +
                "– Trên tỉnh vừa sức về bắt các xã thôn mỗi một người không kể nam phụ lão ấu phải làm ngay một tờ khai tên tuổi quê quán cho minh bạch.\n" +
                "\n" +
                "Lệnh ban ra, mọi người đua nhau đi mua giấy. Vì thế giấy ở chợ lên giá vùn vụt.\n" +
                "\n" +
                "Lại nói chuyện tên trộm trộm được gánh giấy nhưng chưa có nơi tiêu thụ còn giấu ở nhà. Nay nghe nói giá giấy lên cao bèn mang lẻn một số ra chợ bán. Hắn không ngờ người nhà của ông Đăng cũng đi rải ở các chợ để chờ hắn. Thế là bị bại lộ, tên trộm không những bị tội phải đền gánh giấy cho người lái buôn mà còn phải đền cho dân các làng mặt tiền mua giấy kê khai tên tuổi.\n" +
                "\n" +
                "Một lần khác, ông được đổi đi một hạt miền núi. Khi ông mới đến, người ta cho ông biết là hạt ấy nổi tiếng có nhiều trộm cướp nhà nghề. Các quan trước bó tay không thể nào trị nổi. Ông chỉ cười nhạt không nói gì, nhưng sau đó ngầm sai người thân tín đi dò la hành tung và quê quán từng tên một. Thế rồi, ông vẫn cứ tảng lờ như là không hay biết gì hết.\n" +
                "\n" +
                "Một hôm nhân đi hành hạt qua một làng nọ, ông thấy có một hòn đá lớn ở bên vệ đường. Hỏi dân sở tại, họ đáp:\n" +
                "\n" +
                "– Đây là ông Mốc, ngài thiêng lắm, ai cầu khẩn việc gì cũng đều được linh ứng.\n" +
                "\n" +
                "Ông nghe nói liền họa theo:\n" +
                "\n" +
                "– Phải thế thì ta tới cầu ngài giúp ta trừ yên cướp trộm để bớt hại cho dân chúng mới được!\n" +
                "\n" +
                "Nói rồi một mình bước tới khấn vái, hồi lại trở ra bảo mọi người rằng:\n" +
                "\n" +
                "– Ngài bảo vài hôm nữa rước ngài về, ngài sẽ vạch mặt tất cả bọ gian phi trong toàn huyện.\n" +
                "\n" +
                "Ít hôm sau, ông sai mấy người ban đêm bí mật đào hầm ở giữa sân công đường rồi cho người thân tín xuống nấp dưới đó. Tờ mờ sáng hôm sau, ông sai lính đi khiêng hòn đá về đặt lên trên hầm. Trước mặt mọi người đông đủ, ông dõng dạc hỏi đá:\n" +
                "\n" +
                "– Ta nghe đồn thần rất thiêng, “hữu cầu tất ứng”. Nay ta vâng mệnh hoàng đế đến đây trấn nhậm, nhưng hiện nay trong huyện hạt có nhiều trộm cướp nhiễu hại dân cư. Vậy ta mời thần về đây để mách hộ ta truy tầm kẻ phạm pháp. Nếu có công, ta sẽ tâu triều đình phong tặng.\n" +
                "\n" +
                "Đá không trả lời. Hỏi mãi, đá vẫn một mực làm thinh, ông nổi giận quát lớn:\n" +
                "\n" +
                "– Hay là đá đồng lõa với kẻ phạm pháp. Lính đâu, hãy tra tấn nó cho đến lúc nó phải khai thực!\n" +
                "\n" +
                "Bấy giờ, mọi người nghe tin đến xem đông như hội. Lệnh truyền xa, lính dùng roi đánh vào đá túi bụi, tự nhiên đá bật ra tiếng khóc, xin dừng tay lại để khai. Thế rồi, đá lần lượt khai và vạch tội từng tên một. Mỗi lần đá khai một tên nào, ông sai lại mục viết ngay trát, giao cho lính đã chực sẵn đi nã bắt lập tức. Cho đến suốt ngày hôm đó bắt được ba mươi tên cừ khôi. Khi giải cả một xốc về tra tấn, bọn trộm cướp nhìn nhau kinh ngạc, không ngờ lại có việc xảy ra như thế và bắt đúng tên như thế. Chúng cho là chỉ có thần đá linh thiêng mới biết một cách rành mạch tội trạng của mình, bèn không đợi khảo đả, thú nhận tất cả.\n" +
                "\n" +
                "Trong thời kỳ làm nội tán, ông đã làm cho suốt một dọc truông nhà Hồ ở Quảng Trị không còn lấy một bóng gian phi. Trước đó, truông này là nơi rừng rậm, con đường Nam Bắc phải đi qua đây. Bọn gian phi đã dùng làm sào huyệt đón đường cướp của.\n" +
                "\n" +
                "Nguyễn Khoa Đăng trước hết tìm cách lùng bắt trộm cướp. Ông sai chế ra một loại hòm gỗ kín có những lỗ thông khí, vừa một người ngồi lọt, có khóa trong, để người ngồi trong có thể mở tung ra được dễ dàng. Thế rồi, ông kén một số người giỏi võ, cho ngồi vào hòm có để sẵn vũ khí. Đoạn, ông sai quan sĩ của mình giả trang làm dân phu khiêng những hòm ấy qua truông nhà Hồ ra vẻ khiêng những hòm “của cải” nặng nề. Lại cho người đánh tiếng có một ông quan trấn ở ngoài Bắc sắp sửa trẩy về quê với những hòm tư trang quý giá sẽ đi qua truông. Bọn cướp đánh hơi thấy đây là một cơ hội kiếm ăn hiếm có, bèn rình lúc đoàn “dân phu” đi qua của truông, xông ra đánh đuổi, rồi hý hửng khiêng những cái hòm nặng ấy về tận sào huyệt.\n" +
                "\n" +
                "Nhưng khi về đến nơi thì vừa đặt xuống thì những cái hòm tự nhiên mở toang, các võ sĩ ngồi trong đó cầm vũ khí xông ra đánh giết bọn cướp một cách bất ngờ. Đang lúc hoảng hốt chưa kịp đối phó thì bọn chúng nghe tin phục binh của triều đình ở phía ngoài ùn ùn kéo vào đông như kiến cỏ. Chúng đành chắp tay xin tha tội. Nhờ mẹo đó, Nguyễn Khoa Đăng đã tóm được cả lũ.\n" +
                "\n" +
                "Ông cho phiên chế thành đội ngũ đi khai khẩn đất hoang ở nơi biên giới, lập thành những đồn điền lớn rộng. Sau đó, ông còn cho chiêu dân lập ấp ở dọc hai bên truông, làm cho một vùng trước kia là nơi vắng vẻ, trở nên những làng xóm dân cư đông đúc: tiếng xay lúa giã gạo, tiếng gà gáy chó sủa lấn dần tiếng vượn hú chim kêu. Từ đó, một vùng núi rừng thành ra yên ổn. Bọn trộm cướp còn lại đành phải giải nghệ.\n" +
                "\n" +
                "Bởi vậy, người ta có câu: “Truông nhà Hồ nội tán cấm nghiêm” là thế.\n" +
                "\n"))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2012/10/nguoi-tot-660x440.jpg", "Cô đào hát với người học trò nghèo", "Ngày xưa, có một đứa bé thông minh tên là Nguyễn Kỳ, mẹ mất sớm, cha lấy vợ khác. Kỳ bị dì ghẻ hành hạ ác nghiệt nên phải bỏ nhà mà đi.\n" +
                "\n" +
                "Lang thang khắp nơi, Kỳ gặp một cụ cử cho ở lại nhà và cho học chữ. Sẵn khiếu thông minh, Kỳ không những theo kịp các bạn, mà còn nổi tiếng giỏi văn thơ.\n" +
                "\n" +
                "Một hôm Kỳ theo bạn học đi xem ca múa, thấy mình nghèo nên đứng trong góc nhà, chợt cô đào hát trông thấy, và hôm sau, khi Kỳ đang ngồi đọc sách thì cô đào đem 10 nén bạc đến làm quen. Kỳ nhất định không lấy, nhưng cô ta nài ép, để bạc đấy rồi bỏ đi. Cách ít lâu, nàng trở lại, rồi trở lại nữa. Hai bên dần dần quen nhau. Một hôm, không còn tự chủ được trước người con gái đẹp, giọng thướt tha, Kỳ làm một cử chỉ suồng sã, rồi hối hận ngay. Nhưng cô đào nghiêm nghị trách:\n" +
                "\n" +
                "“Anh chớ vội tưởng lầm, em tìm đến anh vì trọng người đứng đắn, vì nghĩ đến tương lai, muốn tìm nơi nương tựa lâu dài, anh đừng nghĩ em là phường bậy bạ.”\n" +
                "\n" +
                "Từ đó Kỳ càng trọng kính cô đào hơn, và cô vẫn giúp Kỳ qua cơn túng thiếu.\n" +
                "\n" +
                "Trước ngày lên đường đi thi, Kỳ muốn biết tông tích cô đào, muốn liên lạc với cô sau này, nhưng cô chỉ nói:\n" +
                "\n" +
                "“Sau này nếu anh không quên em, thì em sẽ tìm đến với anh, nếu anh quên em, thì hỏi tông tích em cũng vô ích. Phần em, em không đòi anh hứa gì cả, chỉ có Trời biết lòng em.”\n" +
                "\n" +
                "Khi Kỳ thi đỗ trở về quê, cha chàng bắt kết hôn với người “môn đăng hộ đối”. Kỳ hết sức từ chối, nhất quyết thà chết hơn phụ bạc người đã một lần yêu thương giúp đỡ, nhưng cha chàng cũng nhất quyết không chịu cho quan chức kết duyên với cô ả đào, không nhận ả đào làm con dâu. Nguyễn Kỳ đau khổ, nhưng lễ giáo bắt buộc, bổn phận làm con bắt buộc, nên chàng đành phải lấy vợ theo ý cha.\n" +
                "\n" +
                "Năm sau, chàng ra kinh đô thi tiến sĩ, cô đào mang đủ thứ đến thăm. Thấy Kỳ có vẻ ngượng ngùng, cô hiểu ngay, và từ biệt hẳn.\n" +
                "\n" +
                "Nguyễn Kỳ thi đỗ, làm quan trong triều, đi sứ bên Tàu, dẹp loạn ở Hải dương, được vua ban thưởng tước “quận công”.\n" +
                "\n" +
                "Danh vọng cao, tiền bạc sẵn, con cái đông, nhưng Kỳ luôn nhớ tới tình cô đào hát xưa, cho người dọ hỏi khắp nơi, nhưng không gặp.\n" +
                "\n" +
                "Một hôm, trong bữa tiệc tại nhà người quan bạn, Kỳ đã tình cờ gặp lại cô đào, bấy giờ nàng đã có chồng làm lính, nhưng nay chồng đã chết, chỉ còn có mẹ già yếu bệnh, nàng phải trở lại nghiệp hát để nuôi mình và nuôi mẹ.\n" +
                "\n" +
                "Nguyễn Kỳ cố mời hai mẹ con về ở trong dinh, nàng đành chấp nhận. Kỳ dành cho mẹ con ngôi nhà riêng, và không để cho thiếu thốn vật gì. Một năm sau bà cụ mất, Nguyễn Kỳ cho chôn cất trọng thể. Xong rồi nàng cảm ơn và xin phép từ biệt. Nguyễn kỳ không giữ lại được, nài nỉ nàng nhận lấy vài nén bạc, nàng cũng từ chối mà ra đi."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/05/ba-l%C6%B0%E1%BB%A1i-r%C3%ACu.jpg", "Ba lưỡi rìu", "Xưa có một anh chàng tiều phu nghèo, cha mẹ anh bệnh nặng nên qua đời sớm, anh phải sống mồ côi cha mẹ từ nhỏ và tài sản của anh chỉ có một chiếc rìu. Hàng ngày anh phải xách rìu vào rừng để đốn củi bán để lấy tiền kiếm sống qua ngày. Cạnh bìa rừng có một con sông nước chảy rất xiết, ai đó lỡ trượt chân rơi xuống sông thì rất khó bơi vào bờ.\n" +
                "\n" +
                "Một hôm, như thường ngày chàng tiều phu vác rìu vào rừng để đốn củi, trong lúc đang chặt củi cạnh bờ sông thì chẳng may chiếc rìu của chàng bị gãy cán và lưỡi rìu văng xuống sông. Vì dòng sông nước chảy quá xiết nên mặc dù biết bơi nhưng anh chàng vẫn không thể xuống sông để tìm lưỡi rìu. Thất vọng anh chàng tiều phu ngồi khóc than thở.\n" +
                "\n" +
                "Bỗng từ đâu đó có một ông cụ tóc trắng bạc phơ, râu dài, đôi mắt rất hiền từ xuất hiện trước mặt chàng, ông cụ nhìn chàng tiêu phu và hỏi:\n" +
                "\n" +
                "-Này con, con đang có chuyện gì mà ta thấy con khóc và buồn bã như vậy?\n" +
                "\n" +
                "Anh chàng tiều phu trả lời ông cụ:\n" +
                "\n" +
                "-Thưa cụ, bố mẹ cháu mất sớm, cháu phải sống mồ côi từ nhỏ, gia cảnh nhà cháu rất nghèo, tài sản duy nhất của cháu là chiếc rìu sắt mà bố mẹ cháu trước lúc qua đời để lại. Có chiếc rìu đó cháu còn vào rừng đốn củi kiếm sống qua ngày, giờ đây nó đã bị rơi xuống sông, cháu không biết lấy gì để kiếm sống qua ngày nữa. Vì vậy cháu buồn lắm cụ ạ!\n" +
                "\n" +
                "Ông cụ đáp lời chàng tiều phu:\n" +
                "\n" +
                "-Ta tưởng chuyện gì lớn, cháu đừng khóc nữa, để ta lặn xuống sông lấy hộ cháu chiếc rìu lên.\n" +
                "\n" +
                "Dứt lời, ông cụ lao mình xuống dòng sông đang chảy rất xiết. Một lúc sau, ông cụ ngoi lên khỏi mặt nước tay cầm một chiếc rìu bằng bạc sáng loáng và hỏi anh chàng tiều phu nghèo:\n" +
                "\n" +
                "– Đây có phải lưỡi rìu mà con đã làm rơi xuống không ?\n" +
                "\n" +
                "Anh chàng tiều phu nhìn lưỡi rìu bằng bạc thấy không phải của mình nên anh lắc đầu và bảo ông cụ:\n" +
                "\n" +
                "– Không phải lưỡi rìu của cháu cụ ạ, lưỡi rìu của cháu bằng sắt cơ.\n" +
                "\n" +
                "Lần thứ hai, ông cụ lại lao mình xuống dòng sông chảy xiết để tìm chiếc rìu cho chàng tiều phu. Một lúc sau, ông cụ ngoi lên khỏi mặt nước tay cầm chiếc rìu bằng vàng và hỏi chàng tiều phu:\n" +
                "\n" +
                "-Đây có phải là lưỡi rìu mà con đã sơ ý làm rơi xuống sông không?\n" +
                "\n" +
                "Anh chàng tiều phu nhìn lưỡi rìu bằng vàng sáng chói, anh lại lắc đầu và bảo:\n" +
                "\n" +
                "-Không phải là lưỡi rìu của con cụ ạ\n" +
                "\n" +
                "Lần thứ ba, ông cụ lại lao mình xuống sông và lần này khi lên ông cụ cầm trên tay là chiếc rìu bằng sắt của anh chàng tiều phu đánh rơi. Ông cụ lại hỏi:\n" +
                "\n" +
                "-Vậy đây có phải là lưỡi rìu của con không!\n" +
                "\n" +
                "Thấy đúng là lưỡi rìu của mình rồi, anh chàng tiều phu reo lên sung sướng:\n" +
                "\n" +
                "-Vâng cụ, đây đúng là lưỡi rìu của con, con cảm ơn cụ đã tìm hộ con lưỡi rìu để con có cái đốn củi kiếm sống qua ngày.\n" +
                "\n" +
                "Ông cụ đưa cho anh chàng tiều phu lưỡi rìu bằng sắt của anh và khen:\n" +
                "\n" +
                "-Con quả là người thật thà và trung thực, không hề ham tiền bạc và lợi lộc. Nay ta tặng thêm cho con hai lưỡi rìu bằng vàng và bạc này. Đây là quà ta tặng con, con cứ vui vẻ nhận.\n" +
                "\n" +
                "Anh chàng tiều phu vui vẻ đỡ lấy hai lưỡi rìu mà ông cụ tặng và cảm tạ. Ông cụ hóa phép và biến mất. Lúc đó anh chàng tiều phu mới biết rằng mình vừa được bụt giúp đỡ."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/03/full_2334b401decf12622a42fa4ed56b0c2e.jpg", "Tình bạn Lưu Bình Dương Lễ", "Lưu Bình và Dương Lễ là bạn kết nghĩa với nhau. Cả hai cùng đi học và chơi chung với nhau thân thiết lắm.\n" +
                "\n" +
                "Lưu Bình con nhà giàu sang nhưng lại lười biếng không chịu học hành mà chỉ thích ăn chơi. Thi kỳ nào hỏng kỳ đó. Trái lại Dương Lễ rất nghèo nhưng biết phận nên chịu khó học hành đêm ngày. Lưu Bình lại rất tử tế với bạn: Anh ta cho Dương Lễ tiền để mua giấy mực, áo quần, cơm gạo để ăn học.\n" +
                "\n" +
                "Đến kỳ, Dương Lễ thi đậu, được làm quan, ở trong dinh có lính hầu canh gác. Trong khi đó Lưu Bình cờ bạc hết tiền, trở nên nghèo đói. Không tiền, không việc, Lưu Bình tìm đến Dương Lễ. Anh nghĩ là lúc xưa đã giúp bạn tiền để ăn học nên Dương Lễ chắc không bao giờ quên ơn đâu. Hơn nữa anh ta là một người bạn rất tốt.\n" +
                "\n" +
                "Thế rồi Lưu Bình tìm đến nhà quan Dương Lễ. Anh ta không được phép vào gặp ngay mà phải chờ đợi ở ngoài rất lâu. Sau cùng một lính hầu đưa anh ta đến một căn phòng đặc biệt. Khi ra tiếp đón bạn, Dương Lễ trông rất thờ ơ lạnh nhạt như người xa lạ. Dương Lễ không cho tiền bạc gì cả. Đến khi Lưu Bình than đói bụng thì Dương Lễ mới sai lính hầu cho người bạn một bát cơm nguội đựng trong cái bát mẻ, mấy quả cà thiu, và bắt bạn ngồi ăn dưới đất.\n" +
                "Lưu Bình tức giận thâm gan tím ruột. Khi trở về căn nhà nghèo nàn của anh, anh ta buồn tủi cho số phận mình nên không sao ngủ được đêm hôm đó. Rồi anh ta quyết chí học hành để thi đỗ làm quan cho bằng Dương Lễ. Nhưng than ôi lấy tiền đâu mà mua giấy mực để học bây giờ. Còn áo quần và thức ăn nữa chứ. Anh ta buồn rầu lắm vì không biết giải quyết ra sao.\n" +
                "Một vài ngày sau có một thiếu phụ trẻ đẹp dọn đến ở căn nhà bên cạnh. Nàng buôn bán tơ lụa. Lưu Bình làm quen với nàng và hai người trở nên bạn thân thiết. Nàng bán lụa để giúp chàng ăn học. Lưu Bình học hành ngày đêm. Sau cùng thi đỗ làm quan và Lưu Bình xin cưới nàng.\n" +
                "\n" +
                "Khi ở trường thi về nhà thì Lưu Bình không thấy ân nhân của mình đâu cả. Anh ta buồn lắm. Nhưng nghĩ tới Dương Lễ, anh ta muốn cho bạn mình thấy là bây giờ anh ta không kém ai.\n" +
                "Lần gặp gỡ này Dương Lễ lại đón tiếp bạn rất nồng hậu, mời bạn dự yến tiệc thịnh soạn, có đàn ca múa hát để mừng bạn. Khi Lưu Bình còn đang trở lại chuyện cũ để mỉa mai, bấy giờ Dương Lễ mới gọi vợ ra để tiếp rượu bạn. Lưu Bình sửng sốt khi trông thấy Châu Long, người xưa nuôi mình. Thì ra chính vợ của Dương Lễ đã giúp đỡ Lưu Bình ăn học thành tài như ngày hôm nay. Bây giờ Lưu Bình mới hiểu hành động của Dương Lễ ngày trước khi tiếp chàng một cách lạnh nhạt để cho Lưu Bình thấy là anh ta không thể ỷ vào tiền bạc mà sống mãi được. Cho nên Dương Lễ đã không cho bạn một xu, nhưng lại gởi vợ mình đến giúp bạn ăn học. Lưu Bình hiểu rằng mình có được người bạn chí thiết nên mãn nguyện lắm. Từ đó hai gia đình lại càng thân thiết hơn."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/02/dc4ozArxi-600x440.jpg", "Sự tích cây chuối", "Ngày xưa, rất xưa, cứ ba năm một lần. Thần Cây lại mở cuộc thi cây. Các con của Thần, cứ ba năm một lần, lại mang về những giống cây mới để Thần chấm giải. Lần thi ấy, người con út của Thần Cây tên là Tiêu Lá vừa lấy vợ và Sinh được đứa con trai đầu lòng rất xinh đẹp. Tiêu Lá yêu quý con, suốt ngày cứ ngắm nó mãi không chán. Một hôm, đang ngắm con, Tiêu Lá bỗng nảy ra cái ý định sẽ tạo nên một giống cây vừa bụ bẫm và xinh đẹp như con vừa có thể cho con nhiều thứ vui chơi và có quả ngon thơm nuôi con chóng lớn. Tiêu Lá nghĩ ra một giống cây hoàn toàn mới lạ. Thân của nó sẽ tròn trĩnh như tay chân của con, mát mẻ như da thịt của con. Lá của nó sẽ không nhiều nhưng rất to và nhìn giống như những cái lông chim khổng lồ buộc túm lại xòe ra bốn phía. Lên năm, lên sáu, con có thể bẻ từng lá che đầu đi chơi không sợ mưa, không sợ nắng. Quả của cây sẽ giống như ngón tay con trẻ và sẽ xếp thành dài dọc theo sống lá. Đến lúc chín quả sẽ thơm ngọt như có mùi sữa và mật quyện vào nhau. Con lớn lên chỉ cần với tay là hái được quả, bóc lấy mà ăn.\n" +
                "\n" +
                "Nhưng có một điều đáng lo ngại là năm đó tự nhiên có một con chim ác xuất hiện. Nó to lớn, lông rằn ri như vảy rắn. Từ một nơi nào đó rất xa bay đến, nó chuyên lấy cắp những hạt giống của các thứ cây quý rồi bay đi. Vậy thì làm thế nào để cho giống cây mới của mình không bị con chim ác kia đánh cắp được? Tiêu Lá bèn nghĩ ra cách không cho giống cây mới Sinh ra cây con bằng hạt mà Sinh ra từ gốc, từ củ. Để trêu con chim ác, Tiêu Lá vẫn cho quả giống cây có hạt, nhưng hạt ấy dù có gieo xuống đất, có chăm sóc mấy, nó cũng chẳng bao giờ nảy mầm và Sinh ra cây con.\n" +
                "\n" +
                "Con chim ác hình như đoán biết điều ấy. Nó bèn tìm cách phá hoại cây. Những quả đầu tiên của giống cây quý Tiêu Lá đã tạo nên, vừa đón đủ nắng để chín thì con chim ác đã bay tới. Nó chỉ bay tới trong đêm. Cái mỏ to quặm và sắc nhọn của nó mổ phá ngay những quả quý của Tiêu Lá. Tiêu Lá giận lắm. Đêm đến, Tiêu Lá cứ thức và rình chộp bắt cho được con chim ác nọ. Nhưng nó cũng tinh khôn vô cùng. Nó đánh hơi rất tài. Biết có Tiêu Lá rình nấp và đang thức, nó chỉ bay vụt qua rồi biến mất. Nhưng khi chàng vừa chợp mắt ngủ quên là nó đã lao đến mổ phá những quả quý kia ngay… Tiêu Lá đành phải cố thức suốt cả đêm. Có một lần, vừa chợt tỉnh giấc. Tiêu Lá đã suýt chộp được con chim ác nọ. Không may cho Tiêu Lá là chàng chỉ chộp được một túm lông và con chim ác đã vẫy vùng bay thoát. Nhưng từ đó, nó rất sợ hình dáng cái bàn tay của Tiêu Lá chộp nó. Tiêu Lá đoán biết được điều này và lập tức chàng nảy ra một ý định mới. Chàng sẽ không cho những quả cây quý ấy xếp dọc từng quả một theo gân lá nữa. Chàng sẽ xếp chúng lại thành từng khóm, giống hệt hình các bàn tay xòe ra như để sẵn sàng vồ lấy con chim ác. Và những bàn tay bằng quả ấy, cứ xếp xoay tròn, bàn này ở trên, bàn kia ở dưới, nối tiếp nhau…\n" +
                "\n" +
                "Con chim ác quả nhiên không dám bay đến phá phách nữa. Mà hình dáng những quả cây quý xếp theo cách ấy nhìn cũng rất đẹp rất vui, vì nó giống như bàn tay của con trẻ đang xòe múa. Tiêu Lá rất vui lòng. Con trai của chàng cũng rất thích. Tiếng trống báo mùa thi cây đã đến, vang lừng khắp cả gần xa. Những người anh của Tiêu Lá từ các nơi đã lục tục mang cây về dự giải. Thôi thì đủ các hình dáng, đủ các màu sắc, đủ các hương vị, cây to, cây nhỏ, quả ngọt, quả chua… Tiêu Lá là người mang cây đến sau cùng nên giống cây của chàng được xếp ở hàng cuối. Đến sáng ngày thi, Thần Cây râu tóc bạc trắng, tươi cười từ trên núi cao đi xuống. Thần rất vui mừng vì kỳ thi này tất cả ba mươi sáu người con của Thần đều đủ mặt và người nào cũng đều mang những giống cây mới về dự. Thần Cây dừng lại trước từng giống cây một, nghe từng người dự giải nói về cái hay, cái quý của giống cây mình mới tạo nên. Thần Cây càng xem càng vui, nét mặt cứ rạng rỡ lên vì công trình của các con mình.\n" +
                "\n" +
                "Nhưng phải đến lúc đứng trước giống cây rất mới lạ, vừa xinh đẹp, vừa mang đầy tình yêu thương con trẻ của Tiêu Lá, Thần Cây mới ha hả cười to lên và tuyên bố Tiêu Lá được giải nhất. Cây ấy là cây Chuối ngày nay. Nhưng tại sao lại gọi là cây Chuối thì có lẽ vì lần ấy, hỏi xem cây nào được giải nhất, ai cũng đáp: Cây cuối! Cây cuối! (tức là xếp ở hàng cuối) nên sau này đọc chệch ra, tiếng cuối biến dần thành tiếng chuối. Còn vì sao mà những “bàn tay” chuối đến nay không phải chỉ có năm ngón, năm quả mà có khi đếm đến hàng chục, hàng hai chục thì điều ấy rất dễ hiểu: thấy các em ưa thích ăn chuối, nên các bàn tay chuối cứ tự động sinh thêm ngón, thêm quả cho các em vui lòng. Và đó cũng là một cách cây muốn tỏ ra mình rất hiểu bụng người đã tạo nên cây. Đó là lòng yêu con, yêu trẻ của Tiêu Lá, người con út của Thần Cây."))
        listStoryCTVN.add(ItemStory("https://truyencotich.vn/wp-content/uploads/2015/01/maxresdefault-1.jpg", "Sự tích con Muỗi", "Ngày xưa, có một người nông dân hiền lành tên là Ngọc Tâm, có một người vợ xinh đẹp tên là Nhan Diệp. Khác hẳn với tính tình đơn giản của chồng, quanh năm chăm chú làm ăn, người vợ lười biếng xa hoa, chỉ lo thỏa thê sung sướng.\n" +
                "\n" +
                "Trong lúc hai vợ chồng tưởng chung sống với nhau đến răng long đầu bạc, thì Nhan Diệp bỗng lăn ra chết.\n" +
                "\n" +
                "Người chồng đau đớn quá, không muốn rời xa xác vợ, bèn bán hết tài sản, mua một chiếc thuyền chở quan tài vợ thả bồng bềnh trên mặt nước.\n" +
                "\n" +
                "Một buổi sớm mai thuyền đi đến dưới chân một ngọn núi cỏ cây ngào ngạt, Ngọc Tâm lên bờ thấy đủ các kỳ hoa dị thảo, cây cối nặng trĩu trái thì lấy làm lạ bèn phăng lần lên cao. Lưng chừng núi, Ngọc Tâm gặp một ông lão tướng mạo phương phi, râu tóc bạc phơ, tay chống gậy trúc đang lần bước. Thấy người có vẻ tiên phong đạo cốt, đoán chừng là thần tiên ở núi Thiên Thai xuất hiện, Ngọc Tâm bèn sụp lạy, rồi thiết tha xin cứu tử hoàn sinh cho người vợ thương yêu.\n" +
                "\n" +
                "Vị thần thương hại nhìn Ngọc Tâm hồi lâu rồi nói:\n" +
                "\n" +
                "– Ngươi còn nặng lòng vương vấn trần ai, chưa thoát được vòng tục lụy… Ta có thể giúp cho ngươi đạt ước vọng song về sau ngươi đừng có lấy làm ân hận!\n" +
                "\n" +
                "Ngọc Tâm theo lời vị thần, dở nắp quan tài vợ ra, chích đầu ngón tay mình nhỏ ba giọt máu vào thi thể Nhan Diệp, thì người đàn bà từ từ mở mắt ra, rồi ngồi lên như sau một giấc ngủ dài.\n" +
                "\n" +
                "Trước khi từ giã, vị thần bảo người đàn bà vừa sống lại:\n" +
                "\n" +
                "– Đừng quên bổn phận của người vợ… Hãy luôn luôn nghĩ đến lòng thương yêu chung thủy của chồng… Chúc cho hai vợ chồng được sung sướng.\n" +
                "\n" +
                "Trên đường về quê, người chồng hối hả giục thuyền đi mau. Một tối thuyền ghé bến, Ngọc Tâm lên bờ mua sắm thức ăn. Trong lúc đó, có một chiếc thuyền buôn lớn đậu sát bên cạnh, chủ nhân là tay lái buôn giàu có chú ý đến nhan sắc lộng lẫy của Nhan Diệp. Hắn gợi chuyện, mời Nhan Diệp qua thuyền mình dùng trà rồi ra lệnh cho bạn thuyền dong hết buồm chạy.\n" +
                "\n" +
                "Ngọc Tâm quay về thấy mất vợ, bỏ cả ăn ngủ, ngày đêm đi tìm kiếm, một tháng sau mới gặp. Nhưng người đàn bà đã quen với lối sống xa hoa bên cạnh tay lái buôn giàu có, quên cả tình cũ nghĩa xưa. Thấy rõ bộ mặt thật của vợ, Ngọc Tâm như tỉnh cơn mê, bảo Nhan Diệp:\n" +
                "\n" +
                "– Mình được tự do bỏ tôi song tôi không muốn mình còn lưu giữ kỷ niệm gì của tôi nữa, vậy hãy trả lại ba giọt máu của tôi đã nhỏ ra để cứu mình sống lại.\n" +
                "\n" +
                "Nhan Diệp thấy được ra đi dứt khoát dễ dàng như thế, vội vàng lấy dao chích đầu ngón tay, nhưng máu vừa bắt đầu nhỏ giọt thì nàng ngã lăn ra chết.\n" +
                "\n" +
                "Người đàn bà nông nổi, phụ bạc chết vẫn còn luyến tiếc cõi đời nên hóa kiếp thành một vật nhỏ, ngày đêm đuổi theo Ngọc Tâm, tìm cách ăn cắp ba giọt máu để trở lại làm người. Con vật này luôn luôn kêu than với chồng cũ, như van lơn, như oán hận, như tiếc thương, ngày đêm o o không ngừng. Về sau giống này sinh sôi nẩy nở rất nhiều, người ta đặt tên nó là con muỗi. Vì ghét kẻ phụ bạc, nên mỗi lần muỗi lại gần, người ta không tiếc tay đập cho nó chết."))
    }

    private fun setUpRecyclerview() {
        adapter = TopicAdapter(this, listTopic)
        var linearLayoutManager = LinearLayoutManager(this)
        rcv_topic.adapter = adapter
        rcv_topic.layoutManager = linearLayoutManager
//        var itemDecoration: RecyclerView.ItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
//        rcv_topic.addItemDecoration(itemDecoration)
    }

    private fun addListTopic() {
        listTopic.add(ItemTopic("Cổ Tích Việt Nam", listStoryCTVN))
        listTopic.add(ItemTopic("Cổ Tích Thế Giới", listStoryCTTG))
        listTopic.add(ItemTopic("Truyện Dân Gian", listStoryTDG))
        listTopic.add(ItemTopic("Truyện Ngụ Ngôn", listStoryTNN))
        listTopic.add(ItemTopic("Truyện Cười", listStoryTC))
        listTopic.add(ItemTopic("Quà Tặng Cuộc Sống", listStoryQTCS))
    }
}