## 安装docker
>参考链接：https://www.jianshu.com/p/3a339072ca7d
1. 本机是windows 10专业版，BIOS中开启硬件虚拟化以及开启Hyper-V即可安装
2. 安装包：https://download.docker.com/
3. 默认安装即可
4. 配置镜像地址：使用中科大的镜像地址，右键->settings->docker daemon->registry-mirrors中增加地址"https://docker.mirrors.ustc.edu.cn"
## 安装 MariaDB
>参考链接：https://www.jianshu.com/p/32542630c2bd
1. 查询镜像 `docker search mariadb`
2. 下载镜像 `docker pull mariadb`，默认使用最新版本
3. 运行容器
```
D:\cmder
λ docker run -d -P --name mariadb_test -e MYSQL_ROOT_PASSWORD=my-secret-pw mariadb
efad1ade13755f72ad8d3a3d592f463a510e269978229b059434d397fbb2ee6f

D:\cmder
λ docker ps -a
CONTAINER ID        IMAGE               COMMAND                  CREATED              STATUS              PORTS                     NAMES
efad1ade1375        mariadb             "docker-entrypoint.sh"   About a minute ago   Up 59 seconds       0.0.0.0:32769->3306/tcp   mariadb_test
``` 
通过 -P 参数，Docker 会为我们自动分配一个未被使用的端口，这里是 32769，可以通过工具来测试一下是否能连接。
如果我们要自定义映射的端口，可以用 -p hostPort:containerPort 。
