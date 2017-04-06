<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 17-4-6
  Time: 下午6:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta http-equiv="Content-Type"
          content="text/html; charset=UTF-8" />
    <title>Killer Home</title>
    <link rel="stylesheet" href="../css/basic.css">
    <style type="text/css">
        #cont1 {
            padding-bottom: 2px;
        }
        #ban1 {
            height: 85px;
            width: 100%;
        }

        #nav1 {
            height: 50px;
            width: 100%;
        }

        #nav2 {
            background-color: #4043ff;
            height: 22px;
            width: 100%;
        }
        #cont2 {
            background-color: #b9c8c8;
            margin: 2px;
            width: 162px;
        }
        #commit-button {
            width: 160px;
        }

    </style>
</head>
<body>
<div id="cont1" class="container">
    <div id="ban1" class="banner"></div>
    <div id="nav1" class="navigation"></div>
    <div id="nav2" class="navigation"></div>
    <div id="cont2" class="container">
        <div id="b1" class="block">
            <label>
                <input type="text" id="userName" name="User Name"/>
            </label>
        </div>
        <div id="b2" class="block">
            <label>
                <input type="text" id="passWord" name="Password"/>
            </label>
        </div>
        <div id="commit" class="block">
            <button id="commit-button">Commit</button>
        </div>
    </div>
</div>
</body>
</html>