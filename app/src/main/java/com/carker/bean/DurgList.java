package com.carker.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by PC on 2015/9/29.
 */
public class DurgList {

    /**
     * total : 12344
     * tngou : [{"count":142,"description":"保健功能抗氧化","fcount":0,"id":12376,"img":"/drug/081010/042ceda338694ac46ff83ac498cb793a.jpg","keywords":"展开 收起 抗氧化 提取物 注意事项 ","name":"博尔腾牌银杏首乌胶囊","price":313,"rcount":0,"tag":"中风偏瘫","type":"保健食品"},{"count":82,"description":"保健功能抗疲劳、耐缺氧","fcount":0,"id":12375,"img":"/drug/081010/6714e6e4d5cbbeaafdef73e053a78b36.jpg","keywords":"展开 收起 抗疲劳 缺氧 温开水 ","name":"特安呐牌三七力康片","price":587,"rcount":0,"tag":"中风偏瘫","type":""},{"count":67,"description":"保健功能免疫调节","fcount":0,"id":12374,"img":"/drug/081010/e671ffa1b4b0f02acc7b4b44b368ffe1.jpg","keywords":"免疫调节 展开 收起 口服 注意事项 ","name":"参灵胶囊","price":842,"rcount":0,"tag":"肺癌","type":""},{"count":49,"description":"保健功能增加骨密度","fcount":0,"id":12373,"img":"/drug/081010/789358a40fa9a4769f494c15343923a9.jpg","keywords":"营养素 骨密度 本品 收起 展开 ","name":"维固康牌增加骨密度胶囊","price":0,"rcount":0,"tag":"骨关节炎","type":"保健食品"},{"count":47,"description":"保健功能增加骨密度","fcount":0,"id":12372,"img":"/drug/081010/f64d2c2a59fc904a48fbba34ba61968a.jpg","keywords":"营养素 硫酸软骨素 氨基葡萄糖 本品 收起 ","name":"艾兰得牌氨基葡萄糖硫酸软骨素片","price":0,"rcount":0,"tag":"骨关节炎,维生素","type":""},{"count":42,"description":"保健功能增强免疫力","fcount":0,"id":12371,"img":"/drug/081010/0a83ba554e45fd736cff3bf8f84562b6.jpg","keywords":"免疫力 展开 收起 孢子粉 注意事项 ","name":"仙芝楼牌破壁灵芝孢子粉胶囊","price":598,"rcount":0,"tag":"胃癌","type":"保健食品"},{"count":47,"description":"保健功能增强免疫力、对化学性肝损伤有辅助保护功能","fcount":0,"id":12370,"img":"/drug/081010/cb9866c7fbc2f50756a6dc053d5c3eea.jpg","keywords":"化学性 免疫力 收起 提取物 损伤 ","name":"仙芝楼牌孢子灵芝提取物粉","price":783,"rcount":0,"tag":"胃癌","type":"保健食品"},{"count":50,"description":"用法用量口服。一次5克(1袋)，一日3次;或遵医嘱。","fcount":0,"id":12369,"img":"/drug/081010/1462ba63d80d5194eca853fab1a58221.jpg","keywords":"云南省 医嘱 高脂血症 包装 高新技术开发区 ","name":"三七脂肝丸","price":292,"rcount":0,"tag":"脂肪肝","type":"中成药"},{"count":38,"description":"保健功能养肝片将现代营养学理论与中医药养生保健理论有机结合，可以清除自由基，促进细胞再生，加速体内有害物质分解，解除毒害。有效防治各类化学性肝损伤、解酒护肝、...","fcount":0,"id":12368,"img":"/drug/081010/f86f897e22555848f58bce3de9ec79c4.jpg","keywords":"酒精肝 脂肪肝 促进 体内 脂肪 ","name":"体恒健牌养肝片","price":0,"rcount":0,"tag":"酒精肝,脂肪肝,心脑血管,恶心呕吐,肝硬化,肝纤维化,高血脂,食欲不振","type":""},{"count":36,"description":"保健功能改善睡眠、增加骨密度","fcount":0,"id":12367,"img":"/drug/081010/d17cfee6ce7017419bbe432761974e79.jpg","keywords":"收起 骨密度 展开 睡眠 少年儿童 ","name":"静心R助眠口服液","price":0,"rcount":0,"tag":"内分泌失调","type":""},{"count":39,"description":"保健功能改善睡眠、改善胃肠道功能","fcount":0,"id":12366,"img":"/drug/081010/be147427f40fdbf2fb9d2df38455e626.jpg","keywords":"改善 收起 功能 展开 胃肠道 ","name":"自然静牌乌蒙软胶丸","price":0,"rcount":0,"tag":"便秘","type":"保健食品"},{"count":39,"description":"保健功能减肥","fcount":0,"id":12365,"img":"/drug/081010/42b456c7f73d15bbc03554f26e6b0e98.jpg","keywords":"北京市 收起 展开 联系电话 本品 ","name":"碧生源牌减肥茶","price":35,"rcount":0,"tag":"肥胖症","type":"保健食品"},{"count":35,"description":"保健功能缓解视疲劳、抗氧化","fcount":0,"id":12364,"img":"/drug/081010/e012a7c6c65c4cee0ab35de54332e1ae.jpg","keywords":"营养素 本品 纤维素 收起 不宜 ","name":"博士伦博视康牌叶黄素片","price":0,"rcount":0,"tag":"眼科用药,维生素","type":"进口药品"},{"count":36,"description":"保健功能补充钙、铁、锌","fcount":0,"id":12363,"img":"/drug/081010/381c43262729b059aa598617819a5934.jpg","keywords":"补充 每次 每日 收起 营养素 ","name":"哈药牌钙铁锌口服液","price":119,"rcount":0,"tag":"补钙补锌","type":""},{"count":49,"description":"用法用量口服。成人：每次2袋，每天2次；三岁以上儿童：每次1袋，每天2次；三岁以下儿童：每次1袋，每天1次；将小袋...","fcount":0,"id":12361,"img":"/drug/081010/07b05edb2185fb47a2c8046581344685.jpg","keywords":"本品 禁用 患者 儿童 每天 ","name":"布拉氏酵母菌散","price":0,"rcount":0,"tag":"止泻类","type":"生物制品"},{"count":48,"description":"适应症 慢性便秘，急性便秘；憩室和肠易激综合症等胃肠功能紊乱；痔疮、肛裂的辅助治疗；结肠造瘘术和回肠切除术后恢复期的辅助治疗；还可用于应该避免大便秘结的患者如...","fcount":0,"id":12360,"img":"/drug/081010/ec56683b99387a65c928ed7701b63ece.jpg","keywords":"患者 本品 纤维素 注意事项 粪便 ","name":"小麦纤维素颗粒","price":0,"rcount":0,"tag":"便秘,痔疮,过敏,糖尿病,痔疮便秘便血","type":"化学药品"},{"count":37,"description":"用法用量本品可用于肌肉注射，在注射前可将粉末溶于生理盐水注射液中，为避免注射容量过大，可将本品5瓶溶于1ml的溶...","fcount":0,"id":12359,"img":"/drug/081010/c8043871e75ba95726dd07e147c513e6.jpg","keywords":"本品 治疗 卵巢 枸橼酸 克罗米 ","name":"注射用尿促卵泡激素","price":0,"rcount":0,"tag":"内分泌失调,过敏","type":"化学药品"},{"count":38,"description":"脑血管病（中风）","fcount":0,"id":12358,"img":"/drug/081010/73d87f5365875003c339782123435ae5.jpg","keywords":"展开 收起 缺血性 生产 经济开发区 ","name":"葛酮通络胶囊","price":598,"rcount":0,"tag":"脑血管病（中风）","type":"中成药"},{"count":53,"description":"适应症 本品用于缓解骨关节炎的疼痛症状，适用于男性及治疗期间无生育要求的妇女。","fcount":0,"id":12357,"img":"/drug/081010/f321c3c99eb8ae3289b252e214370772.jpg","keywords":"患者 抑制作用 细胞色素氧化酶 心血管 本品 ","name":"艾瑞昔布片","price":0,"rcount":0,"tag":"哮喘,便秘,荨麻疹,骨关节炎,过敏,其他,胃炎","type":"化学药品"},{"count":59,"description":"骨癌","fcount":0,"id":12356,"img":"/drug/081010/d1d4f40d981a65a3072bb7ab6eb1ab5f.jpg","keywords":"多发性骨髓瘤 综合症 名称 商品名称 英文名称 ","name":"来那度胺胶囊","price":0,"rcount":0,"tag":"骨癌","type":"化学药品"}]
     */

