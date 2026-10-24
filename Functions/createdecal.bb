Function createdecal.decals(arg0%, arg1#, arg2#, arg3#, arg4#, arg5#, arg6#, arg7#, arg8#, arg9%, arg10%, arg11%, arg12%, arg13%)
    Local local0.decals
    If (((arg0 > $1A) Lor (de_i\Field0[arg0] = $00)) <> 0) Then
        runtimeerrorex(format(getlocalstring("runerr", "decals"), (Str arg0), "%s"))
    EndIf
    local0 = (New decals)
    local0\Field7 = arg0
    local0\Field9 = arg7
    local0\Field12 = arg8
    local0\Field6 = arg9
    local0\Field10 = arg10
    local0\Field8 = arg11
    local0\Field13 = arg12
    local0\Field11 = arg13
    local0\Field3 = 1.0
    local0\Field0 = A464F2006(XFD8XF28B2(arg0, arg9, arg10), $00)
    positionentity(local0\Field0, arg1, arg2, arg3, $01)
    scaleentity(local0\Field0, arg7, arg7, 1.0, $01)
    rotateentity(local0\Field0, arg4, arg5, arg6, $01)
    entityalpha(local0\Field0, arg8)
    If ((((arg11 <> $00) Lor (arg12 <> $00)) Lor (arg13 <> $00)) <> 0) Then
        entitycolor(local0\Field0, (Float arg11), (Float arg12), (Float arg13))
    EndIf
    showentity(local0\Field0)
    maskentity(local0\Field0, $20)
    local0\Field4 = X0D8ZZBB4F(local0\Field0, $00)
    entitydestructor(local0\Field0, FuncPtr(DBFX60D84))
    Return local0
    Return Null
End Function
