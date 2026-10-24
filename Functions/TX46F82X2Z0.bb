Function TX46F82X2Z0%(arg0.TX2BF6X0FF4, arg1%, arg2%)
    Local local0.EZZ00XD2
    Local local1.X44ZF6442X
    local0 = arg0\Field55
    local1 = T60880B62X(arg1)
    If (local1 = Null) Then
        X400F44F02(arg0)
        If (local0\Field21 <> $00) Then
            local0\Field21 = $00
            Y8ZXXBB88(arg0)
        EndIf
        Return $00
    EndIf
    If (arg2 = $00) Then
        Select arg1
            Case $01
                If (((arg0\Field23 >= $00) And X6ZX20F8D6(arg0\Field23)) <> 0) Then
                    XX6XZBBFX4(arg0, arg0\Field23, $00)
                Else
                    XX6XZBBFX4(arg0, rand($01, $06), $00)
                EndIf
            Case $02
                XX6XZBBFX4(arg0, $07, $00)
            Case $0B
                XX6XZBBFX4(arg0, $12, $00)
            Case $0A
                XX6XZBBFX4(arg0, $13, $00)
            Case $09
                XX6XZBBFX4(arg0, $14, $00)
            Case $10
                XX6XZBBFX4(arg0, $1E, $00)
            Default
                XX6XZBBFX4(arg0, $00, $00)
        End Select
    Else
        XX6XZBBFX4(arg0, local0\Field4, $00)
    EndIf
    local0\Field18 = local1\Field13
    local0\Field12 = $00
    local0\Field4 = $00
    If (local0\Field21 <> arg1) Then
        local0\Field21 = arg1
        X400F44F02(arg0)
        Y8ZXXBB88(arg0)
    EndIf
    Return $00
End Function
