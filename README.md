# huaweicloud-demo

一些基于华为云的Demo程序。

## 环境搭建

* 申请华为云账号，创建访问凭证，并将AKSK配置到 `credentials` 文件
* 设置Docker运行环境
    - Windows下使用本地虚拟机，添加环境变量：DOCKER_HOST=http://192.168.56.101:2375

## 编译构建和运行

1. 构建应用和Docker镜像
```bash
mvn clean package -Pdocker
```

2. 运行微服务
```bash
docker run -it -d --env-file=credentials helloworld:0.0.1
```

3. 登录华为云查看微服务运行信息。