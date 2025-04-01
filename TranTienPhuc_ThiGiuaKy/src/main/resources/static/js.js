document.addEventListener('DOMContentLoaded', function() {
    const chartCanvas = document.querySelector("#chart");
    if (chartCanvas) {
        try {
            const chartContext = chartCanvas.getContext('2d');
            new Chart(chartContext, {
                type: 'line',
                data: {
                    labels: Array(11).fill('Jan'), // Tối ưu cách tạo labels
                    datasets: [
                        {
                            label: 'BTC',
                            data: [29347,33537,49631,59095,57828,36684,33572,39974,48847,48116,61004],
                            borderColor: 'red',
                            borderWidth: 2
                        },
                        {
                            label: 'ETH',
                            data: [31550,41000,88800,26000,46000,32698,5000,3000,18656,24832,36844],
                            borderColor: 'blue',
                            borderWidth: 2
                        }
                    ]
                },
                options: {
                    responsive: true
                }
            });
        } catch (error) {
            console.error('Lỗi khi khởi tạo biểu đồ:', error);
        }
    }
    const themeBtn = document.querySelector(".theme-btn");
    if (themeBtn) {
        themeBtn.addEventListener('click', () => {
            document.body.classList.toggle('dark-theme');
            const icons = themeBtn.querySelectorAll('i');
            icons.forEach(icon => icon.classList.toggle('active'));
        });
    }

    const sidebarItems = document.querySelectorAll('.sidebar a');
    if (sidebarItems.length > 0) {
        const currentPath = window.location.pathname;
        console.log(currentPath)
        sidebarItems.forEach(item => {
            if (item.pathname === currentPath) {
                item.classList.add('active');
            }
            item.addEventListener('click', function(e) {
                sidebarItems.forEach(el => el.classList.remove('active'));
                this.classList.add('active');
            });
        });
    }
});