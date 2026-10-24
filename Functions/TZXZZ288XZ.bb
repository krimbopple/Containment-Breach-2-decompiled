Function TZXZZ288XZ%(arg0%, arg1%, arg2%)
    Local local0%
    Local local1%
    Local local2.materials
    Local local3$
    local0 = (((arg1 And $30000) <> $00) And (arg1 <> $FFFFFFFF))
    If (((arg1 = $FFFFFFFF) Lor local0) <> 0) Then
        If (local0 = $00) Then
            arg1 = $00
        EndIf
        local1 = getbrushtexture(arg0, $00)
        If (local1 <> $00) Then
            local2 = E26BXZ64D(local1)
            local3 = texturename(local1)
            If (local2 <> Null) Then
                DD0FFB82B(local2)
                If (X0Z8BF4B04(local2, $01) <> 0) Then
                    arg1 = (arg1 Or $02)
                EndIf
                If (X0Z8BF4B04(local2, $02) <> 0) Then
                    arg1 = (arg1 Or $04)
                EndIf
                If (X0Z8BF4B04(local2, $03) <> 0) Then
                    arg1 = (arg1 Or $08)
                EndIf
                If (X0Z8BF4B04(local2, $04) <> 0) Then
                    arg1 = (arg1 Or $80)
                EndIf
                If (X0Z8BF4B04(local2, $05) <> 0) Then
                    arg1 = (arg1 Or $100)
                EndIf
                If (local2\Field16 <> $00) Then
                    arg1 = (arg1 Or $10)
                EndIf
                If ((local2\Field9 Lor (getbrushblend(arg0) > $00)) <> 0) Then
                    arg1 = (arg1 Or $40)
                EndIf
                If (local2\Field11 <> 0) Then
                    arg1 = (arg1 Or $200)
                EndIf
                If (local2\Field6 <> 0) Then
                    arg1 = (arg1 Or $800)
                EndIf
                If (local2\Field17 <> 0) Then
                    arg1 = (arg1 Or $2000)
                EndIf
                brushtexture(arg0, TXFBF2FDF06(local2, $01), $00, $01)
                brushtexture(arg0, TXFBF2FDF06(local2, $02), $00, $02)
                brushtexture(arg0, TXFBF2FDF06(local2, $03), arg2, $03)
                brushtexture(arg0, TXFBF2FDF06(local2, $04), $00, $04)
                brushtexture(arg0, TXFBF2FDF06(local2, $05), $00, $05)
                brushshininess(arg0, 0.0, 0.0)
                If (local2\Field0 <> 0) Then
                    brushmaterial(arg0, local2\Field5, local2\Field12)
                ElseIf (X0Z8BF4B04(local2, $02) <> 0) Then
                    brushmaterial(arg0, 0.0, 0.0)
                EndIf
            ElseIf ((arg1 And $20000) = $00) Then
                brushmaterial(arg0, 1.0, 0.0)
            ElseIf (getbrushblend(arg0) > $00) Then
                arg1 = (arg1 Or $40)
            EndIf
            If ((textureflags(local1) And $04) <> $00) Then
                arg1 = (arg1 Or $200)
            EndIf
            freetexture(local1)
            local1 = $00
            If ((((local2 = Null) And ((arg1 And $20000) <> $00)) And (local3 = "")) <> 0) Then
                Return $00
            EndIf
        EndIf
    EndIf
    arg1 = (arg1 And (arg1 Xor $30000))
    brusheffect(arg0, XF66828X2X(arg1))
    Return $00
End Function
