# Java 基础入门 Demo

这个项目给 Java 初学者使用，所有 demo 都放在 `src/main/java/com/example/javabasic` 下，并且每个 demo 类都有自己的 `main` 方法，可以在 IDEA 里单独运行。

目录和文件已经按学习顺序编号：先看 `p01_start`，再看 `p02_syntax`；每个文件夹里再从 `D01...`、`D02...` 往后调试。这样在 IDEA 或 GitHub 里按名称排序，就是推荐学习顺序。

## 适合谁

- 刚开始学 Java 的学生
- 已经会一点语法，但不清楚每个知识点怎么写代码的人
- 想用 IDEA 练习断点调试的人

## 环境准备

### 1. 安装 JDK

本项目按 Java 8 编译，装 JDK 8 或更高版本都可以。

推荐版本：

- 新手兼容优先：JDK 8
- 后续长期学习：JDK 17 或 JDK 21

检查是否安装成功：

```bash
java -version
javac -version
```

### 2. 安装 Maven

检查 Maven：

```bash
mvn -version
```

如果只是用 IDEA 运行单个 `main` 方法，不会 Maven 也可以先学。但会 Maven 后，后面学习 Spring Boot 会顺很多。

### 3. 安装 IntelliJ IDEA

建议安装 IntelliJ IDEA Community Edition，免费版足够学习 Java 基础。

导入方式：

1. 打开 IDEA
2. 选择 `Open`
3. 选择本项目目录
4. 等待 Maven 自动加载
5. 从 `p01_start/D01HelloWorldDemo.java` 开始
6. 点击 `main` 方法左侧绿色运行按钮

## 命令行运行

编译整个项目：

```bash
mvn clean compile
```

运行某个 demo，例如 HelloWorld：

```bash
mvn -q exec:java -Dexec.mainClass=com.example.javabasic.p01_start.D01HelloWorldDemo
```

如果没有配置 `exec-maven-plugin`，也可以优先在 IDEA 里运行。

## 学习顺序

建议按下面顺序学，不要一上来跳到集合和 Stream。

1. `p01_start`：HelloWorld、输出、注释、小练习
2. `p02_syntax`：变量、数据类型、类型转换、运算符、流程控制、输入
3. `p03_string`：String 常见函数、比较、StringBuilder、格式化、正则
4. `p04_array`：一维数组、二维数组、数组常见算法
5. `p05_method`：方法、返回值、重载、递归
6. `p06_oop`：类和对象、封装、继承、多态、接口、抽象类、枚举
7. `p07_exception`：异常捕获、主动抛异常、自定义异常
8. `p08_collection`：List、Set、Map、Iterator、泛型、Collections 工具类
9. `p09_modern`：Lambda、Stream、Optional、日期时间、BigDecimal
10. `p10_io`：File、文件读写、try-with-resources
11. `p11_debug`：断点调试练习

## Demo 清单

### p01_start

- `D01HelloWorldDemo`：第一个 Java 程序
- `D02CommentsAndPrintDemo`：注释和打印输出
- `D03MiniPracticeDemo`：输入三科成绩并计算总分、平均分、等级

### p02_syntax

- `D01VariableDemo`：变量、常量、交换变量
- `D02DataTypeDemo`：8 种基本类型、范围、整数溢出
- `D03TypeConversionDemo`：自动转换、强制转换、整数除法
- `D04OperatorDemo`：算术、比较、逻辑、三元运算符
- `D05ControlFlowDemo`：if、switch、for、while、break、continue
- `D06InputScannerDemo`：Scanner 控制台输入
- `D07ScopeDemo`：变量作用域
- `D08WrapperClassDemo`：包装类、自动装箱拆箱、字符串转数字
- `D09MathRandomDemo`：Math 和 Random

### p03_string

- `D01StringBasicDemo`：String 基础用法
- `D02StringCommonFunctionsDemo`：常见 String 函数
- `D03StringCompareDemo`：`==` 和 `equals` 区别
- `D04StringBuilderDemo`：字符串高效拼接
- `D05StringFormatAndRegexDemo`：格式化、正则匹配、替换

### p04_array

- `D01ArrayBasicDemo`：数组定义、访问、修改、遍历
- `D02ArrayAlgorithmDemo`：求和、平均值、最大值、最小值、排序、查找
- `D03TwoDimensionalArrayDemo`：二维数组

### p05_method

- `D01MethodBasicDemo`：定义方法、参数、返回值
- `D02MethodOverloadDemo`：方法重载
- `D03RecursionDemo`：递归、阶乘、斐波那契

### p06_oop

- `D01Student`：封装示例类
- `D02ClassAndObjectDemo`：类和对象
- `D03StaticDemo`：static 变量和方法
- `D04InheritanceDemo`：继承
- `D05PolymorphismDemo`：多态
- `D06InterfaceDemo`：接口
- `D07AbstractClassDemo`：抽象类
- `D08EnumDemo`：枚举
- `D09EqualsHashCodeDemo`：equals 和 hashCode

