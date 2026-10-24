Function XFD8XF28B2%(arg0%, arg1%, arg2%)
    Local local0.C20Z244FB
    For local0 = Each C20Z244FB
        If ((((local0\Field2 = arg0) And (local0\Field3 = arg1)) And (local0\Field1 = arg2)) <> 0) Then
            Return local0\Field0
        EndIf
    Next
    local0 = (New C20Z244FB)
    local0\Field0 = createquad($00)
    local0\Field2 = arg0
    local0\Field3 = arg1
    local0\Field1 = arg2
    YX2D2860X(local0\Field0, $00, $10040)
    entityfx(local0\Field0, arg1)
    entityblend(local0\Field0, arg2)
    entityalpha(local0\Field0, 1.0)
    entitytexture(local0\Field0, de_i\Field0[arg0], $00, $00)
    X8F80Z2886(local0\Field0, $10040, $00)
    TXZDB8BD842(local0\Field0)
    maskentity(local0\Field0, $20)
    Return local0\Field0
    Return $00
End Function
