Function TXXB002X4D0%(arg0%, arg1%, arg2%)
    Local local0%
    Local local1#
    Local local2#
    local0 = createsprite(arg2)
    scalesprite(local0, 1.0, ((Float arg1) / (Float arg0)))
    local1 = 0.0
    local2 = 0.0
    If (getgraphicslevel() < $64) Then
        local1 = (0.5 / (Float arg0))
        local2 = (0.5 / (Float arg1))
    EndIf
    moveentity(local0, (- local1), local2, 1.0001, $00)
    Return local0
    Return $00
End Function
