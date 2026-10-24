Function T444ZXX602%(arg0%, arg1%)
    Local local0#
    local0 = (70.0 / (Float arg1))
    If (T8X2046020\Field19[arg0] = $00) Then
        T8X2046020\Field19[arg0] = $01
        T8X2046020\Field7[arg0] = (((Float arg0) * 1.2) Mod local0)
    EndIf
    T8X2046020\Field7[arg0] = (T8X2046020\Field7[arg0] + TX8FF82X024())
    If (local0 < T8X2046020\Field7[arg0]) Then
        T8X2046020\Field7[arg0] = 0.0
        Return $01
    EndIf
    Return $00
    Return $00
End Function
