local welcome = 'Hello world'
ngx.say(welcome)
--获取uri的请求参数
local args, err = ngx.req.get_uri_args()
for key, val in pairs(args) do
    if type(val) == "table" then
        ngx.say(key, ": ", table.concat(val, ", "))
    else
        ngx.say(key, ": ", val)
    end
end
--获取uri https://blog.csdn.net/xiejunna/article/details/71647281
local request_uri = ngx.var.request_uri
ngx.say(request_uri)
--获取服务器的地址
local server_name= ngx.var.server_name
ngx.say(server_name)