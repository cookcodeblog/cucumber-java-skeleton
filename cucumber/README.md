

Add `***\cucumber\bin` folder in `Path` system env variable.

And run `cucumber --help` in Git bash.

查看cucumber支持哪些语言：

```bash
cucumber --i18n help
```

查看cucumber的中文（简体）支持：

```
cucumber --i18n zh-CN
```

Git Bash命令行中文乱码问题：

1. 打开Git Bash, 右键Option，选择Text，在Locale中输入`zh_CN`，在Character set中输入`UTF-8`
2. 保存，并重启GitBah
3. 在启动`cucumber.api.cli.Main`的命令中传入`-Dfile.encoding=UTF-8`
```bash
"${JAVA_HOME}/bin/java" -Dfile.encoding=UTF-8 -cp "$CLASSPATH" cucumber.api.cli.Main "$@"
```

