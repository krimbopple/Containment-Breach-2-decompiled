Function settemplatetexture%(arg0%, arg1%, arg2%, arg3%, arg4#)
    Local local0.template
    local0 = (Object.template arg0)
    local0\Field15 = p_i\Field0[arg1]
    local0\Field27 = arg2
    If (arg2 <> 0) Then
        local0\Field34 = arg3
        local0\Field8 = arg4
    EndIf
    Return $00
End Function
