@import(MyGood.class)  注册普通BEAN时

使用时 不要用@Autowired  要用
@Resource(name="com.huawei.sde.imm.busiservice.MyGood")  要全名 这样才能调用
 private MyGood one;


@import 可以用再 @Configuate 

也可以用在当前使用的 service层
@import(MyGood.class)
@Service
