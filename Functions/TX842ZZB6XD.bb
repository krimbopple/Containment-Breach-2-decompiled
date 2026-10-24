Function TX842ZZB6XD%(arg0.items, arg1%)
    Local local0.T24B4ZF6F6
    arg0\Field29 = $00
    If (arg0\Field6\Field11 > $00) Then
        local0 = X4DZBDB0DZ(arg0\Field6\Field11)
        If (((local0 <> Null) And (local0\Field3\Field9 = $00)) <> 0) Then
            arg0\Field31 = $06
            TXB0F04BDZ4(arg0)
        EndIf
    EndIf
    Select arg0\Field6\Field9
        Case $2B
            arg0\Field31 = $01
        Case $2E,$2D,$13,$7C
            arg0\Field31 = $02
        Case $49,$4B,$4C,$4A,$48,$40,$41,$42,$43,$44,$4D,$4E,$4F
            arg0\Field31 = $03
        Case $3C,$3D,$3E,$3F
            arg0\Field31 = $04
        Case $61,$62
            arg0\Field31 = $05
        Case $45,$46,$47
            arg0\Field31 = $07
            arg0\Field3 = 100.0
            If (arg0\Field6\Field9 = $47) Then
                arg0\Field15 = 1.0
            EndIf
    End Select
    arg0\Field26 = 35.0
    X02FXD2BF6(arg0, arg1)
    Return $00
End Function
