# IDEA 调试快捷键

如果快捷键和本表不同，说明 IDEA 使用的 keymap 不一样。可以在 `Settings/Preferences -> Keymap` 里搜索动作名。

| 动作名 | macOS | Windows/Linux | 说明 |
| --- | --- | --- | --- |
| Toggle Line Breakpoint | `Command + F8` | `Ctrl + F8` | 添加或取消断点 |
| Debug | `Control + D` | `Shift + F9` | 调试启动 |
| Resume Program | `Option + Command + R` | `F9` | 继续运行 |
| Step Over | `F8` | `F8` | 执行下一行，不进入方法 |
| Step Into | `F7` | `F7` | 进入方法 |
| Force Step Into | `Option + Shift + F7` | `Alt + Shift + F7` | 强制进入方法 |
| Step Out | `Shift + F8` | `Shift + F8` | 跳出当前方法 |
| Run to Cursor | `Option + F9` | `Alt + F9` | 运行到光标行 |
| Evaluate Expression | `Option + F8` | `Alt + F8` | 计算表达式 |
| View Breakpoints | `Command + Shift + F8` | `Ctrl + Shift + F8` | 查看断点列表 |

## 断点调试时重点看什么

- Variables：当前变量的值
- Frames：当前方法调用栈
- Watches：自己添加想观察的表达式
- Console：程序输出

## 常见调试动作选择

- 不想进方法内部：Step Over
- 想看方法内部怎么执行：Step Into
- 当前方法看够了：Step Out
- 想跳到后面某一行：Run to Cursor
- 想临时算一个表达式：Evaluate Expression
