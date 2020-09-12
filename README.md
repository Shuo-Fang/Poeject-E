-------------------------------------------
安装环境之前的准备
==============================

有关更详细的说明，请参阅在线Forge文档:
http://mcforge.readthedocs.io/en/latest/gettingstarted/

第一步: 打开命令行并浏览到您当前项目路径地址

第二步: 你需要根据你的IDE做出选择.

如果您喜欢使用Eclipse:

1. 运行以下命令
2. 运行命令"gradlew genEclipseRuns" (如果你使用的是Mac/Linux或者是Windows在上述命令不生效时输入以下命令: "./gradlew genEclipseRuns".)此步需要下载运行环境，可能需要一小时左右。
3. 运行命令 "gradlew eclipse"(如果你使用的是Mac/Linux或者是Windows在上述命令不生效时输入以下命令:"./gradlew eclipse".)
4. 打开Eclipse, Import > Existing Gradle Project > Select Folder 导入项目
5. Open Project > Run/Debug Settings > Edit runClient and runServer > Environment (环境适配,可以在build path中设置,需要JDK1.8,UTF-8编码)
6. 在生成的runClient.launch和runServer.launch文件中修改MC_VERSION为1.12.2
7. 运行runClient和runServer查看是否成功
8. 正式编辑程序

如果您喜欢使用IntelliJ:
1. 打开IDEA,导入项目.
2. 选择你的build.gradle文件进行导入.
3. 运行命令: "gradlew genIntellijRuns" (如果你使用的是Mac/Linux或者是Windows在上述命令不生效时输入以下命令:"./gradlew genIntellijRuns")
4. 在idea中刷新Gradle Project.
5. 余下步骤同eclipse中6,7,8

如果在IDE中缺少库，或者遇到问题，可以运行"gradlew --refresh-dependencies" 来刷新本地缓存。"gradlew clean" 重置一切环境(这不会影响你的代码)，然后再次初始化环境。命令若报错可以尝试在前面加上"./"指定本地

如果还是不行，参考#ForgeGradle在EsperNet上获得更多关于gradle环境的信息。
或者是本地环境与项目不和 discord.gg/UvedJ9m