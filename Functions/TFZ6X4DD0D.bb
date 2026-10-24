Function TFZ6X4DD0D%(arg0.items)
    Local local0%
    Local local1%
    Local local2%
    Local local4.items
    If (((X4BX024DX0() = $00) Lor TXB2BFFFFFX()) <> 0) Then
        Return $00
    EndIf
    local0 = $00
    If (0.0 >= arg0\Field26) Then
        Select arg0\Field31
            Case $07,$06
                arg0\Field15 = arg0\Field23
                arg0\Field3 = arg0\Field2
            Case $03,$05
                arg0\Field15 = arg0\Field23
        End Select
        arg0\Field29 = arg0\Field13
        arg0\Field17 = (arg0\Field29 > $00)
        arg0\Field18 = arg0\Field40
        If (arg0\Field29 = TXXDZB2ZBXX()) Then
            TX064ZDF0XD($00, arg0\Field18)
            local4 = eax_005B
            If (local4 <> Null) Then
                If (ZF2DX6X2B(arg0, local4) = $00) Then
                    X2X2D404ZD(arg0, local4)
                EndIf
                For local1 = $00 To (maxitemamount - $01) Step $01
                    If (TX60DB8XBBZ(local1) = arg0) Then
                        TX60DB8XBBZ(local1) = Null
                        Exit
                    EndIf
                Next
            Else
                For local1 = $00 To (maxitemamount - $01) Step $01
                    If (TX60DB8XBBZ(local1) = arg0) Then
                        local0 = $01
                        Exit
                    EndIf
                Next
                If (local0 = $00) Then
                    For local1 = $00 To (maxitemamount - $01) Step $01
                        If (TX60DB8XBBZ(local1) = Null) Then
                            TX60DB8XBBZ(local1) = arg0
                            Exit
                        EndIf
                    Next
                    For local1 = $00 To (maxitemamount - $01) Step $01
                        If (((TX60DB8XBBZ(local1) <> Null) And ZF2DX6X2B(arg0, TX60DB8XBBZ(local1))) <> 0) Then
                            X28B24BBZB(arg0, TX60DB8XBBZ(local1))
                            Exit
                        EndIf
                    Next
                EndIf
            EndIf
        Else
            For local1 = $00 To (maxitemamount - $01) Step $01
                If (TX60DB8XBBZ(local1) <> Null) Then
                    If (TX60DB8XBBZ(local1) = arg0) Then
                        TX60DB8XBBZ(local1) = Null
                    EndIf
                    X28B24BBZB(arg0, TX60DB8XBBZ(local1))
                EndIf
            Next
            XBZ0FD8262(arg0, Null)
        EndIf
        If (arg0\Field21 <> 0) Then
            Select arg0\Field6\Field9
                Case $27
                    T8660BZ460\Field6 = $01
                Case $28
                    T8660BZ460\Field6 = $02
                Case $26
                    T8660BZ460\Field7 = $01
                Case $74
                    T8660BZ460\Field7 = $02
            End Select
            arg0\Field21 = $00
        EndIf
    EndIf
    Return $00
End Function
