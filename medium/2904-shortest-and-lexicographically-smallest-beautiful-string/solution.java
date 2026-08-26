                    best = s.substring(i, j + 1);
                    min = j - i + 1;
                } else if (min == j - i + 1) {
                    for (int a = 0; a < min; a++) {
                        if (best.charAt(a) != s.charAt(a + i)) {
                            if (s.charAt(a + i) == '0') {
                                best = s.substring(i, j + 1);
                                break;
                            }
                        }
                    }
                }
                if (s.charAt(i) == '1') {
                    ones--;
                }

                i++;
            }
            j++;
        }
        return best;

    }
                if (j - i + 1 < min) {