### p07_exception

- `D01ExceptionBasicDemo`：try/catch/finally
- `D02ThrowExceptionDemo`：主动抛出运行时异常
- `D03CustomExceptionDemo`：自定义异常

### p08_collection

- `D01ListDemo`：ArrayList 常见操作
- `D02SetDemo`：HashSet、LinkedHashSet、TreeSet
- `D03MapDemo`：HashMap 常见操作
- `D04GenericsDemo`：泛型类、泛型方法
- `D05CollectionsUtilityDemo`：Collections 工具类、排序
- `D06IteratorDemo`：Iterator 安全删除元素

### p09_modern

- `D01LambdaDemo`：Lambda 和函数式接口
- `D02StreamDemo`：filter、map、sum、groupingBy
- `D03OptionalDemo`：Optional 避免空值判断混乱
- `D04DateTimeDemo`：LocalDate、LocalTime、LocalDateTime
- `D05BigDecimalDemo`：金额计算

### p10_io

- `D01FileBasicDemo`：File 文件和目录操作
- `D02FileReadWriteDemo`：NIO 文件读写
- `D03TryWithResourcesDemo`：自动关闭资源

### p11_debug

- `D01DebugDemo`：练习断点、单步执行、查看变量

## IDEA 断点和调试快捷键

常用动作如下。不同 keymap 可能略有差异，如果快捷键不生效，在 IDEA 里打开 `Settings/Preferences -> Keymap` 搜索动作名。

| 动作 | macOS | Windows/Linux | 用途 |
| --- | --- | --- | --- |
| Toggle Line Breakpoint | `Command + F8` | `Ctrl + F8` | 在当前行添加或取消断点 |
| Debug 当前配置 | `Control + D` | `Shift + F9` | 用调试模式启动程序 |
| Resume Program | `Option + Command + R` | `F9` | 继续运行到下一个断点 |
| Step Over | `F8` | `F8` | 单步执行，不进入方法内部 |
| Step Into | `F7` | `F7` | 进入当前调用的方法内部 |
| Force Step Into | `Option + Shift + F7` | `Alt + Shift + F7` | 强制进入方法内部 |
| Step Out | `Shift + F8` | `Shift + F8` | 跳出当前方法 |
| Run to Cursor | `Option + F9` | `Alt + F9` | 运行到光标所在行 |
| Evaluate Expression | `Option + F8` | `Alt + F8` | 临时执行表达式、查看计算结果 |
| View Breakpoints | `Command + Shift + F8` | `Ctrl + Shift + F8` | 查看所有断点 |

推荐练习：

1. 打开 `p11_debug/D01DebugDemo`
2. 在 `boolean passed = score >= 60;` 这一行打断点
3. 点击 Debug 运行
4. 每次按 Step Over，看 `i`、`score`、`passed`、`count` 怎么变化
5. 修改数组里的分数，再重新调试

## 新手必须掌握的易错点

- Java 文件名要和 `public class` 类名一致
- `main` 方法签名固定：`public static void main(String[] args)`
- 字符串内容比较用 `equals`，不要用 `==`
- 整数除法会丢掉小数，例如 `10 / 3 == 3`
- 数组下标从 `0` 开始，最后一个下标是 `length - 1`
- 局部变量必须先赋值再使用
- `NullPointerException` 通常是对象为 `null` 时还调用了方法
- 金额计算不要用 `double`，用 `BigDecimal`
- 从集合中边遍历边删除，优先用 `Iterator`
- 异常不是用来替代 if 判断的，能提前校验就提前校验

## 建议练习题

完成下面练习，比单纯看 demo 更有效：

1. 写一个成绩等级判断：90 以上优秀，80 以上良好，60 以上及格，否则不及格
2. 输入 5 个整数，求最大值、最小值、平均值
3. 判断一个字符串是不是手机号
4. 统计一句话里每个单词出现的次数
5. 创建 `Book` 类，包含书名、作者、价格，并放进 `List`
6. 用 `Map<String, Integer>` 做一个学生成绩表
7. 用 `BigDecimal` 计算购物车总价
8. 读取文本文件，每行一个成绩，计算平均分

## 学完 Java 基础后学什么

建议路线：

1. Java 基础语法和 OOP
2. 集合、泛型、异常、IO
3. Maven、JUnit、日志
4. MySQL 和 JDBC
5. HTML、CSS、JavaScript 基础
6. Spring Boot
7. MyBatis 或 MyBatis-Plus
8. Redis、消息队列、Linux、Docker
9. 做一个完整小项目，例如学生管理系统、图书管理系统、博客系统
