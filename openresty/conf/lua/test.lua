local welcome = 'Hello world..'
ngx.log(ngx.INFO,welcome)
--获取uri的请求参数
local args, err = ngx.req.get_uri_args()
for key, val in pairs(args) do
    if type(val) == "table" then
        ngx.log(ngx.INFO,key, ": ", table.concat(val, ", "))
    else
        ngx.log(ngx.INFO,key, ": ", val)
    end
end
--获取uri https://blog.csdn.net/xiejunna/article/details/71647281
local request_uri = ngx.var.request_uri
ngx.log(ngx.INFO,request_uri)
--获取服务器的地址
local server_name= ngx.var.server_name
ngx.log(ngx.INFO,server_name)

ngx.var.target_select ='Normal_8083'

-- 读取body https://github.com/openresty/lua-nginx-module#ngxreqget_uri_args
-- 目前没有找到form-data 只有application/x-www-form-urlencoded
ngx.req.read_body()
local args, err = ngx.req.get_post_args()
if err == "truncated" then
    -- one can choose to ignore or reject the current request here
end 
if not args then
    ngx.say("failed to get post args: ", err)
    return
end
for key, val in pairs(args) do
    if type(val) == "table" then
        ngx.say(key, ": ", table.concat(val, ", "))
    else
        ngx.say(key, ": ", val)
    end    
end
ngx.say(args["svc"])
-- 停止
