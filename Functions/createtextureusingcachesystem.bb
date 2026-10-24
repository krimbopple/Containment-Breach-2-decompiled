Function createtextureusingcachesystem%(arg0%, arg1%, arg2%, arg3%, arg4%)
    Local local0.textureincache
    local0 = (New textureincache)
    local0\Field0 = "CTUCS"
    local0\Field1 = arg4
    local0\Field2 = createtexture(arg0, arg1, arg2, arg3)
    Return local0\Field2
    Return $00
End Function
