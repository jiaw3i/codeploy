#!/bin/bash

# 命令行参数，需要提供三个参数：giturl、branch和buildcmd
giturl=$1
branch=$2
buildcmd=$3
tag=$4
cd /root/deployworkspace

# 获取项目目录名称
repo_name=$(basename $giturl .git)

# 在本地拉取代码
git clone $giturl -b $branch
cd $repo_name

# 执行构建命令
docker build -t repo_name:$tag -f Dockerfile .
