---
title: Web-Course-Exp
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
code_clipboard: true
highlight_theme: darkula
headingLevel: 2
generator: "@tarslib/widdershins v4.0.23"

---

# Web-Course-Exp

Base URLs:

# Authentication

- HTTP Authentication, scheme: bearer

# 待办 todo

## POST 新建待办 create

POST /todo/create

> Body 请求参数

```json
{
  "title": "string",
  "detail": "string",
  "begin": 0,
  "end": 0,
  "isFinished": true
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» title|body|string| 是 | 标题|none|
|» detail|body|string| 是 | 详情|none|
|» begin|body|integer¦null| 是 | 开始时间戳|none|
|» end|body|integer| 是 | 结束时间戳|none|
|» isFinished|body|boolean| 是 | 是否完成|none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "todoId": 0
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» todoId|integer|true|none||none|

## DELETE 删除待办 delete

DELETE /todo/delete

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|todoId|query|integer| 否 ||none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|

## POST 修改待办 update

POST /todo/update

> Body 请求参数

```json
{
  "todoId": 0,
  "title": "string",
  "detail": "string",
  "begin": 0,
  "end": 0,
  "isFinished": true
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|[Todo](#schematodo)| 否 | 待办 Todo|none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|

## GET 获取待办列表 list

GET /todo/list

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "data": [
    {
      "todoId": 0,
      "title": "string",
      "detail": "string",
      "begin": 0,
      "end": 0,
      "isFinished": true
    }
  ]
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» data|[[Todo](#schematodo)]|true|none||none|
|»» 待办 Todo|[Todo](#schematodo)|false|none|待办 Todo|none|
|»»» todoId|integer|true|none|ID|none|
|»»» title|string|true|none|标题|none|
|»»» detail|string|true|none|详情|none|
|»»» begin|integer¦null|true|none|开始时间戳|none|
|»»» end|integer|true|none|结束时间戳|none|
|»»» isFinished|boolean|true|none|是否完成|none|

## GET 获取指定待办 get

GET /todo/get

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|todoId|query|integer| 否 ||none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "data": {
    "todoId": 0,
    "title": "string",
    "detail": "string",
    "begin": 0,
    "end": 0,
    "isFinished": true
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» data|[Todo](#schematodo)|true|none|待办 Todo|none|
|»» todoId|integer|true|none|ID|none|
|»» title|string|true|none|标题|none|
|»» detail|string|true|none|详情|none|
|»» begin|integer¦null|true|none|开始时间戳|none|
|»» end|integer|true|none|结束时间戳|none|
|»» isFinished|boolean|true|none|是否完成|none|

## GET 获取今日待办 getToday

GET /todo/getToday

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|year|query|integer| 否 ||none|
|month|query|integer| 否 ||none|
|day|query|integer| 否 ||none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "data": [
    {
      "todoId": 0,
      "title": "string",
      "detail": "string",
      "begin": 0,
      "end": 0,
      "isFinished": true
    }
  ]
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» data|[[Todo](#schematodo)]|true|none||none|
|»» 待办 Todo|[Todo](#schematodo)|false|none|待办 Todo|none|
|»»» todoId|integer|true|none|ID|none|
|»»» title|string|true|none|标题|none|
|»»» detail|string|true|none|详情|none|
|»»» begin|integer¦null|true|none|开始时间戳|none|
|»»» end|integer|true|none|结束时间戳|none|
|»»» isFinished|boolean|true|none|是否完成|none|

## GET 切换完成状态 toggleFinish

GET /todo/toggleFinish

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|todoId|query|integer| 否 ||none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|

# 便签 note

## POST 新建便签 create

POST /note/create

> Body 请求参数

```json
{
  "noteId": 0,
  "title": "string",
  "content": "string"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» noteId|body|integer| 是 | ID|none|
|» title|body|string| 是 | 标题|none|
|» content|body|string| 是 | 内容|none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "noteId": 0
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» noteId|integer|true|none||none|

## DELETE 删除便签 delete

DELETE /note/delete

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|noteId|query|integer| 否 ||none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|

## POST 修改便签 update

POST /note/update

> Body 请求参数

```json
{
  "noteId": 0,
  "title": "string",
  "content": "string",
  "date": 0,
  "isStared": true
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|[Note](#schemanote)| 否 | 便签 Note|none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|

## GET 获取便签列表 list

GET /note/list

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "data": [
    {
      "noteId": 0,
      "title": "string",
      "content": "string",
      "date": 0,
      "isStared": true
    }
  ]
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» data|[[Note](#schemanote)]|true|none||none|
|»» 便签 Note|[Note](#schemanote)|false|none|便签 Note|none|
|»»» noteId|integer|true|none|ID|none|
|»»» title|string|true|none|标题|none|
|»»» content|string|true|none|内容|none|
|»»» date|integer|true|none|时间戳|none|
|»»» isStared|boolean|true|none|是否收藏|none|

## GET 获取指定便签 get

GET /note/get

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|noteId|query|integer| 否 ||none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "data": {
    "noteId": 0,
    "title": "string",
    "content": "string",
    "date": 0,
    "isStared": true
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» data|[Note](#schemanote)|true|none|便签 Note|none|
|»» noteId|integer|true|none|ID|none|
|»» title|string|true|none|标题|none|
|»» content|string|true|none|内容|none|
|»» date|integer|true|none|时间戳|none|
|»» isStared|boolean|true|none|是否收藏|none|

## GET 切换收藏状态 toggleStar

GET /note/toggleStar

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|noteId|query|integer| 否 ||none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|

# 用户 user

## POST 测试登录 check

POST /user/check

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "userId": 0
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» userId|integer|true|none||none|

## POST 用户注册 register

POST /user/register

> Body 请求参数

```json
{
  "email": "string",
  "password": "string",
  "avatar": "string"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» email|body|string| 是 ||none|
|» password|body|string| 是 ||none|
|» avatar|body|string| 是 ||none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "userId": 0
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» userId|integer|true|none||none|

## POST 用户登录 login

POST /user/login

> Body 请求参数

```json
{
  "email": "string",
  "password": "string"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» email|body|string| 是 ||none|
|» password|body|string| 是 ||none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "token": "string",
  "userId": 0,
  "avatar": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» token|string|true|none||none|
|» userId|integer|true|none||none|
|» avatar|string|true|none||none|

## POST 上传头像 uploadAvatar

POST /user/uploadAvatar

> Body 请求参数

```yaml
avatar: string

```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» avatar|body|string(binary)| 否 ||none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string",
  "avatar": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|
|» avatar|string|true|none||none|

## POST 更新用户 update

POST /user/update

> Body 请求参数

```json
{
  "userId": "string",
  "email": "string",
  "password": "string",
  "avatar": "string"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|[User](#schemauser)| 否 | 用户 User|none|

> 返回示例

> 200 Response

```json
{
  "status": 0,
  "message": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|成功|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» status|integer|true|none|状态|none|
|» message|string|true|none|信息|none|

# 数据模型

<h2 id="tocS_User">User</h2>

<a id="schemauser"></a>
<a id="schema_User"></a>
<a id="tocSuser"></a>
<a id="tocsuser"></a>

```json
{
  "userId": "string",
  "email": "string",
  "password": "string",
  "avatar": "string"
}

```

用户 User

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|userId|string|true|none||none|
|email|string|true|none||none|
|password|string|true|none||none|
|avatar|string|true|none||none|

<h2 id="tocS_Note">Note</h2>

<a id="schemanote"></a>
<a id="schema_Note"></a>
<a id="tocSnote"></a>
<a id="tocsnote"></a>

```json
{
  "noteId": 0,
  "title": "string",
  "content": "string",
  "date": 0,
  "isStared": true
}

```

便签 Note

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|noteId|integer|true|none|ID|none|
|title|string|true|none|标题|none|
|content|string|true|none|内容|none|
|date|integer|true|none|时间戳|none|
|isStared|boolean|true|none|是否收藏|none|

<h2 id="tocS_响应 Resp">响应 Resp</h2>

<a id="schema响应 resp"></a>
<a id="schema_响应 Resp"></a>
<a id="tocS响应 resp"></a>
<a id="tocs响应 resp"></a>

```json
{
  "status": 0,
  "message": "string"
}

```

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|status|integer|true|none|状态|none|
|message|string|true|none|信息|none|

<h2 id="tocS_Todo">Todo</h2>

<a id="schematodo"></a>
<a id="schema_Todo"></a>
<a id="tocStodo"></a>
<a id="tocstodo"></a>

```json
{
  "todoId": 0,
  "title": "string",
  "detail": "string",
  "begin": 0,
  "end": 0,
  "isFinished": true
}

```

待办 Todo

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|todoId|integer|true|none|ID|none|
|title|string|true|none|标题|none|
|detail|string|true|none|详情|none|
|begin|integer¦null|true|none|开始时间戳|none|
|end|integer|true|none|结束时间戳|none|
|isFinished|boolean|true|none|是否完成|none|

