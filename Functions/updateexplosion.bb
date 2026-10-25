Function updateexplosion%()
    Local local0%
    Local local1.events
    Local local2#
    Local local3#
    Local local4#
    If (0.0 < XZ0260X8X2\Field33) Then
        XZ0260X8X2\Field33 = (XZ0260X8X2\Field33 + fps\Field3[$00])
        If (140.0 > XZ0260X8X2\Field33) Then
            If (5.0 > (XZ0260X8X2\Field33 - fps\Field3[$00])) Then
                playsound_strict(loadtempsound("SFX\Ending\GateB\Nuke0.ogg"), $00, $00)
                For local1 = Each events
                    If (local1\Field32 = $2D) Then
                        If (local1\Field19 = playerroom) Then
                            tformpoint(4417.0, -32.0, -8116.0, local1\Field19\Field15, $00)
                            local2 = tformedx()
                            local3 = tformedy()
                            local4 = tformedz()
                            setemitter(Null, local2, local3, local4, $21)
                            setemitter(Null, local2, local3, local4, $22)
                        EndIf
                        Exit
                    EndIf
                Next
                XZ0260X8X2\Field14 = 10.0
                XZ0260X8X2\Field33 = 5.0
            EndIf
            XZ0260X8X2\Field14 = curvevalue((XZ0260X8X2\Field33 / 60.0), XZ0260X8X2\Field14, 50.0)
        Else
            XZ0260X8X2\Field14 = min((XZ0260X8X2\Field33 / 20.0), 20.0)
            If (140.0 > (XZ0260X8X2\Field33 - fps\Field3[$00])) Then
                XZ0260X8X2\Field53 = 1.0
                playsound_strict(loadtempsound("SFX\Ending\GateB\Nuke1.ogg"), $00, $00)
            EndIf
            XZ0260X8X2\Field78 = min(((XZ0260X8X2\Field33 - 140.0) / 10.0), 5.0)
            If (160.0 < XZ0260X8X2\Field33) Then
                kill($00, $01, $01, $00)
            EndIf
            If (500.0 < XZ0260X8X2\Field33) Then
                XZ0260X8X2\Field33 = 0.0
            EndIf
            If (GUESSEDupdatexdb() = $00) Then
                positionentity(XZ0260X8X2\Field74, entityx(XZ0260X8X2\Field74, $00, 1.0), 200.0, entityz(XZ0260X8X2\Field74, $00, 1.0), $00)
            EndIf
        EndIf
    EndIf
    Return $00
End Function