    @SerializedName("total")
    private int total;
    @SerializedName("tngou")
    private List<TngouEntity> tngou;

    public static DurgList objectFromData(String str) {

        return new Gson().fromJson(str, DurgList.class);
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setTngou(List<TngouEntity> tngou) {
        this.tngou = tngou;
    }

    public int getTotal() {
        return total;
    }

    public List<TngouEntity> getTngou() {
        return tngou;
    }

    public static class TngouEntity {
        /**
         * count : 142
         * description : 保健功能抗氧化
         * fcount : 0
         * id : 12376
         * img : /drug/081010/042ceda338694ac46ff83ac498cb793a.jpg
         * keywords : 展开 收起 抗氧化 提取物 注意事项
         * name : 博尔腾牌银杏首乌胶囊
         * price : 313
         * rcount : 0
         * tag : 中风偏瘫
         * type : 保健食品
         */

        @SerializedName("count")
        private int count;
        @SerializedName("description")
        private String description;
        @SerializedName("fcount")
        private int fcount;
        @SerializedName("id")
        private int id;
        @SerializedName("img")
        private String img;
        @SerializedName("keywords")
        private String keywords;
        @SerializedName("name")
        private String name;
        @SerializedName("price")
        private int price;
        @SerializedName("rcount")
        private int rcount;
        @SerializedName("tag")
        private String tag;
        @SerializedName("type")
        private String type;

        public static TngouEntity objectFromData(String str) {

            return new Gson().fromJson(str, TngouEntity.class);
        }

        public void setCount(int count) {
            this.count = count;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setFcount(int fcount) {
            this.fcount = fcount;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setRcount(int rcount) {
            this.rcount = rcount;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getCount() {
            return count;
        }

        public String getDescription() {
            return description;
        }

        public int getFcount() {
            return fcount;
        }

        public int getId() {
            return id;
        }

        public String getImg() {
            return img;
        }

        public String getKeywords() {
            return keywords;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public int getRcount() {
            return rcount;
        }

        public String getTag() {
            return tag;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "TngouEntity{" +
                    "count=" + count +
                    ", description='" + description + '\'' +
                    ", fcount=" + fcount +
                    ", id=" + id +
                    ", img='" + img + '\'' +
                    ", keywords='" + keywords + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", rcount=" + rcount +
                    ", tag='" + tag + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "DurgList{" +
                "total=" + total +
                ", tngou=" + tngou +
                '}';
    }
}
