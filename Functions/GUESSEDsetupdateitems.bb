Function GUESSEDsetupdateitems%(arg0.items)
    Local local0%
    Local local1%
    Local local2%
    Local local4.items
    If (((GUESSEDupdatexdb() = $00) Lor GUESSEDupdateanimatenpc()) <> 0) Then
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
        If (arg0\Field29 = GUESSEDupdatedropitem()) Then
            GUESSEDgetmap($00, arg0\Field18)
            local4 = eax_005B
            If (local4 <> Null) Then
                If (GUESSEDupdateobjects_38(arg0, local4) = $00) Then
                    GUESSEDupdateobjects_26(arg0, local4)
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
                        If (((TX60DB8XBBZ(local1) <> Null) And GUESSEDupdateobjects_38(arg0, TX60DB8XBBZ(local1))) <> 0) Then
                            GUESSEDupdateobjects_25(arg0, TX60DB8XBBZ(local1))
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
                    GUESSEDupdateobjects_25(arg0, TX60DB8XBBZ(local1))
                EndIf
            Next
            GUESSEDsetnullsecondinv(arg0, Null)
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
